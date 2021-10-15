package liangshu_zhihe_1;

import java.util.Arrays;

public class Test {

@org.junit.Test
    public void test1() {

        int[] arr = {2, 7, 11, 15};
        Solution s = new Solution();
        int[] ints = s.twoSum(arr, 9);
    System.out.println(Arrays.toString(ints));

    }

    @org.junit.Test
    public void test2() {

        int[] arr = {2, 7, 11, 15};
        Solution2 solution2 = new Solution2();
        int[] ints = solution2.twoSum(arr, 9);
        System.out.println(Arrays.toString(ints));

    }
}
