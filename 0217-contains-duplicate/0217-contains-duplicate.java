class Solution {
    public boolean containsDuplicate(int[] nums) {
        // USING HASHSET
        // Create a hashset to store elements from array
        HashSet<Integer> seenNumbers = new HashSet<>();
        // iterate thru each element in array
        for(int num : nums) {
            // check if elemnent is already in hashset
            if(seenNumbers.contains(num)) {
                return true; // duplicate found
            }
            // add number in hashset
            seenNumbers.add(num);
        }
        return false; // no duplicates found
    }
}

// TC = O(n)
// SC = O(n)