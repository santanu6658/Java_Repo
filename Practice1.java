import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Practice1 {
    public static int Fibonacci(int n){
        if(n==1 || n==2){return n-1;
    }
        else
            return Fibonacci(n-1) +Fibonacci(n-2);}
            public static int avg(int a,int b,int c){
        return (a+b+c)/3;
            }
            public static int star(int n){

        if(n<=0){
            return 0;}else{
                System.out.print("*");

        return star(n-1);
            }

                }
              public static  void pattern(int no,int i){
        if(no<=0){
            return;}
        else
                star(i);
                  System.out.println();
                  pattern(no-1,i-1);
        }



    public static void main(String args[]){
       // star(5);
        int n=5;
        pattern(n-1,n);
       // System.out.println("enter the valur");
        //Scanner sc=new Scanner(System.in);
        //int d= sc.nextInt();
          //  System.out.println(Fibonacci(d));
       // System.out.println(avg(45,34,50));
    }
}
