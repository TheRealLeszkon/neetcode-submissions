class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] orderedPairs = new int[position.length][2];
        int fleetCount =0;
        double lastFleetTime=0;

        for(int i=0;i<position.length;i++){
            orderedPairs[i][0]= position[i];
            orderedPairs[i][1]= speed[i];
        }
        Arrays.sort(orderedPairs,(a,b) ->Integer.compare(b[0], a [0]));
        // P-D/S
        double reachTime;
        for(int i =0;i<position.length;i++){
            reachTime= (double) (target-orderedPairs[i][0])/orderedPairs[i][1];
            if(reachTime>lastFleetTime){
                fleetCount++;
                lastFleetTime=reachTime;
            }
            
        }
        return fleetCount;
    }
}
