class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList();
        int l = 0;
        int r = 0;
        int count = p.length();
        
        if(s.length() == 0 || s == null) return result;
        
        int[] char_count = new int[26];
        
        for(char c : p.toCharArray()){
            char_count[c-'a']++;
        }
        
        while(r < s.length()){
            if(char_count[s.charAt(r++)-'a']-- >= 1) count--;
            
            if(count == 0) result.add(l);
            
            if(r - l == p.length() && char_count[s.charAt(l++) - 'a']++ >= 0) count++;
        }
        
        return result;
        
    }
}
