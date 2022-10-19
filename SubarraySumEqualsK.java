class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int curSum = 0;
        int counter = 0;
        hm.put(0,1);
        
        for(int i = 0; i < nums.length; i++){
            curSum += nums[i];
            int ps2 =curSum -k;
            if(hm.containsKey(ps2)){
                counter += hm.get(ps2);
            }
            hm.put(curSum, hm.getOrDefault(curSum, 0) + 1);
        }
        return counter;
    }
}
