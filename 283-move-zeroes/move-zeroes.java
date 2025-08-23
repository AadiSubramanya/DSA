class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;

        int backshots = 0; // position to place the next non-zero
        int temp;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap nums[i] with nums[backshots] if needed
                if (i != backshots) {
                    temp = nums[i];
                    nums[i] = nums[backshots];
                    nums[backshots] = temp;
                }
                backshots++;
            }
        }
    }
}
