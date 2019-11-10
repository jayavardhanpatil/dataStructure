package com.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jayavardhanpatil on 11/9/19
 */
public class BinaryTreeHightTraversal {

    public static void main(String[] args) {

        BST bst = new BST();
        Node root = bst.generateTree();
        BinaryTreeHightTraversal traversal = new BinaryTreeHightTraversal();
        traversal.levelOrderTravers(root);

    }

    private void levelOrderTravers(Node root){

        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (!q.isEmpty()){
            Node current = q.poll();
            System.out.println(current.data);

            if(current.leftChild != null){
                q.add(current.leftChild);
            }
            if(current.rightChild != null) {
                q.add(current.rightChild);
            }
        }

    }
}
