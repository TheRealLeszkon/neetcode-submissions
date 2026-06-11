class Solution {
    public int maxArea(int[] heights) {
        int result =0;
        int area =0;
        int waterLevel =0;
        for(int l=0;l<heights.length;l++){
            int r = l+1;
            while(r<heights.length){
                waterLevel = Math.min(heights[l],heights[r]);
                area = waterLevel*(r-l);
                result = Math.max(area,result);
                r++;
            }
        }
        return result;
    }
}
