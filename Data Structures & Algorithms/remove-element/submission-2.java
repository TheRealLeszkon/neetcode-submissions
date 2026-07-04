class Solution {
    // public static void reverseSort(int[] arr) {
    //     int temp;
    //     for(int i =0;i<arr.length;i++){
    //         for(int j=0;j<arr.length;j++){
    //             if(arr[i]>arr[j]){
    //                 temp = arr[i];
    //                 arr[i] =arr[j];
    //                 arr[j]=temp;
    //             }
                
    //         }
    //     }
    // }

    public int removeElement(int[] nums, int val) {
        int index =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index++]=nums[i];
            }
        }
        return index;

    }
}