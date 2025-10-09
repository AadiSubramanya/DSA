class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count = 0, lt = 0;
        for (int n: nums) {
            if (n == target) count++;
            if (n < target) lt++;
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(lt++);
        }
        return result;
    }
}