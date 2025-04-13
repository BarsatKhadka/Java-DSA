class Solution {
    public String minWindow(String s, String t) {
        if(t.equals(s)){
            return t;
        }

        HashMap<Character,Integer> tMap = new HashMap<>();
        for(char tc : t.toCharArray()){
            tMap.put(tc,tMap.getOrDefault(tc,0) + 1);
        }
        
        HashMap<Character,Integer> currWindow = new HashMap<>();
        
        int []res = {-1,-1};
        long resLength = Long.MAX_VALUE;

        int have = 0;
        int need = tMap.size();
        int left = 0;
        int right = s.length();
        for(int i=0; i<right; i++){
            char c = s.charAt(i);
            currWindow.put(c, currWindow.getOrDefault(c,0) + 1);
            if(tMap.containsKey(c) && tMap.get(c).equals(currWindow.get(c))){
                have++;
            }

            while (have == need){
                if((i - left + 1) < resLength){
                    res[0] = left;
                    res[1] = i;
                    resLength = i - left + 1;
                    }
                char leftC = s.charAt(left);
                currWindow.put(leftC , currWindow.get(leftC) -1 );
                if(tMap.containsKey(leftC) && currWindow.get(leftC) < tMap.get(leftC)){
                    have--;
                }
                left++; 

            }
        }
        if(resLength != Long.MAX_VALUE){
            return s.substring(res[0] , res[1] + 1);
        }

        return "";
    }
}