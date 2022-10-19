class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int sumSoFar = 0;
        int counter = 0;
        
        hm.put(0, 1);
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            sumSoFar += nums[i];
            int key = sumSoFar - k;
            
            if(hm.containsKey(key)){
                counter += hm.get(key);
            }
            
            hm.put(sumSoFar, hm.getOrDefault(sumSoFar, 0) + 1);
        }
        return counter;
    }
};
