class Solution {
    public int maxArea(int[] heights) {
        int left =0;
        int right = heights.length-1;
        //area = width x min(height_left,height_right)
        int maxArea = 0;
        int currArea;
        while(left<right){
            currArea = (right-left) * Math.min(heights[left],heights[right]);
            maxArea = Math.max(currArea,maxArea);
            if(heights[left]>heights[right]){
                right--;
            }else{
                left++;
            }

        }
        return maxArea;
    }
}
