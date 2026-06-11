class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int area =0;
        int l=0;
        int r= heights.length-1;
        while(l<r){
            if(heights[l]<=heights[r]){
                area = (r-l)*Math.min(heights[l],heights[r]);
                result = Math.max(result,area);
                l++;
            }else {
                area = (r-l)*Math.min(heights[l],heights[r]);
                result = Math.max(result,area);
                r--;
            }
        }
        return result;
    }
}
