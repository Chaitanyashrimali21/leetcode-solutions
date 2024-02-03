class Solution {
    public int majorityElement(int[] nums) {

 // approach using hashmap 
      
      int size = nums.length;

         HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<size;i++)
        {
          map.put(nums[i], map.getOrDefault(nums[i],0) +1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > size/2) {
                return entry.getKey();
            }
        }
        return -1;      
        
    }
}