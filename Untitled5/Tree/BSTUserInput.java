package Tree;

class BSTNode {
    int data;

    BSTNode left;
    BSTNode right;

    BSTNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {
    BSTNode root;

    BST() {
        this.root = null;
    }

    public void add(int key) {
        this.root = this.insert(this.root, key);
    }
    private BSTNode insert(BSTNode root, int key) {
        if(root == null)
            return new BSTNode(key);

        if(key < root.data)
            root.left = insert(root.left, key);
        else if(key > root.data)
            root.right = insert(root.right, key);

        return root;
    }


    public void traversal() {
        System.out.print("Inorder: ");
        this.inorder(this.root);
        System.out.println();

        System.out.print("Preorder: ");
        this.preorder(this.root);
        System.out.println();
    }
    private void inorder(BSTNode root) {
        if(root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    private void preorder(BSTNode root) {
        if(root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}

public class BSTUserInput {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 5, 6, 8};

        BST tree = new BST();

        for(int x: arr)
            tree.add(x);

        tree.traversal();
    }
}
