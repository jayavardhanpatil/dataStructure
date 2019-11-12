package com.ds.linkedList;

import static com.ds.linkedList.ListUtils.printDoublyLinkedLis;

/**
 * Created by jayavardhanpatil on 11/11/19
 */
public class DoublyLinkedList {

    public static void main(String[] args) {

        DoublyLinkedNode head = null;

        head = insertNodeAtHead(head, 1);
        head = insertNodeAtHead(head, 2);
        head = insertNodeAttail(head, 5);
        head = insertNodeAttail(head, 6);
        System.out.println(head);
        printDoublyLinkedLis(head);

    }

    public static DoublyLinkedNode insertNodeAtHead(DoublyLinkedNode head, int data){

        DoublyLinkedNode newNode = createNewNode(data);
        if(head == null){
            head = newNode;
            return head;
        }
        head.previous = newNode;
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static DoublyLinkedNode insertNodeAttail(DoublyLinkedNode head, int data){

        DoublyLinkedNode temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }

        DoublyLinkedNode newNode = createNewNode(data);
        temp.next = newNode;
        newNode.previous = temp;
        return head;
    }

    public static DoublyLinkedNode createNewNode(int data){
        DoublyLinkedNode newNode = new DoublyLinkedNode();
        newNode.data = data;
        newNode.previous = null;
        newNode.next = null;
        return newNode;
    }

}
