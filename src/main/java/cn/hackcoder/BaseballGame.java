package cn.hackcoder;

import java.util.Stack;

/**
 * 682. Baseball Game
 */
public class BaseballGame {
	public int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<>();

		for (String op : ops) {
			switch (op) {
				case "+":
					int lastScore = stack.pop();
					int lastTwoScore = stack.pop();
					stack.push(lastTwoScore);
					stack.push(lastScore);
					stack.push(lastScore + lastTwoScore);
					break;
				case "D":
					stack.push(stack.peek() * 2);
					break;
				case "C":
					stack.pop();
					break;
				default:
					stack.push(Integer.parseInt(op));
					break;
			}
		}
		return stack.stream().mapToInt(Integer::intValue).sum();
	}


	public static void main(String[] args) {
		System.out.println(new BaseballGame().calPoints(new String[]{"5","2","C","D","+"}));
		System.out.println(new BaseballGame().calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
	}
}
