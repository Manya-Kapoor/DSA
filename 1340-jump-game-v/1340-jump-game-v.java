class Solution {
    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        int ans = 0;
        Integer[] dp = new Integer[n];
        for(int i = 0; i < n; i++){
            int curr = solve(i, arr, d, dp);
            ans = Math.max(ans, curr);
        }
        return ans;
    }
    public int solve(int idx, int[] arr, int d, Integer[] dp){
        if(dp[idx] != null) {
            return dp[idx];
        }

        int ans = 1;

        for(int i = idx + 1; i <= Math.min(idx + d, arr.length - 1); i++) {
            if(arr[i] >= arr[idx]) {
                break;
            }
            ans = Math.max(ans, 1 + solve(i, arr, d, dp));
        }

        for(int i = idx - 1; i >= Math.max(0, idx - d); i--) {
            if(arr[i] >= arr[idx]) {
                break;
            }
            ans = Math.max(ans, 1 + solve(i, arr, d, dp));
        }

        return dp[idx] = ans;
    }
}