class Solution {
    public int missingNumber(int[] nums) {
        int k;
        Arrays.sort(nums);

        for (k = 0; k<nums.length; k++){
            if (nums[k] != k) break;
        }

        return k;
    }
}