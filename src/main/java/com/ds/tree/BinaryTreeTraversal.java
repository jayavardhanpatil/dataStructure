package com.ds.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by jayavardhanpatil on 11/9/19
 */
public class BinaryTreeTraversal {

    public static void main(String[] args) {

        BST bst = new BST();
        Node root = bst.generateTree();

        preOrder(root);

        System.out.println("ed");
        inOrder(root);
        System.out.println("ed");
        postOrder(root);
        System.out.println("ed");
        System.out.println(inOrderTraversalWithIteration(root));

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

    private static List<Integer> inOrderTraversalWithIteration(Node root){

        LinkedList<Integer> lists = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while (current != null || !stack.isEmpty()){
            while (current!= null) {
                stack.push(current);
                current = current.leftChild;
            }
            current = stack.pop();
            lists.add(current.data);
            current = current.rightChild;
        }
        return lists;
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
