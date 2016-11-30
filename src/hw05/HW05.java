/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw05;

import java.util.*;

/**
 *
 * @author Robyn
 */
public class HW05 {

    //main method
    //Generate scanner and random number
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        //do integers
        int guess = 0;
        int guessH = 0;
        int guessL = 0;
        int guessR = 0;
        int percent=0;
        int number = rand.nextInt(10) + 1;
        String reply = ("y");
        double guessCount = 0;
        /*start an infinite loop
        *start game
        *do an if statement
         */
        while (reply.equalsIgnoreCase("y")) {
            System.out.print("Guess a number ");
            guess = input.nextInt();
            guessCount++;   // Keep track of number of games played
            if (guess < number) {
                System.out.println("You are too low.");
                guessL++;   // Keep track of low guesses
                System.out.println("You got  " + guessL + " low guess!");
            } else if (guess > number) {
                System.out.println("You are too high.");
                 guessH++;  // Keep track of high guesses
                System.out.println("You got " + guessH + " high guess!");
            } else if (guess == number) {
                System.out.println("You have won!!!");
                guessR++;   // Keep track of wins.
                System.out.println("You got it right in " + guessCount + " guesses!");
              
            }  else {
                return;
            }
            //do a second if else statement
            System.out.printf("%s%n%s%n", "Would you like to play again?", "yes/no");
            reply = input.next();

        }//while
                // Print game stats
                System.out.println("Goodbye!");
                int guessG = (int) guessCount - guessR;
                System.out.println("Bad guesses " + guessG);
                System.out.println("Good guesses " + guessR);
                // calculate percentage overall
                if (guessR!=0) percent = (int) (guessR / guessCount * 100) ;
                System.out.println ("Percent of good guesses "+percent+ "%");
    }//end main

}//end class

//Good job, Robyn
