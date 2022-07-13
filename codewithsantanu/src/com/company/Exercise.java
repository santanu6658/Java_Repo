package com.company;
class Cylinder{
    private int radius;
    private int height;
    int getRadius(){
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius+2*Math.PI*radius*height;
    }
    public Cylinder(int radius, int height){
        this.radius=radius;
        this .height=height;
   }
}

public class Exercise {
    public static void main(String args[]){
        Cylinder cd=new Cylinder(7,21);
//        cd.setRadius(7);
//        cd.setHeight(21);
        System.out.println(cd.getRadius());
        System.out.println(cd.getHeight());
        System.out.println(cd.surfaceArea());

    }
}
