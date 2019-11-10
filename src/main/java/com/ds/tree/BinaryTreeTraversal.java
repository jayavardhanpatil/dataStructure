package com.ds.tree;

/**
 * Created by jayavardhanpatil on 11/9/19
 */
public class BinaryTreeTraversal {

    public static void main(String[] args) {

        BST bst = new BST();
        Node root = bst.generateTree();

        preOrder(root);

        inOrder(root);

        postOrder(root);

    }

    private static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    private static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.leftChild);
        System.out.println(root.data);
        inOrder(root.rightChild);
    }


    private static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.println(root.data);

    }


}
