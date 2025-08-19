class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0, high=nums.length-1, mid;
        int[] range = {-1,-1};
        while (low <= high){
            mid = (low+high)/2;
            if (nums[mid]==target){
                int i = mid-1, j=mid+1;
                while (i>=0 && nums[i] == target){
                    i--;
                }
                range[0] = i+1;
                while (j<=nums.length-1 && nums[j] == target){
                    j++;
                }
                range[1] = j-1;  
                break;
            }
            else if (nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return range;
    }
}