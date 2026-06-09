class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return ((long) max-min)*k;
    }
}