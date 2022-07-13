import java.util.Scanner;

public class Recursion {
//    public static int factorial(int num) {
//        if (num == 1) {
//            return 1;
//        } else
//            return factorial(num - 1) * num;
//    }
    //0112
public static int fabonanci(int no)    {
    if(no<=1){
        return 1;
    }
    else
        return fabonanci(no-1)+fabonanci(no-2);
    }
    public static void main(String args[]){
        System.out.println("enter the no for factorial no");
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
       // System.out.println(factorial (number));
        System.out.println(fabonanci(number));
    }
}
