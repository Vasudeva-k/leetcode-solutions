import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 1. Change to Map<Integer, Integer> to store both the value and its index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // 2. HashMap uses 'containsKey', not 'contains'
            if (map.containsKey(complement)) {
                // 3. Retrieve the stored index using map.get()
                return new int[] { map.get(complement), i };
            }
            
            // 4. Put both the number and its current index into the map
            map.put(nums[i], i);
        }
        
        // Return an empty array if no match is found
        return new int[] {};
    }
}
