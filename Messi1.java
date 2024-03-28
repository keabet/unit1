package messi1;

import java.util.Scanner;


/**
  * Student Name: O Lonake
  * Student Number: ST10441897
 */
public class Messi1 {

 
    public static void main(String[] args) {
        
        // create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        double hours;
        double rate;
        double pay = 0;
        
        
        System.out.print("How many did yow work");
        hours = keyboard.nextDouble();
        System.out.print("How much do yoy get paid per hour?");
        rate = keyboard.nextDouble();
        
        //calculations
        if (hours <= 40) {
            //Calulate gross pay for hours or less
            pay = hours * pay;
        } else {
            //calculation gross pay for than 40 hours
            pay = hours * rate * pay;
        }
        
        //display results
        System.out.printIn("you earned $"+pay);
        }
      
    }
    
}
