package com.company;
 class Cylinder2{
     private int height;
     private int radius;
     int getRadius(){
         return radius;

     }
     void setRadius(int radius){
         this.radius=radius;
     }
     int getHeight(){
         return height;

     }
     void setHeight(int height){
         this.height=height;
     }
     Cylinder2(int radius,int height){
         this.radius=radius;
         this.height=height;

     }
public int area(){
         return (int) (Math.PI*radius*radius*height);
     }
}

public class Exercise2 {
    public static void main(String args[]){
Cylinder2 cd=new Cylinder2(7,70);
//cd.setHeight(7);
//cd.setRadius(70);
        System.out.println(cd.getRadius());
        System.out.println(cd.getHeight());
        System.out.println(cd.area());

    }
}
