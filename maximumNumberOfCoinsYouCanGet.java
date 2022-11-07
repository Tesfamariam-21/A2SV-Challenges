class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int counter = piles.length /3;
        int pointer = piles .length - 2;
        int   ans = 0;
        while(counter > 0){
            
          ans+= piles[pointer];
          pointer-=2;
          counter--;
            
        }
        return ans;
    }
}
