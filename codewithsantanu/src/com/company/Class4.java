package com.company;
class AccessModifier{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}

public class Class4 {
    public static void main(String[] args){
AccessModifier d=new AccessModifier();
AccessModifier e=new AccessModifier();
//e.id=10;e
e.setId(1);
        System.out.println("e.getId()");
    }
}
