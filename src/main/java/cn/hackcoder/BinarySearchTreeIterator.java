package cn.hackcoder;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 173. Binary Search Tree Iterator
 */
public class BinarySearchTreeIterator {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}


	private Queue<Integer> queue = new LinkedList<>();

	private void postOrder(TreeNode node) {
		if (node == null) return;
		postOrder(node.left);
		postOrder(node.right);
		queue.add(node.val);
	}

	public BinarySearchTreeIterator(TreeNode root) {
		postOrder(root);
	}

	/**
	 * @return the next smallest number
	 */
	public int next() {
		return queue.poll();
	}

	/**
	 * @return whether we have a next smallest number
	 */
	public boolean hasNext() {
		return !queue.isEmpty();
	}
}
