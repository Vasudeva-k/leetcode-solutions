
import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int[] arr : nums) {
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == nums.length) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);
        return result;
    }
}
