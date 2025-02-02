class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        HashMap<String, List<String>> map= new HashMap<>();

        for(String originalWord: strs){
            char[] c = originalWord.toCharArray();
            Arrays.sort(c);
            String word = new String(c);
            if(!map.containsKey(word)){
                map.put(word,new ArrayList<String>());
            }
            map.get(word).add(originalWord);
        }

        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;

        
    }
}