class Solution {
    public int maxProduct(int n) {
        int max1 = -1;
        int max2 = -1;
        int[] freqArr = new int[10];

        while(n != 0) {
            int digit = n%10;
            freqArr[digit]++;
            n /= 10;
        }
        for(int i = 9 ; i >= 0 ; i--){
            if(freqArr[i] >= 2 && (max1 == -1 && max2 == -1)){
                max1 = i;
                max2 = i;
                break;
            }
            if(freqArr[i] > 0){
                max1 = max1 == -1 ? i : max1;
                max2 = max2 == -1 && max1 != i ? i : max2;
            }
        }
        return max1 * max2;
    }
}