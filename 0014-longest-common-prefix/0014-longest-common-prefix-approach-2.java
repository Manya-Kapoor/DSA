class Solution {
    public String longestCommonPrefix(String[] strs) {
        // VERTICAL SCANNING

        if (strs.length == 0 || strs == null) // if array mein koi string na ho string ya khali string ho
            return "";
        for (int i = 0; i < strs[0].length(); i++) { // iterating 1st word
            char ch = strs[0].charAt(i); // char at i in 1st word (accessing each character in 1st word)
            for (int j = 1; j < strs.length; j++) { // accessing words that are after 1st word
                if (i == strs[j].length() || strs[j].charAt(i) != ch) { // if i == 2nd word ki length || is char at i in 2nd word != char in 1st word
                    return strs[0].substring(0, i); // characters gone thru till now in 1st word (return 1st word ki substring from 0th char to 1st index char)
                }
            }
        }
        return strs[0];  // if nothing is returned till now then entire 1st word is the common prefix
    }
}

// Explanation - Hum pehle check karte hain ki array empty toh nahi hai. Phir hum first string ko base maan ke uske har character par iterate karte hain. Har position i ke liye, us character ko baaki sab strings ke same position ke character se compare karte hain. Agar kisi bhi string mein ya toh length chhoti pad jaye (i == length) ya character match na kare, toh wahin tak ka prefix common hai, isliye substring(0, i) return kar dete hain. Agar poori first string bina mismatch ke traverse ho gayi, toh matlab wahi poora string common prefix hai, isliye usse return kar dete hain.
// TC = O(m.n) (m = no. of char in 1st word, n = no. of words present in input array)
// SC = O(1) (no extra space used)
