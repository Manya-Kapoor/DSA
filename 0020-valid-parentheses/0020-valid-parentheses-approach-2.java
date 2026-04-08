class Solution {
    public boolean isValid(String s) {
        // HASHMAP + STACK APPROACH
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '('); // map each closing bracket to the opening bracket it expects
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) { // to read the character
            if (!map.containsKey(ch)) { // if it is an opening bracket
                stack.push(ch); // push it in stack
            } else { // if its a closing bracket
                if (stack.isEmpty()) { // If the stack is empty, return false
                    return false;
                }
                char top = stack.pop(); // Otherwise pop the top of the stack
                if (top != map.get(ch)) { // Check whether it matches the opening bracket required by the hashmap
                    return false; // if not return false
                }

            }
        }
        return stack.isEmpty();
    }
}

// Explanation - Is approach me hum stack aur hashmap use karte hain. Jab bhi opening bracket like (, {, [ mile, usse stack me push kar dete hain. Hashmap ka kaam hota hai batana ki har closing bracket ), }, ] kis opening bracket ke saath match hona chahiye. Ab jab closing bracket mile, to stack ke top se check karte hain ki correct opening bracket hai ya nahi. Agar stack empty ho ya match galat ho, to string invalid hai. End me agar stack empty bachti hai, matlab saare brackets sahi order me close hue hain, to answer valid hoga.

// TC : O(n) because har character ko ek hi baar traverse karte hain.
// SC : O(n) because worst case me saare opening brackets stack me store ho sakte hain.