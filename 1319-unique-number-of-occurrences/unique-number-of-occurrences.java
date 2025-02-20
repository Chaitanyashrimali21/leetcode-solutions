class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        // Step 1: Count occurrences of each element
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Check uniqueness of occurrences
        HashSet<Integer> occurrenceSet = new HashSet<>(countMap.values());
        
        // If the number of unique occurrences matches the size of countMap, return true
        return occurrenceSet.size() == countMap.size();
    }
}