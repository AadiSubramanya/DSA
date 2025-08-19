class Solution {
    public int removeElement(int[] nums, int val) {
        int c = 0, j = nums.length - 1, temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                c++;
            }
        }
        for (int i=0; i<j; i++) {
            if (nums[i] == val) {
                while (j>i && nums[j] == val) {
                    j--;
                }
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        
        return nums.length-c;
    }
}