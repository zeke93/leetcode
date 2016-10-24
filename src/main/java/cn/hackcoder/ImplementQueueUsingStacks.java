package cn.hackcoder;

import java.util.Stack;

/**
 * Created by Thinsky on 16/3/3.
 */
public class ImplementQueueUsingStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Push element x to the backup of main.
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from in front of main.
    public void pop() {
        while (!stack1.isEmpty()) {
            stack2.add(stack1.pop());
        }
        stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.add(stack2.pop());
        }
    }

    // Get the front element.
    public int peek() {
        while (!stack1.isEmpty()) {
            stack2.add(stack1.pop());
        }
        Integer value = stack2.peek();
        while (!stack2.isEmpty()) {
            stack1.add(stack2.pop());
        }
        return value;
    }

    // Return whether the main is empty.
    public boolean empty() {
        return stack1.isEmpty();
    }
}
