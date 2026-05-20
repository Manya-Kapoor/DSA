class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int C[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i ++) {
            int count = 0;
            map.put(A[i], map.getOrDefault(A[i], 0) +1);
            map.put(B[i], map.getOrDefault(B[i], 0) +1);
            for(int x : map.values()) {
                if(x > 1) count++;
            }
            C[i] = count;
        }
        return C;
    }
}