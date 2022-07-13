package com.company;
class Cellphone{
    void ring(){
        System.out.println("ringing............");
    }
    void vibrate(){
        System.out.println("vibrating..........");
    }
    void callFriend(){
        System.out.println("calling zeeshan");
    }
}

public class Class2 {
    public static void main(String[] args){
        Cellphone nokia=new Cellphone();
        nokia . ring();
        nokia .callFriend();

    }
}
