class Solution {
    public int hIndex(int[] citations) {
    Arrays.sort(citations);
    int length = citations.length;
    int index=0;
       while(index < length && citations[index]< length - index)
       {
           index++;
       }
    return n-index;
}
}
