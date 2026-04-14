class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // USING SORTING
        // Ye ek hashmap banata hai jahan key sorted string hogi, aur value us sorted form wale saare original strings ki list hogi.
        HashMap<String, List<String>> map = new HashMap<>();
        // Ye loop input array strs ki har string ko ek-ek karke traverse karta hai.
        for (String str : strs) {
            char chars[] = str.toCharArray(); // Current string str ko character array me convert kar rahe hain, taki uske characters sort kar sakein.
            Arrays.sort(chars); // Character array ko sort kar diya. Anagrams sort hone ke baad same string ban jaati hain.
            String key = new String(chars); // Sorted character array ko wapas string me convert kiya, aur usse group banane wali key bana liya.
            map.putIfAbsent(key, new ArrayList<>()); // Agar ye key hashmap me pehle se nahi hai, to uske liye ek nayi empty list create kar do.
            map.get(key).add(str); // Ab current original string str ko us key wali list me add kar do.
        }
        return new ArrayList<>(map.values()); // Hashmap ki saari grouped lists ko nikal ke List<List<String>> ke form me return kar diya.
    }
}

//   Time Complexity: O(n * k log k)
//   Space Complexity: O(n * k)