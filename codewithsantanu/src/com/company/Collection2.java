package com.company;

import java.util.LinkedList;

public class Collection2 {
    public static void main(String [] args){
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l1.add(11);
        l1.add(14);
        l1.add(13);
        l2.add(14);
        l2.add(19);
        l2.add(34);
        l1.addAll(0,l2);
        System.out.println("linked list"+l1);
        System.out.println(("linked list of"+l1.contains(19)));
        System.out.println(l1.indexOf(34));

//        System.out.println("l1 linked list before "+l1);
//        l1.addFirst(0);
//        System.out.println("jfpas"+l1);

    }
}
