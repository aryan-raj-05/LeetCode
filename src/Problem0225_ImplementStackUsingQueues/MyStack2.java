package Problem0225_ImplementStackUsingQueues;

import java.util.Deque;
import java.util.LinkedList;

public class MyStack2 {
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
