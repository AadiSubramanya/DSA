class Solution {
    public int missingNumber(int[] nums) {
        int actualsum=0, totalsum=0;

        for(int i=0;i<=nums.length;i++){
            totalsum+=i;
            if (i < nums.length){
                actualsum+=nums[i];
            }
        }
        return totalsum-actualsum;
    }
}