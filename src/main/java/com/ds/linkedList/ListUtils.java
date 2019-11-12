package com.ds.linkedList;

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
}
