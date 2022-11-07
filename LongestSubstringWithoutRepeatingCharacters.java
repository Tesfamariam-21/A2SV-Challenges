class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int maxLen = 0;
        int[] pos = new int[128];

        int start = 0, end = 0;

        for (char ch : s.toCharArray())
        {
            start  = Math.max(start, pos[ch]);
            maxLen = Math.max(maxLen, end-start+1);

            pos[ch] = end + 1;
            end++;
        }

        return maxLen;
    }
}
