class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if ((nums[0] > 0 && target == 0) || (left == right && target == nums[0])) return 0;
        else {
        while (left <= right) {
            int mid = left + (right - left)/2;
            if(target == nums[mid]) return mid;
            else if (target > nums[mid]) left = mid + 1;
            else right = mid - 1;
            }
        }
        return left;
    }
}
