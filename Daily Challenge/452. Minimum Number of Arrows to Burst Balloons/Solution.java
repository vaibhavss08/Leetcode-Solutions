class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (int[]a, int[]b) -> a[0]-b[0]);

        int n = points.length;

        int i=0,j=0,count=0;

        for(;i<n;i=j){
            int low = points[i][0];
            int high = points[i][1];
            j = i+1;

            while(j<n && points[j][1]>=low && points[j][0]<=high){
                low = points[j][0];
                high = Math.min(points[j][1],high);
                j++;
            }

            count++;
        }

        return count;

    }
}
