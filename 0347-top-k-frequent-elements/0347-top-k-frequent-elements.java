class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // BUCKET SORT
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);

        // bucket index = frequency (max freq = n)
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : freq.keySet()) {
            int f = freq.get(key);
            if (bucket[f] == null)
                bucket[f] = new ArrayList<>();
            bucket[f].add(key);
        }

        // collect top K from right (highest freq) to left
        int[] result = new int[k];
        int idx = 0;
        for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {
            if (bucket[i] != null)
                for (int num : bucket[i])
                    if (idx < k)
                        result[idx++] = num;
        }
        return result;
    }
}
// Key insight: frequency kabhi bhi N se zyada nahi ho sakti. Toh N+1 size ka bucket array banao jahan index = frequency. Phir right se left traverse karo aur top K elements nikalo — sorting hi nahi chahiye!
// Input [1,1,1,2,2,3] → bucket[3]=[1], bucket[2]=[2], bucket[1]=[3]
// Time: O(N)
// Space: O(N)