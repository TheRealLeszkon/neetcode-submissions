class Solution {
    public int trap(int[] height) {
        // if (height.length==0) return 0;
        int l =0;
        int r =height.length-1;
        int leftMax = height[l];
        int rightMax = height[r];
        int trappedWater =0;

        while (l<r){
            if (leftMax <= rightMax){
                l +=1;
                leftMax = Math.max(leftMax,height[l]);
                trappedWater += Math.max(leftMax-height[l],0);
            }else{
                r -=1;
                rightMax = Math.max(rightMax,height[r]);
                trappedWater += Math.max(rightMax -height[r],0);
            }
            
        }
        return trappedWater;
    }
}
