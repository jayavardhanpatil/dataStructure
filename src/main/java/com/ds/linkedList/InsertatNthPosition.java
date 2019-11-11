package com.ds.linkedList;

import static com.ds.linkedList.ListUtils.printList;

/**
 * Created by jayavardhanpatil on 11/11/19
 */
public class InsertatNthPosition {

    public static void main(String[] args) {

        Node head = new Node();

        //First add few data to linked list.
       InsertAtTheHead.insert(head,1);
       InsertAtTheHead.insert( head,5);
       InsertAtTheHead.insert( head, 3);
       InsertAtTheHead.insert( head,2);
       InsertAtTheHead.insert( head,8);
       InsertAtTheHead.insert( head,9);

        System.out.println("Before Inserting ");
        printList(head.next);
        System.out.println("\nafter Inserting ");
       int position = 1;
        InsertAtThePosition(head, position, 30);
        System.out.println("\nafter Inserting ");
        printList(head.next);

        position = 5;
        InsertAtThePosition(head, position, 10);
        System.out.println("\nafter Inserting ");
        printList(head.next);

        position = 5;
        InsertAtThePosition(head, position, 20);
        System.out.println("\nafter Inserting ");
        printList(head.next);

    }

    private static void InsertAtThePosition(Node head, int position, int data){
        Node temp = new Node();
        Node currentNode = head;
        temp.data = data;
        int count = 1;

        while (currentNode!= null && count < position){
            currentNode = currentNode.next;
            count++;
        }

        temp.next = currentNode.next;
        currentNode.next = temp;
    }
}
