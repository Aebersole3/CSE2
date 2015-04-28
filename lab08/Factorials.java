////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//Lab08
//Factorials
//The purpose of this program is to take an input and by using multiple methods, output the sum of the factorials up to a number
//
//Import the scanner
import java.util.Scanner;
//
//define main class
public class Factorials{

    //Declare 1st Auxillary method: factorial
    public static int factorial(int input){
        int sum =0;
        while (input>0){//while loop to keep the sum of the factorials
            int factor=input;
            int factorial=1;
            while(factor>0){//while loop to find the factorial of a number
                factorial=factor*factorial;
                factor--;
            }
            sum=sum+factorial;
            input--;
        }
        return sum;// return the value of the variable sum.
    }


    //Declare auxillary method: print
    public static void print(int inputOne, int sumOne){
        System.out.println("The super factorial of "+inputOne+" is "+sumOne);//just a print line
        return;//return for a void method
    }


    //Declare Main Method
    public static void main(String[] args){
        
        //Declare Variable
        int userInput;
        int factorialSum;
        System.out.print("Enter a positive integer:");
        //Declare a variable for the scanner imput
        Scanner myScanner=new Scanner( System.in );
        
        //While loop to make sure the input is a positive integer 
        while ((!myScanner.hasNextInt()) || (userInput= myScanner.nextInt())<1 ){
            System.out.println("Invalid input");
            myScanner= new Scanner( System.in );
        }
       
        // call the method factorial and return the answer and store it in the variable factorialSum
        factorialSum=factorial(userInput);
        
        //call the method print
        print(userInput, factorialSum);
    }//end of main method
}//end of public class
