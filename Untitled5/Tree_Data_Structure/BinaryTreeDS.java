package Tree_Data_Structure;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        this.root = null;
    }

    BinaryTree(int x) {
        this.root = new Node(x);
    }

    public void traversal() {
        this.print(root);
    }

    public void print(Node root) {
        if(root == null)
            return;

        System.out.println(root.data);

        print(root.left);
        print(root.right);
    }

    public void insert(int x) {
        this.root = this.add(root, x);
    }

    public Node add(Node root, int x) {
        if(root == null)
            return new Node(x);

        if(root.left == null)
            root.left = add(root.left, x);
        else
            root.right = add(root.right, x);

        return root;
    }
}

public class BinaryTreeDS{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        for(int i = 1; i <= 7; ++i)
            tree.insert(i);

        tree.traversal();
    }
}