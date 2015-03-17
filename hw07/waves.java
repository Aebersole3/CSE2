////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//hw07
//waves
//The purpose of this program is to output a set of waves of numbers that increases and decreases based on even/odd
//
//Import the scanner
import java.util.Scanner;
//
//define main class
public class waves{

    //Declare Main Method
    public static void main(String[] args){
        
        //Declaration of main variables
        int input;
        int currentNumber;
        int currentLine;
        int lineUnits;
        int numbersInLine;
        boolean evenOrOdd;
        
        System.out.print("Enter a number between 1 and 30:");
        //Declare a variable for the scanner imput
        Scanner myScanner=new Scanner( System.in );
        
        //While loop to make sure the input is a integer between 1 and 30
        while ((!myScanner.hasNextInt()) || (input= myScanner.nextInt())>30 || (input<1) ){
            System.out.println("Invalid input");
            myScanner= new Scanner( System.in );
        }
        //System of for loops to create output
        System.out.println("FOR LOOP:");
        for(currentNumber=0;currentNumber<input;currentNumber++){//first one to keep track of the current number being printed
            for (currentLine=0; currentLine<=currentNumber;currentLine++){//Keeps track of the line that is being printed
                if ((currentNumber%2==1)){//if statement to set up starting line elements based on even or odd
                    numbersInLine=0;
                }
                else{
                    numbersInLine=currentNumber;
                }
                evenOrOdd= (currentNumber%2 == 0);// boolean to test for even or odd, will be true if even
                    for (numbersInLine=currentNumber;evenOrOdd && (numbersInLine>=currentLine);numbersInLine--){//for loop if even
                        System.out.print(currentNumber+1);
                    }
                    for (numbersInLine=0;!evenOrOdd && (numbersInLine<=currentLine) ;numbersInLine++){//for loop if odd
                        System.out.print(currentNumber+1);
                    }
                    System.out.println("");
            }
        } 
        
        
        
        currentNumber=0;//reset the variable for beginning of loop
        System.out.println("");
        System.out.println("WHILE LOOP:");
        while(currentNumber<input){//first while loop to keep track of the currnt number being printed
            currentLine=0;//reset the current line to zero when the outer loop runs
            while(currentLine<=currentNumber){//
                numbersInLine=0;//initialization to make sure the variable is always initialized
                if ((currentNumber%2==1)){//if the number being printed is even, mod is reversed being my inital value start at 0 for number =1
                    numbersInLine=0;
                }
                else{//else if the number is odd
                    numbersInLine=currentNumber;
                }
                while (((currentNumber%2)==0) && (numbersInLine>=currentLine)){//print loop for odds
                    System.out.print(currentNumber+1);
                    numbersInLine--;
                }
                while (((currentNumber%2)==1) && (numbersInLine<=currentLine)){// print loops for even
                    System.out.print(currentNumber+1);
                    numbersInLine++;
                }
                System.out.println(" ");// prints out a space so that there is a new line for each new line being output
                currentLine++;
            }
            currentNumber++;
        }
        
        //Repeat the output with do loops
        currentNumber=0;
        System.out.println("");
        System.out.println("DO LOOP:");
        do{ //runs as long as the current number is less than the input
            currentLine=0;
            do{     //Runs as long as the number of the line is less than the number
                
                if ((currentNumber%2==0)){
                    numbersInLine=currentNumber;
                    do{
                    System.out.print(currentNumber+1);
                    numbersInLine--;
                    }while(((currentNumber%2)==0) && (numbersInLine>=currentLine));
                }
                else{
                    numbersInLine=0;
                    do{
                    System.out.print(currentNumber+1);
                    numbersInLine++;
                    } while(((currentNumber%2)==1) && (numbersInLine<=currentLine));
                }
                System.out.println(" ");
                currentLine++;
            } while(currentLine<=currentNumber);
            currentNumber++;
        } while (currentNumber<(input));
    }// end of main method
}//end of public class