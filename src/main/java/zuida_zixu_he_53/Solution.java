package zuida_zixu_he_53;

public class Solution {
    //动态规划
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int greater = Math.max(nums[i], nums[i] + nums[i - 1]);
            nums[i] = greater;
            result = Math.max(result, greater);
        }
        return result;
    }

}
