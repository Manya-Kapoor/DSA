class Solution {
    public int numberOfSteps(int num) {
        if (num <= 2) return num;
        int count = 0;
        while(num > 0) {
            count += (num%2)+1;
            num/=2;
        }
        return count-1;
    }
}