package com.company;
class Employee{
    int id;
    int salary;
    public void printDetails(){
        System.out.println(" my id is"+id);
        System.out.println("and my name is"+salary);
    }
    public int getSalary(){
        return salary;
    }
}

//import java.util.Locale;
//import java.util.Scanner;
//class calculate{
//
//
//int sum(int x,int y){
//  return x+y;
//}
//
//}
public class Main {
//
//  static int factorial(int n){
//    if (n==0){
//      return 1;
//    }
//    else
//      return n*factorial(n-1);
//  }
////  static void fun1(int n){
////    if(n>0){
////      System.out.println(n);
////      fun1(n-1);
////    }
////  }
//    static void printn(int num){
//      if (num==0)
//          return;
//      System.out.print("*");
//      printn(num-1);
//    }
//  static void pattern(int n, int i){
//    if(n==0)
//        return;
//    printn(i);
//        System.out.println("");
////      int num;
////      printn(num-1);
//
//    }
//
//
  public static void main(String[] args) {
////int n=3;
//
//        int n=5;
//        pattern(n,1);
//
////fun1(3);
////     calculate a=new calculate();
////  int d=   a.sum(23,45);
////      System.out.println(d);
////      int d=factorial(5);
////      System.out.println(d);
      Employee ankit= new Employee();
      ankit.id=12;
      ankit.salary=4999;
      ankit.printDetails();
//
//
    }}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        // write your code here
////byte age=34;
////        System.out.println(age);
////        Scanner sc=new Scanner(System.in);
////        System.out.println("enter the number");
////        int a= sc.nextInt();
////        System.out.println(a);
//
////        Scanner c=new Scanner(System.in);
////        float sum=0;
////
////        for(int i=0;i<=4;i++){
////            System.out.print("enter the marks in subject"+(i+1)+"=");
////            int a= c.nextInt();
////            System.out.println("the mark of student in subject "+(i+1)+" is  " +a);
////            sum+=a;
////        }
////        System.out.println(sum);
////        float percentage=(sum/500)*100;
////     System.out.println("the percentage of student is"+percentage+"%");
//
//
////        System.out.println(2|3);
////        System.out.println(2<<3);
////        System.out.println(2>>3);
////        System.out.println(2^3);
////        char[] str={'H','A','R','R','Y'};
////        String s=new String("str");
////        String stir="string";
////        String stire="string";
////        System.out.println(stire==stir);
////        System.out.println(stire.length());
////        String name=new String("S a ntanu");
////        name=name.toLowerCase();
////        System.out.println(name);
////  System.out.println(name.replace(" ","_"));
////
////String letter="Dear <|name|> , thanks a lot";
////Scanner scanner=new Scanner(System.in);
////        System.out.println("enter the name");
////        String s=scanner.nextLine();
////        System.out.println(letter.replace("<|name|>",s));
//
////String s="Dear santanu,\n\t this java course is nice.\nthanks!";
////        System.out.println(s);
////
////Scanner sc=new Scanner(System.in);
////        System.out.println("enter the marks of student in all subject");
////int a= sc.nextInt();;
////int b=sc.nextInt();
////int c=sc.nextInt();
////
////float sum=0;
////sum=a+b+c;
////float total=1;
////total=(sum/300)*100;
////if((a>=33&&b>=33&&c>=33)&&total>=40){
////
////    System.out.println("student is pass with percentage"+total+"%");
////}
////else
////    System.out.println("fail");
//
//
////Scanner sc=new Scanner(System.in);
//
////        System.out.println("enter the no of days");
////        int days=sc.nextInt();
////        switch (days){
////      case 1 -> System.out.println("Monday");
////            case 2 -> System.out.println("Tuesday");
////            case 3 -> System.out.println("Wednesday");
////            case 4 -> System.out.println("Thursday");
////            case 5 -> System.out.println("Friday");
////            case 6 -> System.out.println("Saturday");
////            case 7 -> System.out.println("Sunday");
////        }
////        String website=sc.next();
////        if(website.endsWith(".org")){
////            System.out.println("this is organizational website");
////        }
////        else if(website.endsWith(".in")){
////            System.out.println("this is commercial website");
////        }
////        else {
////            System.out.println("this is indian website");
////
////
////        }
//
//
////int i=0;
////while(i<=100){
////    System.out.println(i);
////    i++;
////}
////int i=1;
////do{
////    System.out.println(i+"\t");
////    i++;
////}while(i<=10);
////        for(int i=1;i<=10;i=i+2 ){
////            System.out.print(i);
////        }
//
////        for (int i =3 ; i >= 0; i--) {
////            for (int j = 0; j < i; j++) {
////                System.out.print("*");
////            }
////            System.out.println("\n");
////
////
////        }
////
//
//
////
////        Scanner sc=new Scanner(System.in);
////        float sum=0;
////        System.out.println("enter the no");
////        float n=sc.nextFloat();
////        for(int i=0;i<=n;i=i+2){
////            sum=sum+i;
////        }
////        System.out.println(sum);
//
//
////        Scanner sc =new Scanner(System.in);
////        System.out.println("Enter the no whose table u want");
////        int n= sc.nextInt();
////        int product=1;
////        for(int i=10;i>=1;i--){
////            product=n*i;
////            System.out.println(n+"*"+i+"="+product);
////        }
//
//
//int [] marks;
//marks=new int[5];
//int []mark=new int[5];
//int [] mar={100,29,34,34};
//
//int [] marks={1,2,34,42,4};
//for(int i:marks) {
//    System.out.println(i);
//
//
//}
//        System.out.println(marks.length);


