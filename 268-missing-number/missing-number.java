class Solution {
    public int missingNumber(int[] nums) {
        int k, temp;
        for (int i = 0; i<nums.length; i++){
            for (int j = 0; j<nums.length-1; j++){
                if (nums[j+1]<nums[j]){
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (k = 0; k<nums.length; k++){
            if (nums[k] != k) break;
        }

        return k;
    }
}