package cn.hackcoder;


import java.util.ArrayList;
import java.util.List;

public class CustomStack {
	List<Integer> list = new ArrayList<>();
	int capacity;

	public CustomStack(int maxSize) {
		capacity = maxSize;
	}

	public void push(int x) {
		if (list.size() == capacity) return;
		list.add(x);
	}

	public int pop() {
		if (list.isEmpty()) return -1;
		return list.remove(list.size() - 1);
	}

	public void increment(int k, int val) {
		for (int i = 0; i < k && i < list.size(); i++)
			list.set(i, list.get(i) + val);
	}

	public static void main(String[] args) {

	}
}
