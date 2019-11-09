package com.ds.tree;

/**
 * Created by jayavardhanpatil on 11/9/19
 */
public class FindingHeightOfBinaryTree {

    public static void main(String[] args) {

        BST bst = new BST();
        Node root = bst.generateTree();
        System.out.println(heightOfTheTree(root));
    }

    private static int heightOfTheTree(Node root){

        if(root == null){
            return -1;
        }
        int leftHight = heightOfTheTree(root.leftChild);
        int rightHight = heightOfTheTree(root.rightChild);
        return Math.max(leftHight, rightHight) + 1;
    }
}
