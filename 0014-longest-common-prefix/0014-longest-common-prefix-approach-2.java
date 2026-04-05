class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // Edge case: agar array empty ya null hai
        if (strs == null || strs.length == 0) return "";

        // Step 1: first string ko initial prefix maan lo
        String prefix = strs[0];

        // Step 2: baaki sab strings ke saath compare karo
        for (int i = 1; i < strs.length; i++) {

            // Jab tak current string prefix se start nahi hoti
            while (strs[i].indexOf(prefix) != 0) {

                // prefix ko ek character se chhota karte jao (right se trim)
                prefix = prefix.substring(0, prefix.length() - 1);

                // Agar prefix empty ho gaya → koi common prefix nahi
                if (prefix.isEmpty()) return "";
            }
        }

        // Final prefix return karo
        return prefix;
    }
}

// Explanation - Is approach mein hum pehli string ko initial prefix maan lete hain. Phir baaki sab strings ke saath compare karte hain ki kya wo iss prefix se start ho rahi hain ya nahi. Agar koi string prefix se match nahi karti, toh hum prefix ko thoda chhota kar dete hain (last character hata ke) aur dobara check karte hain. Yeh process tab tak chalta hai jab tak prefix match na ho jaye ya completely empty na ho jaye. End mein jo prefix bachta hai, wahi sab strings ka longest common prefix hota hai.
// TC = O(m * n)  (m = length of prefix/1st string, n = number of strings)
// SC = O(1)      (no extra space used, only prefix variable)
