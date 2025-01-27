class Solution {
    public int romanToInt(String s) {
        //The problem is more like: if there is MCMXCIV , we add 5 then -1 because 1 follows 5 and 1 is smaller and then C is 100 , since its bigger just add and
        //just keep looking at prefixes and add subtract.

        Map<String,Integer> romanNumbers = Map.of
        ("I",1,
        "V",5,
        "X",10,
        "L",50,
        "C",100,
        "D",500,
        "M",1000
        );

        Integer result = 0;
        int skipIteration = Integer.MAX_VALUE;

        for(int i=s.length() -1; i>0 ; i--){
             
            if(i == skipIteration){
                continue;
            }
            
            Integer prefixNumber = romanNumbers.get(String.valueOf(s.charAt(i-1)));
            //get Current Number
           Integer currentNumber = romanNumbers.get(String.valueOf(s.charAt(i)));
            result+= currentNumber;

           if(prefixNumber < currentNumber){
            result -= prefixNumber;
            skipIteration = i -1;
           }

        
           

        }

        if(skipIteration !=0){
            result += romanNumbers.get(String.valueOf(s.charAt(0)));
        }


        return result;
    

        
    }
}