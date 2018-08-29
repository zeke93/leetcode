package cn.hackcoder;

/**
 * 96. Unique Binary Search Trees
 */
public class UniqueBinarySearchTrees {


    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = G[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
//    public int numTrees(int n) {
//        int[] nums = new int[n];
//        for (int i = 1; i <= n; i++) {
//            nums[i - 1] = i;
//        }
//        List<List<Integer>> permutes = permute(nums);
//
//        List<List<Integer>> preorderTraversalResults = new ArrayList<>();
//        for (List<Integer> permute : permutes) {
//            List<Integer> result = new ArrayList<>();
//            preorder(constructBinaryTree(permute), result);
//
//            if (!preorderTraversalResults.contains(result)) {
//                preorderTraversalResults.add(result);
//            }
//        }
//        return preorderTraversalResults.size();
//    }




    public static void main(String[] args) {
//        List<Integer> treeNodes = new ArrayList<>();
//        treeNodes.add(1);
//        treeNodes.add(3);
//        treeNodes.add(2);
//        UniqueBinarySearchTrees sample = new UniqueBinarySearchTrees();
//        TreeNode root = sample.constructBinaryTree(treeNodes);
//        System.out.println(root);
//
//        List<Integer> results = new ArrayList<>();
//        sample.preorder(root, results);
//
//        results.forEach(System.out::println);

        System.out.println(new UniqueBinarySearchTrees().numTrees(3));
    }

}
