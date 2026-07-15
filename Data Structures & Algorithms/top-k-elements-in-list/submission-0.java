class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length];

        //get all frequencies
        for(int i=0;i< nums.length;i++){
            if(!freqMap.containsKey(nums[i])){
                freqMap.put(nums[i],1);
            }else {
                freqMap.put(nums[i],freqMap.get(nums[i])+1);
            }
        }
        for(Integer key : freqMap.keySet()){
            if(buckets[freqMap.get(key)-1] ==null){
                buckets[freqMap.get(key)-1] = new ArrayList<>();
            }
            buckets[freqMap.get(key)-1].add(key);
        }
        System.out.println(Arrays.toString(buckets));

        int[] result = new int[k];
        int count =0;
        for(int i = nums.length-1;i>=0;i--){
            List<Integer> bucket = buckets[i];
            if(bucket==null){
                continue;
            }
            while(!bucket.isEmpty()){
                if(count>=k){
                    return result;
                }
                result[count]=bucket.getFirst();
                count++;
                bucket.removeFirst();

            }
        }
        return result;
    }
        
}
