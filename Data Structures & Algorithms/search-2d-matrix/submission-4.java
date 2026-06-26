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
        int top,bottom,mid;
        top =0;
        bottom = matrix.length;
    
        while(top<bottom){
            
            mid = (top+bottom)/2;
            int[] row = matrix[mid];

            if( target >= row[0] && target <= row[row.length-1]){
               int result =binarySearch(row,target);
               return result!=-1;
            }else if(target<row[0]){
                bottom=mid;
            }else{
                top=mid+1;
            }
        }
        return false;
    }

}
