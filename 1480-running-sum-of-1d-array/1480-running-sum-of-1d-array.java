class Solution {
    public int[] runningSum(int[] nums) {
        // PREFIX SUM (inplace)
        
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}