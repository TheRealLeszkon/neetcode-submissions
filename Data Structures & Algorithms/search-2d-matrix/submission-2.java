class Solution {
    public static int binarySearch(int[] arr , int target){
        int l,r,mid;
        l=0;
        r=arr.length;
        while(l<r){
            mid=(l+r)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] arr : matrix){
            if(binarySearch(arr,target)!=-1){
                return true;
            }
        }
        return false;
    }

}
