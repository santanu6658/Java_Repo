package com.company;
import java.util.Random;
import java.util.Scanner;


public class class5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        System.out.println("Enter 0 for rock ,1 for paper ,2 for scissor");

         userInput = sc.nextInt();
         if(userInput>=3){
             System.out.println("sala thik se padh ");
         }

        Random random = new Random();
     int computerInput;
       computerInput = random.nextInt(3);
        if (userInput == computerInput) {
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("congrats  u win");
        } else {
            System.out.println("you are loser shame on you chi chi chi");
        }
        if (computerInput == 0) {
            System.out.println("other team choice  :  Rock");
        } else if (computerInput == 1) {
            System.out.println("other team choice  : Paper");
        } else if (computerInput == 2) {
            System.out.println(" other team choice  :  Scissors");
        }
    }
}
