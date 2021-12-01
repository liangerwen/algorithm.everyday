class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 第一轮遍历
        for (int i = 0; i < nums.length; i++) {
            // 第二轮遍历不能重复计算了
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // 注意leetcode原题中要求返回的是索引位置
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}