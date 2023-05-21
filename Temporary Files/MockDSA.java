import jdk.jshell.spi.SPIResolutionException;

import java.util.Scanner;

public class MockDSA {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{

        public static Node buildTree(int[] nodes,int i){
            i++;
            if(nodes[i]==-1){
                return null;
            }
            Node newNode = new Node(nodes[i]);
            newNode.left = buildTree(nodes,i);
            newNode.right = buildTree(nodes,i);
            return newNode;
        }

    }
    public  static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static boolean isIdentical(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.data == root2.data){
            return isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr1 = new int[11];
        int[] arr2 = new int[11];

        for (int i=0;i<arr1.length;i++) {
            arr1[i] = s.nextInt();
        }
        for (int i=0;i<arr2.length;i++) {
            arr2[i] = s.nextInt();
        }

        BinaryTree tree1 = new BinaryTree();
        Node root1 = tree1.buildTree(arr1,-1);
        BinaryTree tree2 = new BinaryTree();
        Node root2 = tree2.buildTree(arr2,-1);
        System.out.println(isIdentical(root1,root2));
    }
}
/*
1 2 4 5 3 -1 -1 -1 -1 -1 -1
1 2 4 5 3 -1 -1 -1 -1 -1 -1
*/
/*
1 2 9 5 3 -1 -1 -1 -1 -1 -1
1 2 4 5 3 -1 -1 -1 -1 -1 -1
 */
/*
1 2 9 5 3 -1 -1 8 -1 -1 4
1 2 9 5 3 -1 -1 8 -1 -1 4
 */

