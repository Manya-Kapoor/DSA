class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // HASHMAP (last-seen-index approach)
        Map<Integer, Integer> map = new HashMap<>(); // create hashmap to store nums[i] as key and curr_index as value
        for (int i = 0; i < nums.length; i++) {
            //  if curr_num already exists in map and distance between current index and previous index is at most k
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }

            map.put(nums[i], i); // This updates the latest index of current number coz When you see the same number again, storing the latest index helps compare with the nearest duplicate, which is what matters.
        }

        return false;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)