package com.ds.linkedList;

import static com.ds.linkedList.ListUtils.printList;

/**
 * Created by jayavardhanpatil on 11/11/19
 */
public class DeleteTheNodeAtNthPosition {

    public static void main(String[] args) {

        Node head = new Node();

        InsertAtTheHead.insert(head,1);
        InsertAtTheHead.insert( head,5);
        InsertAtTheHead.insert( head, 3);
        InsertAtTheHead.insert( head,2);
        InsertAtTheHead.insert( head,8);
        InsertAtTheHead.insert( head,9);


        printList(head.next);
        deleteNodeAtNthPosition(head, 3);
        System.out.println("\n");
        printList(head.next);

    }


    public static void deleteNodeAtNthPosition(Node head, int position){
        int count = 1;
        Node currentNode = head;
        while (count < position ){
            count++;
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;

    }
}
