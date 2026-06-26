class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];

        int left = 0;
        int right = n - 1;
        int p = n - 1;

        while (left <= right) {
            int rightSq = nums[right] * nums[right];
            int leftSq = nums[left] * nums[left];

            if (leftSq > rightSq) {
                res[p] = leftSq;
                left++;
            } else {
                res[p] = rightSq;
                right--;
            }
            p--;
        }
        return res;
    }
}