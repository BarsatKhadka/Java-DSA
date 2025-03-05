class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        while (!visited.contains(n)){
            visited.add(n);
            n = get_next_num(n);
            if(n ==1){
                return true;
            }
        }
        return false;

        
    }

    public static int get_next_num(int n){
        int output = 0;
        while(n>0){
            int digit = n % 10;
            output += digit * digit;
            n = n/10;
        }
        return output;
    }
}