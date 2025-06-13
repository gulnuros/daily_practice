package BinaryTree;

public class DiameterofBinaryTree {

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

    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDiameter;
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;

        int max_depth = 0;
        int maxDepthLeft = maxDepth(root.left);
        int maxDepthRight = maxDepth(root.right);

        maxDiameter = Math.max(maxDiameter, maxDepthLeft + maxDepthRight);
        max_depth = Math.max(maxDepthLeft, maxDepthRight);

        return max_depth + 1;
    }
}
