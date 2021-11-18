class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int resultCounter = nums.length - 1;
        while(leftIndex <= rightIndex) {
            int resultNum;
            if (Math.abs(nums[leftIndex]) < Math.abs(nums[rightIndex])) {
                resultNum = nums[rightIndex--];
            } else {
                resultNum = nums[leftIndex++];
            }
            result[resultCounter--] = resultNum * resultNum;            
        }
        return result;;
    }
}
