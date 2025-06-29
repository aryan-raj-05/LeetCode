import java.util.ArrayDeque;

public class lc0020 {
    public boolean isValid(String s) {
        ArrayDeque<Character> stk = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (isOpenBracket(s.charAt(i)))
                stk.addFirst(s.charAt(i));
            else if (isCloseBracket(s.charAt(i)) && !stk.isEmpty() && isPair(stk.peekFirst(), s.charAt(i)))
                stk.removeFirst();
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
