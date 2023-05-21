package Tree_Data_Structure;

import java.util.ArrayList;

public class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void rootToLeafPath(Node root, ArrayList<Integer> path){
        if(root == null ){
            return;
        }
        path.add(root.data);
        //leaf
        if (root.left == null && root.right == null){
            printPath(path);
            System.out.println();
        } else {
            rootToLeafPath(root.left, path);
            rootToLeafPath(root.right, path);
        }
        path.remove(path.size()-1);
    }


    public static void printPath(ArrayList<Integer> path){
        for (int i = 0 ;i<path.size();i++){
            System.out.print(path.get(i)+"---");
        }
    }


    public static void printInRange(Node root,int x ,int y){
        if(root == null){
            return;
        }
        if(root.data >= x && root.data <= y){
            printInRange(root.left,x,y);
            System.out.print(root.data+"~");
            printInRange(root.right,x,y);
        } else if(root.data >= y){
            printInRange(root.left,x,y);
        } else {
            printInRange(root.right,x,y);
        }
    }

    public static int Ceil(Node root, int key){
        //Ceil Value Node: Node with the smallest data larger than or equal to the key value.
        if (root == null) {
            return -1;
        }
        if (root.data == key) {
            return root.data;
        }
        if (root.data < key) {
            return Ceil(root.right, key);
        }
        int ceil = Ceil(root.left, key);
        return (ceil >= key) ? ceil : root.data;
    }
    public static int Floor(Node root, int key){
        //Floor Value Node: Node with the greatest data lesser than or equal to the key value.
        if (root == null) {
            return -1;
        }
        if (root.data == key) {
            return root.data;
        }
        if (root.data > key) {
            return Floor(root.left, key);
        }
        int floor = Floor(root.right, key);
        return (floor <= key) ? floor : root.data;
    }


    public static Node deleteInBST2(Node root, int val){
        if(root == null){
            return root;
        }
        if(root.data > val){
            root.left = deleteInBST(root.left,val);
        } else if(root.data < val){
            root.right = deleteInBST(root.right , val);
        } else {
            if( root.left == null){
                return root.right;
            }
            else if( root.right == null){
                return root.left;
            }
            root.data = successor(root.right);
            root.right = deleteInBST(root.right,root.data);
        }
        return root;
    }
    private static int successor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }


    public static Node deleteInBST(Node root,int val){
        if(root.data > val){
            root.left = deleteInBST(root.left,val);
        } else if(root.data < val){
            root.right = deleteInBST(root.right , val);
        } else { // root.data = val
            if(root.left == null && root.right == null){
                return null;
            } // case 2
            if( root.left == null){
                return root.right;
            }
            if( root.right == null){
                return root.left;
            } // case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteInBST(root.right,IS.data);

        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }


    public static boolean searchInBST(Node root,int key){
        if (root == null){
            return false;
        } else if(root.data < key){
            return searchInBST(root.right,key);
        } else if(root.data > key){
            return searchInBST(root.left,key);
        } else {
            return true;
        }

    }


    public static Node insertInBST(Node root,int key){
        if(root == null){
            root = new Node(key);
            return root ;
        }
        if(root.data > key){
            root.left = insertInBST(root.left,key);
        } else{
            root.right = insertInBST(root.right,key);
        }
        return root;
    }


    public static void inorderTraversal(Node root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data+"_");
        inorderTraversal(root.right);
    }
    public static void main(String[] args) {
        int[] value = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i = 0 ;i<value.length;i++){
            root = insertInBST(root,value[i]);
        }
        inorderTraversal(root);
        System.out.println();
        if(searchInBST(root,45)) {
            System.out.println("Mil gya Sir ");
        }
        else {
            System.out.println("Bahut dhoondha par mila hi nahi ");
        }
        deleteInBST2(root,5);
        inorderTraversal(root);
        System.out.println();
        printInRange(root,6,10);
        System.out.println();
        rootToLeafPath(root,new ArrayList<>());
        System.out.println(Floor(root,9)+"-"+Ceil(root,9));

    }

}
