class Solution {
    public static int binarySearch(int[] arr , int target){
        int right =arr.length;
        int left = 0;
        int mid;
        while(left<right){
            mid = left + (right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target>arr[mid]){
                left =mid+1;
            }else{
                right=mid;
            }
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int row;
        while(top<=bottom){
            row = (top+bottom)/2;
            if(target>matrix[row][n-1]){
                top= row+1;
            }else if(target<matrix[row][0]){
                bottom =row-1;
            }else{
                break;
            }
        }
        row = (top+bottom)/2;
        if(binarySearch(matrix[row],target)<0){
            return false;
        }
        return true;
    }
}
