package cn.hackcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 230. Kth Smallest Element in a BST
 */
public class KthSmallestElementInABST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	private void bst(List<Integer> list, TreeNode root) {
		if (root == null) return;
		bst(list, root.left);
		list.add(root.val);
		bst(list, root.right);
	}

	public int kthSmallest(TreeNode root, int k) {
		List<Integer> list = new ArrayList<>();
		bst(list, root);
		return list.get(k-1);
	}
}