//int [][] flats=new int[2][3];
//flats[0][0]=101;
//flats[0][1]=103;
//flats[1][0]=102;
//flats[1][1]=109;
//        System.out.println("2 D array");
//        for(int i=0;i<flats.length;i++){
//            for(int j=0;j<flats[i].length;j++){
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }


//        float[] arr = new float[12];
////        Scanner sc = new Scanner(System.in);
////        int i;
////        float sum = 0;
////        for (i = 0; i <= 5; i++) {
////            arr[(int) i] = sc.nextFloat();
////
////            sum = sum + arr[i];
////
////        }
////        System.out.println(sum);
////        System.out.println("array elements are");
////        for ( i =0;i<=5;i++) {
////            System.out.print(arr[(int) i]);
////        }
////        System.out.println(sum);d. /f
//int i;
//        Scanner sc=new Scanner(System.in);
//        int [] arr=new int[23];
//
//for( i=0;i<3;i++){
//arr[i]= sc.nextInt();
//}
//
//for( i=0;i<3;i++) {
//    System.out.println(arr[i]);
//}
//        System.out.println("enter the number u want to search");
//        int n= sc.nextInt();
//        boolean isInArray=false;
//
//for( i=0;i<3;i++)
//    if (arr[i] == n) {
//        isInArray = true;
//
//        break;
////        System.out.println("number found"+(i));
////    }
////    else {
////        System.out.println("no not found");
////        break;
//    }
//if(isInArray==true){
//
//    System.out.println("the value is present in"+(i+1));
//}
//else
//    System.out.println("not present");



















































//Scanner sc=new Scanner(System.in);
//int i;
////float avg=0;
////int[] arr=new int[93];
////for(i=0;i<=3;i++){
////    arr[i]= sc.nextInt();
////    avg=avg+arr[i];
////}
////avg=avg/4;
////for(i=0;i<=3;i++){
////    System.out.println(arr[i]);
////}
////        System.out.println(avg);
//        int [][] result=new int[2][3] ;
//        int i,j,k,l;
//int[][]arr=new int[2][3];
//int [][]arr2=new int[2][3];
//  Scanner sc=new Scanner(System.in);
//        System.out.println("eneter the array");
//  for(i=0;i<2;i++){
//      for(j=0;j<3;j++){
//          arr[i][j]= sc.nextInt();
//
//      }
//  }
//        System.out.println("enter the second array");
//        for(i=0;i<2;i++){
//            for(j=0;j<3;j++){
//                arr2[i][j]= sc.nextInt();
//
//            }
//        }
//
//
//
//        for(i=0;i<2;i++){
//            for(j=0;j<3;j++){
//
//                System.out.print(arr[i][j]+" ");
//
//            }
//            System.out.println();
//        }
//        for(i=0;i<2;i++){
//            for(j=0;j<3;j++){
//
//                System.out.print(arr2[i][j]+" ");
//
//            }
//            System.out.println();
//        }
//
//for(i=0;i<arr.length;i++){
//    for(j=0;j< arr2.length;j++){
//        result[i][j]=arr[i][j]+arr2[i][j];
//    }
// System.out.println(" ");
//}






































