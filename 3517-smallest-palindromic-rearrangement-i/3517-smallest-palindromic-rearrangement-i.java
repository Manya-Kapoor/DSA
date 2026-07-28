class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int mid = n/2;
        char chars[] = s.toCharArray();

        // Sort the first half of the array
        Arrays.sort(chars, 0, mid);
        
        // Copy the first half to the second half to make it a palindrome
        for (int i = 0; i < mid; i++) {
            chars[n - 1 - i] = chars[i];
        }

        return new String(chars);
    }
}