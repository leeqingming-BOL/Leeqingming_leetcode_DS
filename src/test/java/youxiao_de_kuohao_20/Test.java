package youxiao_de_kuohao_20;

public class Test {

    @org.junit.Test
    public void test1() {

        String s = "(){}}{";
        Solution solution = new Solution();
        boolean valid = solution.isValid(s);
        System.out.println(valid);

    }

    @org.junit.Test
    public void test2() {

        String s = "(]";
        Solution solution = new Solution();
        boolean valid = solution.isValid(s);
        System.out.println(valid);

    }
}
