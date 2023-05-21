import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    static class Node {
        int data ;
        Node left ;
        Node right ;
        Node(int data ){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static  int i = -1;
        public static Node buildTree(int[] nodes ){
            i++;
            if(nodes[i] == -1){
                return null;
            }

            Node newNode = new Node(nodes[i]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static void preorderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static void inorderTraversal(Node root){
        if(root == null){
            return;
        }
        preorderTraversal(root.left);
        System.out.print(root.data+" ");
        preorderTraversal(root.right);
    }
    public static void postorderTraversal(Node root){
        if(root == null){
            return;
        }
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        System.out.print(root.data+" ");
    }
    public static int numberOfNodes (Node root ){
        if(root == null){
            return 0 ;
        }
        int leftNodes = numberOfNodes(root.left);
        int rightNodes = numberOfNodes(root.right);
        return leftNodes+rightNodes+1;
    }

    public static void levelOrderTraversal(Node root){
        if(root == null){
            return ;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null) ;
                }
            }else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,-1,-1,-1,-1,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(arr);

//        preorderTraversal(root);
//        System.out.println();
//        postorderTraversal(root);
//        System.out.println();
//        inorderTraversal(root);
//        System.out.println(numberOfNodes(root));
        levelOrderTraversal(root);

    }
}