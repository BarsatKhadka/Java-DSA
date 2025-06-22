class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right){
            int width = right - left;
            int breadth = Math.min(height[right], height[left]);
            int rectangle = width * breadth;
            maxArea = Math.max(maxArea, rectangle);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxArea;

        
    }
}