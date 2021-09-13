class Solution {
    public int maxNumberOfBalloons(String text) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int n =text.length();
        
        for(int i=0;i<n;i++){
            if(map.containsKey(text.charAt(i))){
                map.put(text.charAt(i),map.get(text.charAt(i))+1);
            }else{
                map.put(text.charAt(i),1);
            }
        }
        
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
        
        int min = Integer.MAX_VALUE;
        
        HashMap<Character,Integer> check = new HashMap<>();
        check.put('b',1);
        check.put('a',1);
        check.put('l',2);
        check.put('o',2);
        check.put('n',1);

            for(Map.Entry<Character,Integer> entry:check.entrySet()){
                if(map.containsKey(entry.getKey()) && entry.getValue()<=map.get(entry.getKey())){
                    min=Math.min(min,map.get(entry.getKey())/entry.getValue());
                }else{
                    min=0;
                    break;
                }
            }
        
        return min==Integer.MAX_VALUE?0:min;
    }
}
