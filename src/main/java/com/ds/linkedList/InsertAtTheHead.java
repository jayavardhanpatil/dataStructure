package com.ds.linkedList;

import static com.ds.linkedList.ListUtils.printList;

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
}
