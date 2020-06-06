package cn.hackcoder;

/**
 * 1315. Sum of Nodes with Even-Valued Grandparent
 */
public class SumOfNodesWithEvenValuedGrandparent {
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

	public int sumEvenGrandparent(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) return 0;
		int num = 0;
		if (root.val % 2 == 0) {
			if (root.left != null && root.left.left != null) num += root.left.left.val;
			if (root.left != null && root.left.right != null) num += root.left.right.val;
			if (root.right != null && root.right.left != null) num += root.right.left.val;
			if (root.right != null && root.right.right != null) num += root.right.right.val;
			return num + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
		}
		return sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
	}
}