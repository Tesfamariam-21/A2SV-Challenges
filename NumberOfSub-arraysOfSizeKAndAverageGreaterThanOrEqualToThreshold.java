class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0; 
        int s = 0;
		int t = k * threshold;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i]; 
            if (i < k - 1) continue;  
            if (i > k - 1) s -= arr[i - k];  
            if (s >= t) count++;  
        }
        return count;
    } 
}
