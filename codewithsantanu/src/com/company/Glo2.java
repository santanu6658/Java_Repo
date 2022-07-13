package com.company;

import java.util.Scanner;

//import java.util.Scanner;
//
public class Glo2 {
//    public static void main(String args[]){
//        Scanner a= new Scanner(System.in);
//        System.out.println("Enter the age of person");
//        int b=a.nextInt();
//        if(b<18){
//            System.out.println("not elgible");
//        }
//        else
//            System.out.println("elgible to vote");
//    }
    //------------------------------------------------
//    public static void main(String args[]){
//        Scanner a=new Scanner(System.in);
//        int no=23;
//        System.out.println("enter the no");
//        int c=a.nextInt();
//        if(c==no){
//            System.out.println("no is equal");
//        }else
//            System.out.println("no is not equal");
//    }
 public static void main(String args[]){
     Scanner a= new Scanner(System.in);
     System.out.println("Enter the age");{
         int age=a.nextInt();
         if(age<10){
             System.out.println("kid");
         }
         else if((age>=13) && (age<20) ){
             System.out.println("teenager");
         }
         else if((age>=20)&&(age<50)){
             System.out.println("adult");
         }
         else if((age>=50)&&(age<100)){
             System.out.println("old age");
         }
         else
             System.out.println("uncategerized");

     }
 }

















}




//------------------------------------------------









