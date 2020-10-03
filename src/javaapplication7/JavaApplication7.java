/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author doads
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int score =0;

        int correct=0;

        int incorrect=0;

        Scanner scr=new Scanner(System.in);

        System.out.println("Enter your name: ");

        //get name

        String name=scr.nextLine();

        System.out.println("Welcome "+name);

        System.out.println("Are you ready to learn ? ");

        char response=scr.next().toLowerCase().charAt(0);

        boolean ready=false;

        

        //if user wants to learn then start questions

        if(response == 'y' ) ready=true;

        while(response!='n'){

            //creating random integers between 0 and 100

            for(int i = 0; i < 100; i++){
         int n1 = 0 + (int)(Math.random() * 100);
        int n2 = 0 + (int)(Math.random() * 100);

            System.out.println("What will be the quotient when "+ n1 + " is divided by "+ n2);

            //getting the answer

            int ans=scr.nextInt();

            //if answer is correct

            if(ans==n1/n2) {

                System.out.println("Correct Answer. Keep it up!");

                //increment number of correct answers

                correct++;

                //increment score

                score+=5;

        }

        //if other is incorrect

        else {

            System.out.println("Nice Try but "+ n1 +" / "+ n2 + " = " +n1/n2);

            //increment number of incorrect answers

            incorrect++;

        }

        //asking the user to continue

        System.out.println("Will you like to continue or stop ?");

        response=scr.next().toLowerCase().charAt(0);

        //if user stops

        //then exit the loop

        if(response =='s') break;

    }
        }

    System.out.println("Nice effort "+ name + " .Thank you");

    //display total answered, correct answers, incorrect answers, score

    System.out.println("Total Answered: "+(correct + incorrect));

    System.out.println("Correct Answers: "+correct);

    System.out.println("Incorrect Answers: "+incorrect);

    System.out.println("Score: "+score);

}
    
    
}
