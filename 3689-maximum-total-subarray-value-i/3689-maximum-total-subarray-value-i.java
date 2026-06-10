class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        return (long) (max - min) * k;
    }
}