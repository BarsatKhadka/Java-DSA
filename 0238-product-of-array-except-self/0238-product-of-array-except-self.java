class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int []prefix = new int[n];
        int []suffix = new int[n];

    //first prefix will always be 1 because we will multiply suffix by it 
        prefix[0] = 1;

        //same for suffix last item. it will only have prefix.
        suffix[n-1] = 1;
        

        //i am amazed how we use previous numbers multiplications. First we go 1 then store it in prefix then multiply by that number in nums. Amazing
        for(int i=1; i < nums.length ; i++){
            prefix[i] = prefix[i-1] * nums[i-1]; 
        }

        //same logic for suffix
        for (int i=n-2; i>=0; i-- ){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        int []results = new int[n];

        for(int i=0; i <prefix.length; i++){
            results[i] = prefix[i] * suffix[i];

        }



        return results;

        


        

        
    }
}