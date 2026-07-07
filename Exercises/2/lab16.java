import java.util.Scanner;

class Node {
    int key;
    Node leftchild;
    Node rightchild;
}

class Tree2 {
    Node root;
    
    public void insert(int n) {
        Node t = root;
        if(t == null) {
            root = new Node();
            root.key = n;
            return;
        }
        while(true) {
            if(n > t.key) {
                if(t.rightchild != null) {
                    t = t.rightchild;
                } else {
                    t.rightchild = new Node();
                    t.rightchild.key = n;
                    break;
                }
            } else if(n == t.key) {
                break;
            } else {
                if(t.leftchild != null) {
                    t = t.leftchild;
                } else {
                    t.leftchild = new Node();
                    t.leftchild.key = n;
                    break;
                }
            }
        }
    }
    
    public int getHeight() {
        return getHeightRec(root);
    }
    
    private int getHeightRec(Node node) {
        if(node == null) return -1;
        int leftHeight = getHeightRec(node.leftchild);
        int rightHeight = getHeightRec(node.rightchild);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

public class lab16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree2 tree = new Tree2();
        
        while(true) {
            int num = sc.nextInt();
            if(num == 0) break;
            tree.insert(num);
        }
        
        System.out.println(tree.getHeight());
        sc.close();
    }
}