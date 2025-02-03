class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> magazineCharacters = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            Character currentChar = magazine.charAt(i);
            magazineCharacters.put(currentChar , magazineCharacters.getOrDefault(currentChar,0) + 1);

        }

        for(int i=0; i < ransomNote.length(); i++){
            Character currentChar = ransomNote.charAt(i);
            if(!magazineCharacters.containsKey(currentChar) || magazineCharacters.get(currentChar) == 0){
                return false;
            }
            magazineCharacters.put(currentChar, magazineCharacters.get(currentChar) - 1);
        }

        return true;
        
    }
}