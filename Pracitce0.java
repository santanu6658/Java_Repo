import java.util.Locale;
import java.util.Scanner;

public class Pracitce0 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sumn(int no){
        if(no<=0){return 0;}
        else
        return no+sumn(no-1);
    }
    public static void main(String args[]){
        //System.out.println("enter the three no");
        Scanner sc=new Scanner(System.in);
//int a=sc.nextInt();
//int b= sc.nextInt();
//int c=sc.nextInt();
//float sum=a+b+c;
//        System.out.println("the sum of the three no is"+sum);
       // int a=sc.nextInt();
       // System.out.println("");
       // float b= sc.nextFloat();
       // System.out.println("does it has integer value");
     //   boolean b1=sc.hasNextInt();
        //System.out.println(b1);
        //System.out.println(b);
        //System.out.println(a);
       // System.out.println("enter the value of string");
        //String str=sc.nextLine();
        //System.out.println("  fs"+str);
//        String str1=sc.next();
//        System.out.println(" next"+str1);
//        System.out.println("enter the marks of three subject");
//        int math=sc.nextInt();
//int english= sc.nextInt();
//int sst=sc.nextInt();
//float total=(math+english+sst)/30;
//        System.out.println(total);
//String name=sc.next();
//        System.out.println("hello" +" "+name+" "+"have a good day");

       // System.out.println("=========================================");
//        System.out.println("enter the no u want to change  value into km into mile");
//        float km= sc.nextFloat();
//        float mile= (float) (km/1.6);
//        System.out.println("the km into mile"+mile);
//        System.out.println("===================================");
//        System.out.println("enter the number for checking");
//        System.out.println(sc.hasNextInt());


       // System.out.println("=================================");
      //  System.out.println(2&3);
//       int y=7;
//        System.out.println(++y);
//        System.out.println(y++);
//  int z=7;
////        System.out.println(z+y);
////        char a='B';
////        System.out.println(++a);
//
//
////char grade='B';
////grade=(char)(grade+8);
////grade=(char)(grade-8);
////        System.out.println(grade);
//char[] str={'H','A','R','R','y'};
//String s= new String(str);
//char [] str1={'s',' ','a','n'};
//String s1=new String(str1);
//        System.out.println(s1.replace(" ","_"));
//        System.out.println(s);
//        System.out.println("enter the name for replacement");
//String d=sc.nextLine();
//        System.out.println(s.toLowerCase());
//        String str2="dear <\name> , thanks a lot";
////        System.out.println(str2.replace("<\name>",d));
//int a=sc.nextInt();
//int b= sc.nextInt();
//int c= sc.nextInt();
//float total=(a+b+c)/3;
//if(total>=40&& a>=33 && b>=33 && c>=33){
//    System.out.println("congrats u passed");
//
//}
//else
//    System.out.println("FAIL");
//int i=100;
//while(i<200){
//    System.out.print(i);
//    i++;
//}
//int h=1;
//do{
//    System.out.println(h);
//    h++;
//}while(h<=10);
//for(int k=7;k!=0;k--){
//    System.out.println(k);
//}
//for(int i=4;i>1;i--){
//    for(int j=i;j>=0;j--){
//        System.out.print("*");
//    }
//    System.out.println();
//}
//        System.out.println("enter the table whose value u want");
//      //  Scanner c=new Scanner(System.in);
//        int d= sc.nextInt();
//        for(int i=1;i<=10;i++){
//            float multiply= d*i;
//            System.out.println(d+"*"+i+"="+multiply);
//
//        }
//for(int i=0;i<4;i++){
//    for(int j=0;j<i;j++){
//        System.out.print("*");
//    }
//    System.out.println();
//}

//int d=sum(45,35);
//        System.out.println("the sum of the two number"+d);
        System.out.println("enter the till the no u want ");
        int d= sc.nextInt();
        System.out.println(sumn(d));

    }
}
