import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //SORT BY FREQ USING HASHMAP
        // Step 1: Count frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort unique elements by frequency (descending)
        List<Integer> keys = new ArrayList<>(freqMap.keySet());
        keys.sort((a, b) -> freqMap.get(b) - freqMap.get(a));

        // Step 3: Pick top k
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = keys.get(i);
        }

        return result;
    }
}