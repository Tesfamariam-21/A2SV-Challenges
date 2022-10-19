class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        int n = nums.length;
        int total_sum = 0;
        
        for(int i = 0; i < n; i++){
            total_sum += nums[i];
       } 
        
        for(int i = 0; i < n; i++){
            if(i != 0)sumLeft += nums[i -1];
            if(total_sum - sumLeft - nums[i] == sumLeft){
                return i;
            }
        }
        
        return -1;
    }
}
