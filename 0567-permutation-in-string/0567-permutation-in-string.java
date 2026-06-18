class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Sliding window + hashmap
        if (s1.length() > s2.length())
            return false;

        // frequency maps (arrays)
        int s1map[] = new int[26];
        int s2map[] = new int[26];

        // intitialise freq map for s1 and first window of s2
        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
            s2map[s2.charAt(i) - 'a']++;
        }

        // slide the window through s2  and compare the maps
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1map, s2map)) {
                return true;
            }
            s2map[s2.charAt(i + s1.length()) - 'a']++; // add new character to window
            s2map[s2.charAt(i) - 'a']--; // remove old character from window
        }

        //check last window
        return matches(s1map, s2map);
    }

    private boolean matches(int s1map[], int s2map[]) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i]) {
                return false;
            }
        }
        return true;
    }
}