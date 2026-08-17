import java.util.HashMap;
import java.util.Map;

class LFUCache {

    // =====================================================
    // 1. Node
    // =====================================================

    class Node {
        int key;
        int value;
        int freq;

        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1;
        }
    }


    // =====================================================
    // 2. Doubly Linked List
    // =====================================================

    class DLL {

        Node head;
        Node tail;

        DLL() {

            // Dummy nodes
            head = new Node(0, 0);
            tail = new Node(0, 0);

            // Initially:
            // HEAD <-> TAIL

            head.next = tail;
            tail.prev = head;
        }


        // Add node immediately after head
        // Therefore node becomes MRU
        void addNode(Node node) {

            node.next = head.next;
            node.prev = head;

            head.next.prev = node;
            head.next = node;
        }


        // Remove node from its current position
        void removeNode(Node node) {

            node.prev.next = node.next;
            node.next.prev = node.prev;
        }


        // Remove LRU node
        // LRU = node immediately before tail
        Node removeLast() {

            if (head.next == tail) {
                return null;
            }

            Node node = tail.prev;

            removeNode(node);

            return node;
        }


        // Check whether DLL is empty
        boolean isEmpty() {

            return head.next == tail;
        }
    }


    // =====================================================
    // 3. LFU Cache variables
    // =====================================================

    // key -> exact Node
    Map<Integer, Node> keyMap;

    // frequency -> DLL
    Map<Integer, DLL> freqMap;

    int capacity;
    int size;

    // Lowest frequency currently present
    int minFreq;


    // =====================================================
    // 4. Constructor
    // =====================================================

    public LFUCache(int capacity) {

        this.capacity = capacity;

        keyMap = new HashMap<>();
        freqMap = new HashMap<>();

        size = 0;
        minFreq = 0;
    }


    // =====================================================
    // 5. GET
    // =====================================================

    public int get(int key) {

        // Key doesn't exist
        if (!keyMap.containsKey(key)) {
            return -1;
        }

        // Get exact node in O(1)
        Node node = keyMap.get(key);

        // Accessing node increases its frequency
        increaseFrequency(node);

        return node.value;
    }


    // =====================================================
    // 6. PUT
    // =====================================================

    public void put(int key, int value) {

        // Capacity = 0
        if (capacity == 0) {
            return;
        }


        // =================================================
        // CASE 1: Key already exists
        // =================================================

        if (keyMap.containsKey(key)) {

            Node node = keyMap.get(key);

            // Update value
            node.value = value;

            // Updating existing key counts as usage
            increaseFrequency(node);

            return;
        }


        // =================================================
        // CASE 2: New key
        // =================================================

        /*
         * IMPORTANT:
         *
         * If cache is full, we MUST evict FIRST.
         *
         * We use the CURRENT minFreq to find the LFU node.
         *
         * Only AFTER eviction do we create the new node
         * and set minFreq = 1.
         */

        if (size == capacity) {

            // Get DLL containing current minimum frequency
            DLL list = freqMap.get(minFreq);

            // Remove LRU node from that frequency
            Node lru = list.removeLast();

            // Remove it from HashMap
            keyMap.remove(lru.key);

            size--;
        }


        // =================================================
        // Create new node
        // =================================================

        Node node = new Node(key, value);

        // Store key -> Node
        keyMap.put(key, node);


        // New nodes always start with frequency 1
        DLL list = freqMap.computeIfAbsent(
            1,
            k -> new DLL()
        );

        list.addNode(node);


        // New node has frequency 1
        // Therefore minimum frequency is now 1
        minFreq = 1;

        size++;
    }


    // =====================================================
    // 7. Increase Frequency
    // =====================================================

    private void increaseFrequency(Node node) {

        // Current frequency
        int oldFreq = node.freq;


        // =================================================
        // Remove from old frequency DLL
        // =================================================

        DLL oldList = freqMap.get(oldFreq);

        oldList.removeNode(node);


        // =================================================
        // Update minFreq
        // =================================================

        /*
         * If this was the minimum frequency
         * AND that frequency list became empty,
         * the minimum frequency increases by 1.
         *
         * Example:
         *
         * freq 1 -> A
         * freq 2 -> B
         *
         * get(A)
         *
         * freq 1 -> EMPTY
         * freq 2 -> B
         *
         * A will also move to freq 2.
         *
         * Therefore minFreq becomes 2.
         */

        if (oldFreq == minFreq && oldList.isEmpty()) {

            minFreq++;
        }


        // =================================================
        // Increase node frequency
        // =================================================

        node.freq++;


        // =================================================
        // Add node to new frequency DLL
        // =================================================

        DLL newList = freqMap.computeIfAbsent(
            node.freq,
            k -> new DLL()
        );

        // Add at front → MRU within this frequency
        newList.addNode(node);
    }
}