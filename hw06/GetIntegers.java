////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//HW06
//GetIntegers
//The purpose of this program is to find the sum of five integers
//
//Import the scanner
import java.util.Scanner;
//define main class
public class GetIntegers{
    
    //define main method
    public static void main(String[] args){
        
        int firstNumber,secondNumber,thirdNumber,fourthNumber,fifthNumber,sum;
        Scanner myScanner= new Scanner( System.in );
        
        System.out.println("Please enter 5 non-negative integers:");
        for(firstNumber=1; !myScanner.hasNextInt() || ((firstNumber=myScanner.nextInt())<1);myScanner= new Scanner( System.in )){
            System.out.println("Invalid input, enter again");
        }
        for(secondNumber=1; !myScanner.hasNextInt() || ((secondNumber=myScanner.nextInt())<1);myScanner= new Scanner( System.in )){
            System.out.println("Invalid input, enter again");
        }
        for(thirdNumber=1; !myScanner.hasNextInt() || ((thirdNumber=myScanner.nextInt())<1);myScanner= new Scanner( System.in )){
            System.out.println("Invalid input, enter again");
        }
        for(fourthNumber=1; !myScanner.hasNextInt() || ((fourthNumber=myScanner.nextInt())<1);myScanner= new Scanner( System.in )){
            System.out.println("Invalid input, enter again");
        }
        for(fifthNumber=1; !myScanner.hasNextInt() || ((fifthNumber=myScanner.nextInt())<1);myScanner= new Scanner( System.in )){
            System.out.println("Invalid input, enter again");
        }
        sum=firstNumber+secondNumber+thirdNumber+fourthNumber+fifthNumber;
        System.out.println("Sum is "+sum);
        
        
    }
}