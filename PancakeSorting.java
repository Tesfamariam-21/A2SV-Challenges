class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int x = arr.length, i; x > 0; --x) {
            for (i = 0; arr[i] != x; ++i);
            reverse(arr, i + 1);
            res.add(i + 1);
            reverse(arr, x);
            res.add(x);
        }
        return res;
    }

    public void reverse(int[] arr, int k) {
        for (int i = 0, j = k - 1; i < j; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
}
