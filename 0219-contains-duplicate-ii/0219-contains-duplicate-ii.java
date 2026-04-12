class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // USING SLIDING WINDOW (HASHSET)
        Set<Integer> set = new HashSet<>(); // create hashset to store
        for (int i = 0; i < nums.length; i++) { // iterate given input array
            if (set.contains(nums[i])) // does set contains current value?
                return true;
            set.add(nums[i]); // else add that entry to hashset
            if (set.size() > k) { // if set ka size exceeds k
                set.remove(nums[i - k]); // then remove the earliest entry inside hashset (nums[curr_idx - k]) ...thus containg only k elements
            }
        }
        return false;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(k)