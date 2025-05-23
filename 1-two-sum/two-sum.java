class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer ,  Integer> map = new HashMap<>();
        for(int i =0;i<nums.length ;i++){
            int diffrence = target - nums[i];

            if(map.containsKey(diffrence)){
                return new int [] {map.get(diffrence),i};
            }
            map.put(nums[i], i);
        }

        return null;
        
    }
}