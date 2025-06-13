class Solution {
    public long zeroFilledSubarray(int[] nums) {
        List<Integer> numOfZeros = zeroRuns(nums);
        long subarrayCount = 0;
        for(int i: numOfZeros){
            subarrayCount += ((long) i * (i+1)) /2;
        }
        return subarrayCount;
        
    }

    public static List<Integer> zeroRuns(int []arr){
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for(int n:arr){
            if(n == 0){
                count++;
            }
            else{
                    if(count > 0){
                        result.add(count);
                        count = 0;
                    }
                
            }
        }
         if(count > 0){
                result.add(count);
            }

        return result;

    }
}