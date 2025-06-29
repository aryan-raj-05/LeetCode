import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class lc0225 {
    private Deque<Integer> q0 = new ArrayDeque<>();
    private Deque<Integer> q1 = new ArrayDeque<>();
    private boolean pushQueue = false;

    public lc0225() {}

    public void push(int x) {
        if (!pushQueue)
            q0.addLast(x);
        else
            q1.addLast(x);
    }

    public int pop() {
        if (pushQueue) {
            while (q1.size() > 1) {
                int x = q1.removeFirst();
                q0.addLast(x);
            }
            pushQueue = false;
            return q1.removeFirst();
        } else {
            while (q0.size() > 1) {
                int x = q0.removeFirst();
                q1.addLast(x);
            }
            pushQueue = true;
            return q0.removeFirst();
        }
    }

    public int top() {
        if (pushQueue)
            return q1.getLast();
        else
            return q0.getLast();
    }

    public boolean empty() {
        if (pushQueue)
            return q1.isEmpty();
        else
            return q0.isEmpty();
    }

}


class MyStack2 {
    private Deque<Integer> queue = new LinkedList<>();

    public MyStack2() {}

    public void push(int x) {
        queue.addLast(x);
    }

    public int pop() {
        for (int i = 0; i < queue.size() - 1; i++) {
            int x = queue.removeFirst();
            queue.addLast(x);
        }
        return queue.removeFirst();
    }

    public int top() {
        return queue.getLast();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}