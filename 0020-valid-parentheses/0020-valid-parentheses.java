class Solution {
    public boolean isValid(String s) {
        // USING STACK
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // accessing each element in string
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (!stack.isEmpty() && stack.peek() == '(' && ch == ')') {
                stack.pop();
            } else if (!stack.isEmpty() && stack.peek() == '{' && ch == '}') {
                stack.pop();
            } else if (!stack.isEmpty() && stack.peek() == '[' && ch == ']') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

// Explanation - Is problem ka simple sa approach hai stack use karna. Jab bhi string me opening brackets (, {, [ mile, unhe stack me push kar do, aur jab closing brackets aaye toh check karo ki stack empty toh nahi hai aur uska top matching opening bracket hai ya nahi—agar match karta hai toh pop kar do, warna string invalid ho jaati hai. End tak traverse karne ke baad agar stack empty ho, matlab saare brackets sahi order me close hue hain, toh answer true hoga; warna false.
// TC : O(n) — ek hi baar poori string traverse karte hain.
// SC : O(n) — worst case me saare opening brackets stack me store ho sakte hain.