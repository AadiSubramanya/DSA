class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1){ return;}

        int backshots = nums.length-1, temp;
        while (nums[backshots] == 0 && backshots>0){
            backshots--;
        }
        for (int i = backshots-1; i>=0; i--){
            if (nums[i] == 0){
                int k = i;
                while (k < backshots){
                    temp = nums[k+1];
                    nums[k+1] = nums[k];
                    nums[k] = temp;
                    k++;
                }
                backshots--;
            }
        }
    }
}