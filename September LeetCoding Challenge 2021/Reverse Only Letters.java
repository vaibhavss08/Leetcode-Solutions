class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        
        char[] a=s.toCharArray();
        
        while(i<j){
            char first=a[i];
            char last=a[j];
            
            if(Character.isLetter(first) && Character.isLetter(last)){
                a[j]=(char)first;
                a[i]=(char)last;
            
                i++;
                j--;
            }else if(!Character.isLetter(first)){
                i++;
            }else{
                j--;
            }
        }
        
        return new String(a);
    }
}
