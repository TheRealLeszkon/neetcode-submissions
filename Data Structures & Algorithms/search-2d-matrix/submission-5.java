class Solution {
    public static int binarySearch(int[] arr , int target){
        int l,r,mid;
        l =0;
        r =arr.length-1;
        while(l<=r){
            mid = l+(r-l)/2;
            if(target == arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                r =mid-1;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int l,r,mid;
        l =0;
        r =matrix.length-1;
        int result = -1;
        int[] row;
        while(l<=r){
            mid = l+(r-l)/2;
            row = matrix[mid];
            if(row[0]<=target && target <=row[row.length-1]){
                return binarySearch(row,target) !=-1;
            }else if(target < row[0]){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        // if(result!=-1){
        //     return true;
        // }
        return false;
    }

}
