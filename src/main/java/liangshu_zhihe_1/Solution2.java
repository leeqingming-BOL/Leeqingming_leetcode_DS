package liangshu_zhihe_1;

import java.util.HashMap;

public class Solution2 {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target-nums[i])) {
                Integer velue = map.get(target - nums[i]);
                return new int[]{i, velue};
            } else {
                map.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("匹配失败");
    }

}
