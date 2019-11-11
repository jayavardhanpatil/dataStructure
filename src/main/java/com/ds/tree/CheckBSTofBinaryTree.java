package com.ds.tree;

import sun.swing.StringUIClientPropertyKey;

import javax.sound.midi.Soundbank;
import java.util.SortedMap;

/**
 * Created by jayavardhanpatil on 11/9/19
 */
public class CheckBSTofBinaryTree {

    public static void main(String[] args) {

        BST bst = new BST();
        Node root = bst.generateTree();
        root = new Node();


        System.out.println(isBinarySearchTree(root, Long.MIN_VALUE, Long.MAX_VALUE));

        System.out.println("Tre inorder traversal : "+usingInOrder(root));
    }

    private static boolean isBinarySearchTree(Node root, long min, long max){

        if(root == null){
            return true;
        }

        if(root.data >= min && root.data < max && isBinarySearchTree(root.leftChild, min, root.data) &&
        isBinarySearchTree(root.rightChild, root.data, max)){
            return true;
        }else{
            return false;
        }
    }

    private static Node previous = null;
    private static boolean usingInOrder(Node root){

        if(root == null){
            return true;
        }
        usingInOrder(root.leftChild);

        if(previous != null && root.data <= previous.data){
            return false;
        }
        previous = root;
        return usingInOrder(root.rightChild);

    }

}
