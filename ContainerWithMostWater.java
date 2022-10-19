class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        int l = 0;
        int r = n -1;
        
        while(l < r){
            int area = (r - l) * Math.min(height[r], height[l]);
            max = Math.max(max, area);
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
       return max;
    }
}
