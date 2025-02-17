class Solution {
    public int longestSubarray(int[] nums) {
        // number of zero in the window 
        int zeroCount  = 0;
        int windowSize  = 0;

        int start = 0;

        for(int i = 0;i<nums.length;i++){
            zeroCount += (nums[i] == 0 ? 1 : 0);
       
        // reduce window size until the count is less then 0 or equal to 1;

        while(zeroCount > 1){
            zeroCount -=(nums[start] == 0 ? 1 : 0);
            start++;
        }

        windowSize = Math.max(windowSize, i-start);
    }

    return windowSize;
 }

}