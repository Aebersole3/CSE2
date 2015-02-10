////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//hw03
//Root
//This program should prompt the user for two digits, the first being the count of the cyclometer and the second being the time in seconds.
//tthe the program should calculate and output the distance in miles, time in minutes and average mph.
//
//Import the scanner
import java.util.Scanner;
// 
//define the main class
public class Root {
    
    //declare main method
    public static void main(String[] args) {
        
        //declare the variable for the scanner
        Scanner myScanner;
        myScanner =new Scanner( System.in );
        
        //prompt the user a number and say you will return the cube root
        System.out.print("Enter a double, and i will return its cube root:");
        double myNumber= myScanner.nextDouble();
        
        //start guessing and working toward the cube root
        double guessOne= myNumber/3;
        double guessTwo= (2*guessOne*guessOne*guessOne+myNumber)/(3*guessOne*guessOne);
        double guessThree= (2*guessTwo*guessTwo*guessTwo+myNumber)/(3*guessTwo*guessTwo);
        double guessFour= (2*guessThree*guessThree*guessThree+myNumber)/(3*guessThree*guessThree);
        double guessFive= (2*guessFour*guessFour*guessFour+myNumber)/(3*guessFour*guessFour);
        double guessSix= (2*guessFive*guessFive*guessFive+myNumber)/(3*guessFive*guessFive);
        
        //Return the final guess and its cube 
        System.out.println("The cube root is "+guessSix);
        System.out.println(guessSix+"*"+guessSix+"*"+guessSix+"=");
        System.out.println(guessSix*guessSix*guessSix);
        
        
        
    }
    
    
    
}