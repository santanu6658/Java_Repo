package com.company;
class Square{
    int side;
   public int area(){
       return side*side;
   }

    //float s;
    float perimeterArea(){
        return 4*side;
    }

}

public class Class3 {
    public static void main(String  args[]){
        Square  a=new Square();
        a.area();
        a.perimeterArea();

    }
}
