import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // 1. Add all elements to sets for O(1) lookups and automatic duplicate removal
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) set1.add(num);

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) set2.add(num);

        // 2. Prepare our inner answer lists
        List<Integer> distinct1 = new ArrayList<>();
        List<Integer> distinct2 = new ArrayList<>();

        // 3. Find elements in nums1 that are NOT in nums2
        for (int num : set1) {
            if (!set2.contains(num)) {
                distinct1.add(num);
            }
        }

        // 4. Find elements in nums2 that are NOT in nums1
        for (int num : set2) {
            if (!set1.contains(num)) {
                distinct2.add(num);
            }
        }

        // 5. Package into the final result list and return
        List<List<Integer>> result = new ArrayList<>(2);
        result.add(distinct1);
        result.add(distinct2);
        
        return result;
    }
}
