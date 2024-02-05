class Solution {
    public boolean canJump(int[] nums) {
       // Approach
// Initialize the variable destination to the last index of the array (nums.length - 1). This variable represents the destination index, i.e., the index we want to reach.
// Start a loop from the second last index (i = nums.length - 2) and iterate towards the first index (i >= 0).
// At each iteration, check if the sum of the current index i and the jump length at that index (nums[i]) is greater than or equal to the current destination index..
// If true, it means we can reach the current destination from index i. So, update dest to i.(destination=i)
// After the loop, check if the final destination index is 0. If it is it means that we can reach the end of the array from the beginning, and the function returns true. if not it will return false.
    
    int dest =  nums.length-1;
    for(int i = nums.length-2;i>=0;i--){
        if( i+ nums[i]>=dest){
            dest =i;
        }
    }
    
      return dest ==0;
    }
}