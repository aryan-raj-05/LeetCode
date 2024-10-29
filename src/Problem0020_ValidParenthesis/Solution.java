package Problem0020_ValidParenthesis;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (isOpenBracket(s.charAt(i)))
                stk.add(s.charAt(i));
            else if (isCloseBracket(s.charAt(i)) && !stk.isEmpty() && isPair(stk.peek(), s.charAt(i)))
                stk.pop();
            else
                return false;
        }
        return stk.isEmpty();
    }

    private boolean isPair(char c, char h) {
        if (c == '(' && h == ')')           return true;
        else if (c == '{' && h == '}')      return true;
        else return c == '[' && h == ']';
    }

    private boolean isOpenBracket(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private boolean isCloseBracket(char c) {
        return c == ')' || c == '}' || c == ']';
    }
}
