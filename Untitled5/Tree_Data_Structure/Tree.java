package Tree_Data_Structure;

import Queue_Data_Structure.QueueJCF;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    static class Node {
        int data ;
        Node left ;
        Node right;

        Node (int data ){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int i = -1;
        public static Node buildTree(int nodes[] ){
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
    public static Node deletion (Node root, int val ){
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            if (root.data == val){
                return null ;
            } else {
                return root;
            }
        }
        Node keyNode = null;
        Node temp = null ;
        Node last = null;
        Queue<Node > q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            temp = q.peek();
            q.poll();
            if(temp.data == val){
                keyNode = temp;
            }
            if(temp.left != null){
                last = temp ;
                q.add(temp.left);
            }
            if(temp.right != null){
                last = temp ;
                q.add(temp.right);
            }
        }
        if (keyNode != null){
            keyNode.data = temp.data;
            if (last.right == temp)
                last.right = null;
            else
                last.left = null;

        }
        return root;
    }


    public static boolean isIdentical(Node root, Node subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.data == subRoot.data){
            return isIdentical(root.left ,subRoot.left) && isIdentical(root.right,subRoot.right);
        }
        return false;

    }
    public static boolean isSubtree(Node root, Node subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }


    static class TreeInfo{
        int height ;
        int diameter;
        TreeInfo(int height,int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }
    public static TreeInfo diameterOfTree2(Node root){
        if(root == null){
           return new TreeInfo(0,0);
        }

        TreeInfo leftTI = diameterOfTree2(root.left);
        TreeInfo rightTI = diameterOfTree2(root.right);

        int myHeight = Math.max(leftTI.height,rightTI.height) +1;

        int diam1 = leftTI.diameter;
        int diam2 = rightTI.diameter;
        int diam3 = leftTI.height + rightTI.height + 1;

        int mydiam = Math.max(Math.max(diam1,diam2),diam3);

        return new TreeInfo(myHeight,mydiam);
    }

    // O(n^2)
    public static int diameterOfTree(Node root){
        if(root == null){
            return 0;
        }
        int diamLeft = diameterOfTree(root.left);
        int diamRight = diameterOfTree(root.right);
        int diameter = heightOfTree(root.left ) + heightOfTree(root.right) + 1;
        return Math.max(diameter,Math.max(diamLeft,diamRight));

    }


    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }


    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
    }


    public static void levelOrderTraversal3(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node temp = q.remove();
            System.out.print(temp.data+"@");
            if (temp.left != null){
                q.add(temp.left);
            }
            if (temp.right != null){
                q.add(temp.right);
            }
        }
    }


    public static void levelOrderTraversal2(Node root){
        int h = heightOfTree(root);
        for(int i = 1 ;i<=h;i++){
            printCurrentLevel(root,i);
        }
    }
    private static void printCurrentLevel(Node root,int level){
        if(root == null){
            return;
        }
        if (level == 1){
            System.out.print(root.data+"*");
        }else if (level > 1){
            printCurrentLevel(root.left,level-1);
            printCurrentLevel(root.right,level-1);
        }
    }


    public static void levelOrderTraversal(Node root){
        if(root == null){
            return;
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
                } else{
                    q.add(null);
                }
            } else {
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


    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }


    public static void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+"_");
    }


    public static void  inorderTraversal(Node root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data+ ",");
        inorderTraversal(root.right);
    }


    public static void  preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }



    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,-1,-1,-1,-1,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(arr);

//        preOrderTraversal(root);System.out.println();
//
//        inorderTraversal(root);System.out.println();
//
//        postOrderTraversal(root);System.out.println();

        levelOrderTraversal(root);
//
//        System.out.println(countOfNodes(root));
//
//        System.out.println(sumOfNodes(root));
//
//        System.out.println(heightOfTree(root));
//
//        System.out.println(diameterOfTree(root));
//
//        System.out.println(diameterOfTree2(root).diameter);
//
//        System.out.println(isSubtree(root,root));

//        inorderTraversal(deletion(root, 5));
//        System.out.println();

//        levelOrderTraversal2(root);
//        System.out.println();
//
//        levelOrderTraversal3(root);
    }
}
