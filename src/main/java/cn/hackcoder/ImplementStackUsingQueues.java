package cn.hackcoder;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/**
 * Created by Thinsky on 16/3/11.
 */
public class ImplementStackUsingQueues {

    Queue<Integer> main = new ArrayDeque<>(100);
    Queue<Integer> backup = new ArrayDeque<>(100);

    public void push(int x) {
        main.add(x);
    }

    public void pop() {
        int len = main.size();
        Iterator<Integer> iterator = main.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (++i == len) {
                break;
            }
            backup.add(value);
        }
        main.clear();
        main.addAll(backup);
        backup.clear();
    }

    public int top() {
        Iterator<Integer> iterator = main.iterator();
        int top = -1;
        while (iterator.hasNext()) {
            top = iterator.next();
        }
        return top;
    }

    public boolean empty() {
        return main.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
    }
}
