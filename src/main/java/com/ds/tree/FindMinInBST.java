package com.ds.tree;

/**
 * Created by jayavardhanpatil on 11/9/19
 */
public class FindMinInBST {

    public static void main(String[] args) {

        BST bst = new BST();
        Node root = bst.generateTree();
        System.out.println("Min : "+findMin(root));
        System.out.println("Max : "+findMax(root));
    }

    public static int findMin(Node root){
        if(root == null){
            return -1;
        }else if(root.leftChild == null){
            return root.data;
        }
        return findMin(root.leftChild);
    }

    private static int findMax(Node root){
        if(root == null){
            return -1;
        }else if(root.rightChild == null){
            return root.data;
        }
        return findMax(root.rightChild);
    }

}
