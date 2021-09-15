class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n =arr.length;
        int max=1;
        int flag=-1;
        int temp=1;
        
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i] && flag!=1){
                temp++;
                flag=1;
            }else if(arr[i-1]<arr[i] && flag!=0){
                temp++;
                flag=0;
            }else{
                if(arr[i-1]==arr[i]){
                    temp=1;
                    flag=-1;
                }else{
                    temp=2;
                }
            }
            
            max=Math.max(max,temp);
        }
        
        return max;
    }
}
