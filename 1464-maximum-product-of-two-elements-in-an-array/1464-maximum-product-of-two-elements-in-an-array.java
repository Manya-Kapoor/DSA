class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : nums) {
            pq.offer(x);
            if(pq.size() > 2) {
                pq.poll();
            }
        }
        int res = pq.peek()-1;
        pq.poll();
        res*=(pq.peek()-1);
        return res;
    }
}