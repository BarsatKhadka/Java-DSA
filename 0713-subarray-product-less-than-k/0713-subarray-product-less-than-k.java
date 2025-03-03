class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int contig = 0;
        for(int i=0; i<nums.length; i++){
            int lptr = i+1;
            int current =  nums[i];
            if(current <k){
                contig++;
            }
            
            while(lptr < nums.length){
                
                current = nums[lptr] * current;
                if(current >= k) break;
                contig +=1;
                lptr++;
            }
            
        }
        return contig;
        
    }
}