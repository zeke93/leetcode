package cn.hackcoder;

/**
 * 938. Range Sum of BST
 */
public class RangeSumOfBST {

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


	public int rangeSumBST(TreeNode root, int L, int R) {
		if (root == null) return 0;
		int sum = 0;
		if (root.val >= L && root.val <= R) sum += root.val;
		sum += rangeSumBST(root.left, L, R);
		sum += rangeSumBST(root.right, L, R);
		return sum;
	}
}
