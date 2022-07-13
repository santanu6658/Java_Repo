import java.util.Scanner;


public class Glofirstassignment {
    public static void rno(int no) {

        if (no < 10) {

            System.out.println(no);
            return;
        } else {
            System.out.print(no % 10);
            rno(no / 10);
        }
    }

    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the no");
        int b = a.nextInt();

        rno(b);


    }
}