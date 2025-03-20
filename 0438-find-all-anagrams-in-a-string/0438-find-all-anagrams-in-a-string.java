class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if(p.length() > s.length()){
            return result;
        }
        HashMap<Character,Integer> pMap = new HashMap<>();
        HashMap<Character,Integer> sMap = new HashMap<>();

        for(int i=0; i<p.length(); i++){
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i) , 0) + 1);
            sMap.put(s.charAt(i) , sMap.getOrDefault(s.charAt(i) , 0) + 1);
        }

        if(pMap.equals(sMap)){
            result.add(0);
        }

        for(int i=1; i<=s.length()-p.length(); i++){
            char incoming = s.charAt(i + p.length() - 1);
            char outgoing = s.charAt(i-1);

            int matchCount = 0;

            sMap.put(outgoing , sMap.get(outgoing) - 1);
            if(sMap.get(outgoing) == 0){
                sMap.remove(outgoing);
            }
            sMap.put(incoming, sMap.getOrDefault(incoming, 0) + 1);

            for(Character c: pMap.keySet()){
                if(sMap.containsKey(c) && sMap.get(c).equals(pMap.get(c))){
                    matchCount++;
                }
            }

            if(matchCount == pMap.size()){
                result.add(i);
            }
            
        }

        return result;

      
    }
}