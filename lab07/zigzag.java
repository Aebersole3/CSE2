////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//Lab07
//zigzag.java
//The purpose of this program is to print out a program with a number between 3 and 33 starts in the form of a z input from the user
//
//Import the scanner
import java.util.Scanner;

//define main class
public class zigzag{

    //Declare Main Method
    public static void main(String[] args){
        //Declare a variable for the scanner imput
        Scanner myScanner=new Scanner( System.in );
        
        //Declaration of variables
        int nStars=0;//input by user on how many stars
        int partOneCounter=0;//counter
        int partTwoCounter=0;//counter
        int partThreeCounter=0;//counter
        int nStarts=0;
        String zag="";//string for printing
        char answerRun='y';//input from user who wants to run the program.
        
        //beginning of outermost loop.
        while (answerRun=='y' || answerRun == 'Y') {    //checks to see if the user wants to run the program
        System.out.print("Enter an int between 3 - 33:");
        while ((!myScanner.hasNextInt()) || (nStars= myScanner.nextInt())>33 || (nStars<3) ){   //makes sure input is valid
            System.out.println("Invalid Input, try again.");
            myScanner=new Scanner( System.in );
        }
            
        
            while (partOneCounter<nStars){  //first while loop to output first line of starts
                System.out.print("*");
                partOneCounter++;
                if(partOneCounter==nStars){//resets string value
                    zag="*";
                    System.out.println("");
                }
                
                while((partOneCounter==nStars) && (partTwoCounter<nStars)){ //prints out the diagonal stars
                    System.out.println(zag);
                    zag=" "+zag;
                    partTwoCounter++;
                    
                    while((partOneCounter==nStars) & (partTwoCounter==nStars) & (partThreeCounter<nStars)){ //prints final row of stars
                        System.out.print("*");
                        partThreeCounter++;
                    }
                }
            }
            System.out.println("");//puts question on its own line
            System.out.print("Enter 'y' or 'Y' to go again:");
            answerRun= myScanner.next().trim().charAt(0); //recieves answer of the user's input
            
        }//end of outermost loop

    }// end of main method
    
}//end of public class