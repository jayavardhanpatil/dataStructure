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
}
