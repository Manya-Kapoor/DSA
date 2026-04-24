class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // HASHMAP
        HashMap<Integer, Integer> map = new HashMap<>(); // to store each number and its index 
        int res[] = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            // Check if this complement exists in the hash map. If it does, then the current number and the number corresponding to the complement form the required pair.
            if (map.containsKey(complement)) {
                res[0] = map.get(complement) + 1;
                res[1] = i + 1;
                return res;
            }
            map.put(numbers[i], i); //  If the complement is not found, add the current number and its index to the hash map and continue.
        }
        return new int[] { -1, -1 };
    }
}
// Time complexity: O(n)-  Each element is processed once, and hash map operations (insertion and lookup) are O(1) on average.
// Space complexity: O(n) -  In the worst case, all n elements are stored in the hash map.