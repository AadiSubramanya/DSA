class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0, high=nums.length-1, mid=0;
        while (low <= high){
            mid = (low+high)/2;
            if (target > nums[mid]){
                low = mid+1;
            }
            else if (target == nums[mid]){
                return mid;
            }
            else{
                high = mid-1;
            }
        }

        return low;  
    }
}