package cn.hackcoder;

import java.util.Stack;

/**
 * Created by Thinsky on 16/3/23.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else if (stack.empty()) {
                return false;
            } else {
                if (!isPair(stack.pop(), s.charAt(i))) return false;
            }
        }

        return stack.empty();
    }

    public boolean isPair(char a, char b) {
        if (a == '(' && b == ')') return true;
        if (a == '[' && b == ']') return true;
        if (a == '{' && b == '}') return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid(")("));
        System.out.println(new ValidParentheses().isValid("()"));
        System.out.println(new ValidParentheses().isValid("({})"));
        System.out.println(new ValidParentheses().isValid("({)}"));
    }
}
