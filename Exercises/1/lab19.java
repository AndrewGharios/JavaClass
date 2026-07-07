import java.util.Scanner;

class Node {
    int val;
    Node left, right;
    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class lab19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        while (true) {
            int x = sc.nextInt();
            if (x == 0) break;
            root = insert(root, x);
        }
        System.out.println(isBalanced(root) ? "YES" : "NO");
        sc.close();
    }
    
    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    
    static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    
    static boolean isBalanced(Node root) {
        if (root == null) return true;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.abs(leftHeight - rightHeight) <= 1 && 
               isBalanced(root.left) && 
               isBalanced(root.right);
    }
}