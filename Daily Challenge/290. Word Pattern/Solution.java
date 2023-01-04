class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split("\\s+");
        
        if(split.length!=pattern.length()) return false;

        int n = pattern.length();

        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            char ch = pattern.charAt(i);
            visited[i] = true;

            for(int j=i+1;j<n;j++){
                if(visited[j]) continue;
                if(ch == pattern.charAt(j)){
                    if(!split[j].equals(split[i])){
                        return false;
                    }

                    visited[j] = true;
                }
            }

        }

        visited = new boolean[n];
        for(int i=0;i<n;i++){
            String st = split[i];
            visited[i] = true;

            for(int j=i+1;j<n;j++){
                if(visited[j]) continue;
                    if(split[j].equals(split[i])){
                        if(pattern.charAt(i) != pattern.charAt(j)){
                            return false;
                        }
                        visited[j] = true;
                    }
            }

        }
        return true;

    }
}
