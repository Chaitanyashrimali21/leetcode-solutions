class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
           int n = nums.length;
        int[] result = new int[n - k + 1];

        // Frequency map to store negative numbers only
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            // Add current number if negative
            if (nums[i] < 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }

            // Maintain window size
            if (i >= k - 1) {
                // Find the x-th smallest negative number
                int count = 0;
                int beauty = 0;

                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    count += entry.getValue();
                    if (count >= x) {
                        beauty = entry.getKey();
                        break;
                    }
                }
                
                // Store the result
                result[i - k + 1] = beauty;

                // Remove outgoing element from the window
                if (nums[i - k + 1] < 0) {
                    if (map.get(nums[i - k + 1]) == 1) {
                        map.remove(nums[i - k + 1]);
                    } else {
                        map.put(nums[i - k + 1], map.get(nums[i - k + 1]) - 1);
                    }
                }
            }
        }

        return result;
    }
}