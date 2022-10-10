class Solution {
    public void sortColors(int[] nums) {
       if(nums.length == 0 || nums.length == 1)
           return;
        
        first = 0;
        last = nums.length -1;
        position = 0;
        
        while(position <= last && first < last){
            if(nums[position] == 0){
                nums[position] = nums[first]
                nums[first] = 0;
                first++;
                position++;
            }
            else if(nums[position] = 2){
                nums[position] = nums[last];
                nums[last] = 2;
                last--;
            }
            else{
                index++;
            }
        }
    }
} 
