public class Main {
    public static class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;
        private int height;

        // Constructor
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
            this.height = 1; // Initial height for a new node
        }
    }

    public static class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null) return new TreeNode(val);
            TreeNode cur = root;
            while (true) {
                if (cur.val <= val) {
                    if (cur.right != null) cur = cur.right;
                    else {
                        cur.right = new TreeNode(val);
                        break;
                    }
                } else {
                    if (cur.left != null) cur = cur.left;
                    else {
                        cur.left = new TreeNode(val);
                        break;
                    }
                }
            }
            return root;
        }
    }

    public static void main(String[] args) {
        // Usage example
        Solution solution = new Solution();
        TreeNode root = null; // Initialize an empty tree

        // Insert the given elements into the binary search tree
        int[] elements = {45, 27, 67, 36, 56, 15, 75, 31, 53, 39, 64};
        for (int element : elements) {
            root = solution.insertIntoBST(root, element);
        }

        // Print the elements of the tree in sorted order
        System.out.println("Inorder Traversal:");
        inorderTraversal(root);
    }

    // Method to perform inorder traversal
    public static void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.val + " ");
            inorderTraversal(node.right);
        }
    }
}





