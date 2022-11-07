class Solution {
  public int minIncrementForUnique(int[] arr) {
        Arrays.sort(arr);
        int res = 0, need = 0;
        for (int a : arr) {
            res += Math.max(need - a, 0);
            need = Math.max(a, need) + 1;
        }
        return res;
    }
}
