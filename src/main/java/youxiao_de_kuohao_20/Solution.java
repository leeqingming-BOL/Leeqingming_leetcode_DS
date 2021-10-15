package youxiao_de_kuohao_20;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        //栈的应用
        boolean value = false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);

            if ('(' == (charAt) || '[' == (charAt) || '{' == (charAt)) {
                stack.push(charAt);
                continue;
            }

            if (')' == (charAt)) {

                if (!stack.empty()) {
                    Character character = stack.pop();
                    value = character == '(';
                    if (value == false) {
                        return value;
                    }continue;
                }
                return false;

            }

            if (']' == (charAt)) {
                if (!stack.empty()) {
                    Character character = stack.pop();
                    value = character == '[';
                    if (value == false) {
                        return value;
                    }continue;
                }
                return false;
            }

            if ('}' == (charAt)) {
                if (!stack.empty()) {
                    Character character = stack.pop();
                    value = character == '{';
                    if (value == false) {
                        return value;
                    }continue;
                }
                return false;
            }
        }
        return stack.empty();

    }
}
