package Problem0225_ImplementStackUsingQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack {
    private Deque<Integer> q0 = new ArrayDeque<>();
    private Deque<Integer> q1 = new ArrayDeque<>();
    private boolean pushQueue = false;

    public MyStack() {}

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
