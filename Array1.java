import java.util.Scanner;

class ExmpArray{

int[] marks= new int[5];
void takingArray(){
    System.out.println("enter the array");
    Scanner sc=new Scanner(System.in);
 for(int i=0;i<marks.length;i++){
     marks[i]=sc.nextInt();
 }        }

    void display(){
        System.out.print("the array is");
        for(int i=0;i< marks.length;i++){
            System.out.print(marks[i]);
            System.out.print("\t");
    }

    //marks=sc.nextInt();
}
//ExmpArray(){
    public void reverseArray(){
        for(int i= (marks.length-1);i>=0;i--){
            System.out.println(marks[i]);
     //   }
    }
}

}
public class Array1 {

    public static void main(String args[]){
//        int [] a;
//        a=new int[5];
//        System.out.println();
        ExmpArray object=new ExmpArray();
        object.takingArray();
        object.display();
        object.reverseArray();

    }
}
