class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, j, k = 1, res = 0;
        int n = nums.length;
        for (j = 0; j < n ; ++j) {
            if (nums[j] == 0) {
                k--;
            }
            while (k < 0) {
                if (nums[i] == 0) {
                    k++;
                }
                i++;
            }
            res = Math.max(res, j - i);
        }
        return res;
    }
    }
