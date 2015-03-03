////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//lab06
//GetFActorial
//The purpose of this program is to take a positive integer and find it's factorial
//
//Import the scanner
import java.util.Scanner;
//define main class
public class RunFactorial{
    
    //define main method
    public static void main(String[] args){
        
        System.out.println("Please enter an integer that is between 9 and 16:");
        
        //Declare a variable for the scanner imput
        Scanner myScanner=new Scanner( System.in );
        int factor;
        int remainder;
        int factorial;
        
        while( (!myScanner.hasNextInt()) || (((factor=myScanner.nextInt())<9) || (16<factor) )){
            System.out.println("Invalid input, enter again");
            myScanner=new Scanner( System.in );
            
        }
        System.out.println("Input accepted:");
        System.out.println(factor);
        factorial=1;
        remainder=factor;
        while (remainder>=1){
            factorial=(factorial*remainder);
            remainder--;
        }
        System.out.println(factor+"!="+factorial);
    }
}