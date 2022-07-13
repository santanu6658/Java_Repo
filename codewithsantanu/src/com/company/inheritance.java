package com.company;

import org.w3c.dom.ls.LSOutput;

class Base1{
    Base1(){
        System.out.println("i am constructor");
    }
Base1(int x){
    System.out.println("i am overloaded constructor");
}

}
class Dervied1 extends Base1{
    Dervied1(){
        System.out.println("i am a derived class constructor");
    }
    Dervied1(int x, int y){
        super(x);
        System.out.println("i am overloaded constructor");
    }
    class ChildOfDeriveid1 extends Dervied1{
        ChildOfDeriveid1(){
            System.out.println(" i am child of derived constructor");
        }
        ChildOfDeriveid1(int x, int y,int z){
            super(x,y);
            System.out.println(("i am an overloaded constuctor"));
        }
    }
}

public class inheritance {
    public static void main(String args[]){
       // Base1 b=new Base1();
      //  Dervied1 d=new Dervied1();
       Dervied1 d=new Dervied1(14,6);
        //Dervied1.ChildOfDeriveid1 cd=new Dervied1.ChildOfDeriveid1(23,212,4);

    }
}
