import java.util.ArrayDeque;

public class _0029_validParenthesis {
    public boolean isValid(String s) {
        ArrayDeque<Character> stk = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isOpenBrace(c)) {
                stk.addFirst(c);
            } else {
                if (!stk.isEmpty() && isPair(stk.removeFirst(), c))
                    continue;
                else
                    return false;
            }
        }
        return stk.isEmpty();
    }

    private boolean isOpenBrace(char c) {
        return (c == '(' || c == '{' || c == '[');
    }

    private boolean isPair(char open, char close) {
        return  (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}