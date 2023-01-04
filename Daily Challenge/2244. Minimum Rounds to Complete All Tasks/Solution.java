class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int n = tasks.length;

        int count = 0;
        int j = 0;
        int i = 0;

        for(;i<n;i=j){
            int val = 1;
            j = i+1;
            
            boolean f = false;
            while(j<n && tasks[i]==tasks[j]){
                val++;
                f = true;
                j++;
            }

            if(!f && j!=n) j--;

            if(val==1){
                return -1;
            }

            if(val<=3){
                count+=1;
            }else{
                if(val%3==1){
                    int add3 = (val-2)/3;
                    int add = val - add3*3;
                    count+=(add/2+ add3);

                }else{
                    count+=(val/3 + (val%3)/2);
                }
            }

        }

        // Map<Integer,Integer> map = new HashMap<>();
        // int n = tasks.length;

        // for(int i=0;i<n;i++){
        //     map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        // }

        // int count = 0;

        // for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        //     if(entry.getValue()==1) return -1;

        //     int val = entry.getValue();

        //     if(val<=3){
        //         count+=1;
        //     }else{
        //         if(val%3==1){
        //             int add3 = (val-2)/3;
        //             int add = val - add3*3;
        //             count+=(add/2+ add3);

        //         }else{
        //             count+=(val/3 + (val%3)/2);
        //         }
        //     }
        // }

        return count;
    }
}
