package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 145 Binary Tree Postorder Traversal
 */
public class BinaryTreePostorderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private void postOrder(TreeNode node, List<Integer> visited) {
		if (node == null) return;
		postOrder(node.left, visited);
		postOrder(node.right, visited);
		visited.add(node.val);
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		postOrder(root, result);
		return result;
	}
}
