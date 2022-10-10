class Solution {
public:
    string sortSentence(string s) {
        string words;
        vector<string>v(10);
        
        for(int i = 0; i < s.size(); i++){
            if(s[i] > 47 && s[i] <58){
                v[s[i] - 48] = words + " ";
                words = "";
                i++;
            }
            else
                words +=s[i];
        }
        
        string result;
        for(string word : v){
            result += word;    
        }
        
        result.pop_back();
        return result;
    }
};
