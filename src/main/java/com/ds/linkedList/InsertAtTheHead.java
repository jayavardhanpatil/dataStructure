package com.ds.linkedList;

/**
 * Created by jayavardhanpatil on 11/10/19
 */
public class InsertAtTheHead {

    public static void main(String[] args) {
        Node head = new Node();
        insert(head, 1);
         insert( head,5);
         insert( head, 3);
        insert( head,2);
        insert( head,8);
        insert( head,9);
        printList(head.next);
    }

    public static void insert(Node head, int data){
        Node temp = new Node();
        temp.data = data;
        temp.next = head.next;
        head.next = temp;
    }

    public static void printList(Node node){
        while (node!=null){
            System.out.print(node.data + "->");
            node = node.next;
        }
    }
}
