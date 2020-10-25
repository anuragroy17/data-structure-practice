package com.anuragroy.linkedlist;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        LinkedList list =  new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);

        System.out.println(list.indexOf(30));

        System.out.println(list.contains(30));

        list.removeFirst();
        list.removeLast();


        System.out.println(list.size());
        int[] array = list.toArray();
        System.out.println(Arrays.toString(array));

        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));

        LinkedList list2 =  new LinkedList();
        list2.addLast(10);
        list2.addLast(20);
        list2.addLast(30);
        list2.addLast(40);
        list2.addLast(50);

        System.out.println(list2.getKthFromTheEnd(2));
    }
}
