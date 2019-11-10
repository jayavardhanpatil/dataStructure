package com.ds.tree;

/**
 * Created by jayavardhanpatil on 11/9/19
 */
public class DeleteNodeInBinaryTree {

    public static void main(String[] args) {

        BST bst = new BST();
        Node root = bst.generateTree();

        deleteNode(root, 15);
        System.out.println(root);
    }

    private static Node deleteNode(Node root, int data){

        if(root == null){
            return root;
        } else if(data < root.data) {
            root.leftChild = deleteNode(root.leftChild, data);
        } else if(data > root.data){
            root.rightChild = deleteNode(root.rightChild, data);
        }else{

            //Leaf Node
            if(root.leftChild == null && root.rightChild == null){
                root = null;
            }

            //Node contains only one child
            else if(root.leftChild == null){

                root = root.rightChild;
            }
            else if(root.rightChild == null){
                root = root.leftChild;
            }
            else {
                //Node have 2 childs
                Node temp = findMinNode(root.rightChild);
                root.data = temp.data;
                root.rightChild = deleteNode(root.rightChild, temp.data);
            }

        }
        return root;
    }

    private static Node findMinNode(Node root){
        if(root == null){
            return root;
        }else if(root.leftChild == null){
            return root;
        }
        return findMinNode(root.leftChild);
    }

}
