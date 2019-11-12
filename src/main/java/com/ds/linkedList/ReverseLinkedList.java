package com.ds.linkedList;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

/**
 * Created by jayavardhanpatil on 11/11/19
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        Node head = new Node();

        InsertAtTheHead.insert(head,1);
        InsertAtTheHead.insert( head,5);
        InsertAtTheHead.insert( head, 3);
        InsertAtTheHead.insert( head,2);
        InsertAtTheHead.insert( head,8);
        InsertAtTheHead.insert( head,9);
        ListUtils.printList(head.next);

        System.out.println("Reverse List");
        head = reverseListUsingRecursive(head.next);
        ListUtils.printListRecursive(head);

    }

    public static Node reverseList(Node head){
        Node current, previous, next;
        current = head;
        previous = null;

        while (current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }

    public static Node reverseListUsingRecursive(Node head){
        Node current;
        current = head;

        if(current.next == null){
            head = current;
            return head;
        }
        Node reversedhead = reverseListUsingRecursive(current.next);
        current.next.next = current;
        current.next = null;
        return reversedhead;
    }

}
