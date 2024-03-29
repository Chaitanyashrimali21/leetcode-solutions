class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int diff = 0;
        int maxDiff = 0;
        int maxIndex= 0;

        for(int i=  gas.length-1;i>=0;i--){
            if(diff + gas[i]-cost[i] >= maxDiff){
                maxDiff = diff + gas[i] -cost[i];
                maxIndex =i;
            }

            diff += gas[i];
            diff -=  cost[i];
        }

        return diff <0?-1:maxIndex;
    }
}