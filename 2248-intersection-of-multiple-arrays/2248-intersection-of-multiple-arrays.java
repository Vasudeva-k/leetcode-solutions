class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] count = new int[1001];
        List<Integer> result = new ArrayList<>();
        
        for (int[] arr : nums) {
            for (int num : arr) {
                count[num]++;
            }
        }
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] == nums.length) {
                result.add(i);
            }
        }
        
        Collections.sort(result);
        return result;
    }
}
