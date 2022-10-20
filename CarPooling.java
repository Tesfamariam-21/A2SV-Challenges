class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] tripLength = new int[1001];
        
        for(int t[] : trips){
            tripLength[t[1]] += t[0];
            tripLength[t[2]] -= t[0];
        }
        
        for(int num : tripLength){
            capacity -= num;
            if(capacity < 0) {return false;}
        }
        return true;
    }
}
