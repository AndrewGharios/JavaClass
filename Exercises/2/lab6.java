class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
    }
}

public class lab6 {
    public static void main(String[] args) {
        int[] elements = {2, 1, 7, 3, 4, 8, 5};
        TreeNode root = null;
        
        for (int elem : elements) {
            root = insert(root, elem);
        }
        
        int height = getHeight(root);
        System.out.println("Height of tree: " + height);
    }
    
    static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }
    
    static int getHeight(TreeNode node) {
        if (node == null) return -1;
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}