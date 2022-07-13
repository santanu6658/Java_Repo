import java.util.Scanner;

public class Practice22 {
    public static void prime(int n){
        int t=0;
        if(n<=1){
            System.out.println(n+"is not prime no");
        }else{
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println(n+"is not prime");
                t=1;
                break;
            }}
        if (t==0){
            System.out.println(n+"is prime number");
        }
        }
    }

public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number");
    int a=sc.nextInt();
    prime(a);

}}
