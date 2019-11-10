package com.ds.tree;

import java.util.Scanner;

/**
 * Created by jayavardhanpatil on 11/8/19
 */
public class BST {

    public static void main(String[] args) {

        BST bst = new BST();
        Node root = bst.generateTree();

        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();

        System.out.println(bst.serachData(root, data));
    }

    private Node insert(Node root, int data){
        if(root == null){
            root = createNode(data);
        }else if(data <= root.data){
            root.leftChild = insert(root.leftChild, data);
        }else{
            root.rightChild = insert(root.rightChild, data);
        }
        return root;
    }

    private boolean serachData(Node root, int data){
        if(root == null) return false;
        else if(root.data == data) return true;
        else if(data < root.data) return serachData(root.leftChild, data);
        else return serachData(root.rightChild, data);
    }

    private Node createNode(int data){
        Node node = new Node();
        node.data = data;
        node.leftChild = null;
        node.rightChild = null;
        return node;
    }

    public Node generateTree(){
        BST bst = new BST();
        Node root = null;
        root = bst.insert(root, 12);
        root = bst.insert(root, 5);
        root = bst.insert(root, 15);
        root = bst.insert(root, 3);
        root = bst.insert(root, 7);
        root = bst.insert(root, 13);
        root = bst.insert(root, 17);
        root = bst.insert(root, 1);
        root = bst.insert(root, 9);
        return root;
    }
}
