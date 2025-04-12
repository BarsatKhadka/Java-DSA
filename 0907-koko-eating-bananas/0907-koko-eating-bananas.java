class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = piles[0];
        for(int p: piles){
            right = Math.max(p,right);
        }
        int result = right;
        while(left<=right){
            long hours = 0;
            int mid = left + (right - left) / 2;
            for(int p: piles){
                hours += (p + mid - 1) / mid; // this is a common trick to simulate ceil(p / mid)
            }
            if(hours <= h){
                result = mid;
                right = mid - 1;
                
            }
            else{
                left = mid + 1;
            }
            
        }
        return result;
    }
}