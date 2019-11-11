package com.ds.linkedList;

/**
 * Created by jayavardhanpatil on 11/10/19
 */
public class InsertAtTheHead {

    static Node head = new Node();
    public static void main(String[] args) {
        insert(1);
        insert( 5);
        insert( 3);
        insert( 2);
        insert( 8);
        insert( 9);
        printList(head);
    }

    private static void insert(int data){
        Node temp = new Node();
        temp.data = data;
        temp.next = head;
        head = temp;
    }

    private static void printList(Node node){
        while (node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
