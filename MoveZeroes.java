class Solution {
    public void moveZeroes(int[] nums) {
        int L = 0, R = 0;
        int N = nums.length;
        while(R < N){
            if(nums[L] != 0){
                L++;
                R++; 
            }
            else if(nums[R] == 0){
                R++;
            }
    
            else{
                int temp = nums[R];
                nums[R] = nums[L];
                nums[L] = temp;
            }
        }
    }
}
