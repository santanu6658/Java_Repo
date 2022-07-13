package com.company;
class Employe{
    int salary;
    int getSalary(){
        return salary;
    }
    String name;
    String getName(){
        return name;
    }
    void setName(String n){
        name=n;

    }
}

public class Class {
    public static void main( String args[]){
        Employe zeeshan =new Employe();
        zeeshan.salary=500000;
        zeeshan.setName("princey");
        System.out.println(zeeshan.getSalary());
        System.out.println(zeeshan.getName());


    }
}
