import java.util.ArrayDeque;

public class lc0150 {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String token: tokens) {
            switch (token) {
                case "+":
                    stack.addFirst(stack.removeFirst() + stack.removeFirst());
                    break;
                case "-":
                    stack.addFirst(- stack.removeFirst() + stack.removeFirst());
                    break;
                case "*":
                    stack.addFirst(stack.removeFirst() * stack.removeFirst());
                    break;
                case "/":
                    int a = stack.removeFirst();
                    int b = stack.removeFirst();
                    stack.addFirst(b / a);
                    break;
                default:
                    stack.addFirst(Integer.valueOf(token));
            }
        }

        return stack.removeFirst();
    }
}
