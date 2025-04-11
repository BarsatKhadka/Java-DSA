class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = weights[0];
        int right = 0;

        for(int i: weights){
            right +=i;
            left = Math.max(left,i);
        }
        
        int result = right;
        while(left<=right){
            int mid = (left+right)/2;
            if(canShip(mid, weights, days)){
                result = Math.min(mid,result);
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return result;

    }
    private static boolean canShip(int mid, int[] weights, int days){
        int ships = 1;
        int cap = mid;
        for(int w: weights){
            if(cap - w <0){
                ships +=1;
                cap = mid;

            }
            cap -=w;


        }
        return ships <= days;
        
    }
}