package com.company;

import java.util.ArrayList;
import java.util.*;

public class Collection {
    public static void main(String [] args){
       //// ArrayList<Integer>
        //arraylist
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l1.add(6);
        l1.add(634);
        l1.add(34);
        l1.add(7);
        l1.add(6);
        l2.add(32);
        l2.add(43);
        l2.add(78);
       // l1.clear();
        l1.remove(3);
       // l1.addAll(l2);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println("index of 6"+l1.indexOf(78));
        //System.out.println(l1.);

    }
}
