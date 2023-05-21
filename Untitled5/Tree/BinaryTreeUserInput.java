package Tree;

import java.util.*;

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
        System.out.print("PreOrder: ");
        this.preorder(root);
        System.out.println();
    }

    public void preorder(Node root) {
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void insert(int arr[]) {
        this.root = new Node(arr[0]);
        int ind = 1;
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);
        while(ind < arr.length) {
            Node node = queue.poll();
            if(arr[ind] != -1) {
                node.left = new Node(arr[ind]);
                queue.add(node.left);
            }
            if(ind+1 < arr.length && arr[ind+1] != -1) {
                node.right = new Node(arr[ind+1]);
                queue.add(node.right);
            }
            ind += 2;
        }
    }

}

public class BinaryTreeUserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[1000000000];
        for(int i = 0 ;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        BinaryTree tree = new BinaryTree();

        tree.insert(arr);

        tree.traversal();
    }
}
