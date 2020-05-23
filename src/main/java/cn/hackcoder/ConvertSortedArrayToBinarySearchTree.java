package cn.hackcoder;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 */
public class ConvertSortedArrayToBinarySearchTree {
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


	private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
		if (end < start) return null;
		if (start == end) return new TreeNode(nums[start]);
		int middle = (end + start) / 2;
		TreeNode root = new TreeNode(nums[middle]);
		root.left = sortedArrayToBST(nums, start, middle - 1);
		root.right = sortedArrayToBST(nums, middle + 1, end);
		return root;
	}

	public TreeNode sortedArrayToBST(int[] nums) {
		return sortedArrayToBST(nums, 0, nums.length - 1);
	}

	public static void main(String[] args) {
		new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});

	}
}
