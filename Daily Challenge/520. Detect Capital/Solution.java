class Solution {
    public boolean detectCapitalUse(String word) {

        int Ccount = 0;
        int Scount = 0;
        boolean first = false;

        for(int i=0;i<word.length();i++){   
            char ch = word.charAt(i);

            if((ch-'A')>=0 && (ch-'Z')<=0){
                Ccount++;
                if(i==0){
                    first = true;
                }
            }else if((ch-'a')>=0 && (ch-'z')<=0){
                Scount++;
            }
            
        }

        if(Scount== word.length() || Ccount==word.length() || (first && Scount==word.length()-1)){
            return true;
        }

        return false;
    }
}
