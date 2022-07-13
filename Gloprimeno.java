import java.util.Scanner;

public class Gloprimeno {
    public static int prime(int no,int n){
        if (no <= 2)
            return (n == 2) ? 1: 0;
        if (no % n == 0)
            return 0;
        if (n * n> no)
            return 1;


        return prime(no, n + 1);


    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no for checking prime no");
        int d=sc.nextInt();

    }
}
