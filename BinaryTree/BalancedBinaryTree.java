package BinaryTree;

public class BalancedBinaryTree {
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

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int rightDepth = maxDepth(root.right);
        int leftDepth = maxDepth(root.left);
        int diff = Math.abs(rightDepth - leftDepth);
        if (diff > 1)
            return false;
        if (!isBalanced(root.left)) {
            return false;
        }
        if (!isBalanced(root.right)) {
            return false;
        }
        return true;
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;

        int max_depth = 0;
        if (root.left != null)
            max_depth = Math.max(max_depth, maxDepth(root.left));
        if (root.right != null)
            max_depth = Math.max(max_depth, maxDepth(root.right));

        return max_depth + 1;
    }
}
