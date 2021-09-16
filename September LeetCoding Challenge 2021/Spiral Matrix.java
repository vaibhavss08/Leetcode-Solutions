class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        int l=0;
        int r=m-1;
        int u=0;
        int d=n-1;
        int count=n*m;
        int a=0;
        
        List<Integer> ans = new ArrayList<>();
        
        while(a<count){
            
            for(int i=l;i<=r && a<count;i++){
                ans.add(matrix[u][i]);
                a++;
            }
            u++;
            
            for(int i=u;i<=d && a<count;i++){
                ans.add(matrix[i][r]);
                a++;
            }
            r--;
            
            for(int i=r;i>=l && a<count;i--){
                ans.add(matrix[d][i]);
                a++;
            }
            d--;
            
            for(int i=d;i>=u && a<count;i--){
                ans.add(matrix[i][l]);
                a++;
            }
            l++;
        }
        
        return ans;
    }
}
