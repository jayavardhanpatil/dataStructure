package com.ds.linkedList;

import javax.sound.midi.Soundbank;

/**
 * Created by jayavardhanpatil on 11/11/19
 */
public class ListUtils {

    public static void printList(Node node){
        while (node!=null){
            System.out.print(node.data + "->");
            node = node.next;
        }
    }

    public static void printListRecursive(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+"->");
        printListRecursive(node.next);
        /*while (node!=null){
            System.out.print(node.data + "->");
            node = node.next;
        }*/
    }

    public static void printDoublyLinkedLis(DoublyLinkedNode node){
        while (node.next!=null){
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println(node.data);
        System.out.println("Reverse List :");
            while (node!=null){
                System.out.println(node.data);
                node = node.previous;
            }

    }
}
