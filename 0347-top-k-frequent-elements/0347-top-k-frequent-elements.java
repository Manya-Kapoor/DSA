class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap + Max Heap
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);

        // max-heap: highest frequency on top
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> freq.get(b) - freq.get(a));
        pq.addAll(freq.keySet());

        int[] result = new int[k];
        for (int i = 0; i < k; i++)
            result[i] = pq.poll(); // poll K times
        return result;
    }
}
// Min heap ki jagah max heap use karo — saare elements daalo, phir sirf K baar poll karo. Top K elements seedha nikal aayenge. Simple hai lekin O(N log N) space aur time lagta hai kyunki poora heap banta hai.
// Time: O(N log N)
// Space: O(N)