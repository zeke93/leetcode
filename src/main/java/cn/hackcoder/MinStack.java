package cn.hackcoder;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by thinsky on 16-7-3.
 */
public class MinStack {
    private List<Item> data = new LinkedList<>();

    public MinStack() {

    }

    public void push(int x) {
        Item newItem = new Item();
        newItem.val = x;
        if (data.size() == 0) {
            newItem.min = x;
        } else {
            int preMin = data.get(data.size() - 1).min;
            newItem.min = x < preMin ? x : preMin;
        }
        data.add(newItem);
    }

    public void pop() {
        if (data.size() != 0)
            data.remove(data.size() - 1);
    }

    public int top() {
        if (data.size() != 0)
            return data.get(data.size() - 1).val;
        return 0;

    }

    public int getMin() {
        if (data.size() != 0)
            return data.get(data.size() - 1).min;
        return 0;
    }


    class Item {
        public int val;
        public int min;

    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
