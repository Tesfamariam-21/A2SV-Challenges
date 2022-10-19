class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            sum +=nums[i];
            
            while(sum >= target){
                result = Math.min(result, i+1-l);
                sum -= nums[l];
                l++;
            }
        }
        
        return (result != Integer.MAX_VALUE) ? result : 0;
    }
}
