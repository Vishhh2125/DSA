class RideSharingSystem {



    Deque<Integer> r;
    Deque<Integer> d;
    Set<Integer> cancelled ;
    Set<Integer> present ;
    //means the riderid in queue or not 




    public RideSharingSystem() {
         r = new ArrayDeque<>();
         d= new ArrayDeque<>();
         cancelled = new HashSet<>();
         present = new HashSet<>();
        
    }
    
    public void addRider(int riderId) {
        r.offer(riderId);
        present.add(riderId);

        
    }
    
    public void addDriver(int driverId) {
        d.offer(driverId);
        
    }
    
    public int[] matchDriverWithRider() {
        
        while( !r.isEmpty() && cancelled.contains(r.peek())){
            //so rider cance came but he is in cancelled list just ignore him and remove him from cancelled 
            cancelled.remove(r.peek());
            present.remove(r.peek());
            r.poll();
        }
        if(r.isEmpty() || d.isEmpty()) return new int[]{-1,-1}; 

        return new int []{d.poll(),r.poll()};
        
    }
    
    public void cancelRider(int riderId) {
        if(present.contains(riderId)){
        cancelled.add(riderId);

        }
        
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */