class Solution {
    public int trap(int[] elevations) {
        int[][] tallestOnBothSides = new int[elevations.length][2];
        int leftMax=0;
        int rightMax=0;
        for(int i=0;i<elevations.length;i++){
            leftMax= Math.max(leftMax,elevations[i]);
            tallestOnBothSides[i][0] =leftMax;
        }
        for(int i=elevations.length-1;i>=0;i--){
            rightMax = Math.max(rightMax,elevations[i]);
            tallestOnBothSides[i][1]=rightMax;
        }
        int waterHeld = 0;
        for(int i=0;i<elevations.length;i++){
            waterHeld+=Math.min(tallestOnBothSides[i][0],tallestOnBothSides[i][1])-elevations[i];
        }
        return waterHeld;
    }
}
