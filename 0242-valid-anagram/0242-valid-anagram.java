class Solution {
    public boolean isAnagram(String s, String t) {
        // USING COUNTING
        // if lengths are diff they cant be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        // arr to count char freq assuming only lowercase chars
        int charCount[] = new int[26];
        // increment count for each char in s and decrement for each char in t
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        // check if all counts are 0
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}

// TC = O(n)
// SC = O(1)