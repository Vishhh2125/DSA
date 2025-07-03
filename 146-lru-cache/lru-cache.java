class LRUCache {

    private Node head;
    private Node tail;
    private int size;
    private int capacity;
    private HashMap<Integer, Node> map;

    LRUCache(int capacity) {
        this.capacity = capacity;
        tail = new Node(-1, -1);
        head = new Node(-1, -1);

        tail.prev = head;
        head.next = tail;
        map = new HashMap<>();
    }

    private class Node {
        int val;
        int key;
        Node next;
        Node prev;

        public Node(int key, int val) {
            this.next = null;
            this.prev = null;
            this.val = val;
            this.key = key;
        }
    }

    Node addHead(int key, int val, Node current) {
        if (current == null) {
            // New node
            Node temp = new Node(key, val);
            temp.next = head.next;
            head.next = temp;
            temp.next.prev = temp;
            temp.prev = head;
            size++;
            return temp;
        } else {
            // Update value
            current.val = val;

            // Detach from current position
            current.prev.next = current.next;
            current.next.prev = current.prev;

            // Add to head
            current.next = head.next;
            head.next = current;
            current.next.prev = current;
            current.prev = head;
            return current;
        }
    }

    Node deleteLast() {
        Node current = tail.prev;

        current.prev.next = tail;
        tail.prev = current.prev;
        size--;

        return current; // return full node so we get key
    }

   

    public int get(int key) {
        Node current = map.get(key);

        if (current == null) {
            return -1;
        } else {
            
            Node newNode = addHead(current.key, current.val, current);
            map.put(key, newNode); // re-update in map
            return current.val;
        }
    }

    public void put(int key, int value) {
        Node current = map.get(key);

        if (size == capacity && current == null) {
            Node last = deleteLast();
            map.remove(last.key);
        }

        Node newNode = addHead(key, value, current);
        map.put(key, newNode);
    }
}
