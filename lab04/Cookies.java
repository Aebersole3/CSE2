////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//lab04
//Cookies
//The function of this lab is to gather information as to how many cookies should be brought to an event.
//use a scanner to gather how many people, total cookies being bought, and return how many cookies each person gets
//also make sure that all imputs are valid.
//
//Import the scanner
import java.util.Scanner;
// 
//define the main class
public class Cookies {
    
    //define main method
    public static void main(String[] args) {
        
        //declare the variable for the scanner
        Scanner myScanner;
        myScanner=new Scanner( System.in );
        
        //Prompt the user for number of people
        System.out.print("Enter the number of people:");
        
        //Declare variables
        int nCookies;
        int nPeople;
        int nRecievedCookies;
        int cookiesNeeded;
        //use if statement to validate the input as an integer above 0
        if(myScanner.hasNextInt()){//boolean that will return true if myScanner is a int
            nPeople=myScanner.nextInt();//stores the int from the scanner into the variable for people
            //Validate the int is greater than 0
            if (nPeople>0){
                
            }
            
            else{
                System.out.println("You did not enter an int>0");
                return; //terminate the program
            }
            
        }
        else{
            System.out.println("You did not enter an int");
            return;//leaves the program(terminates the program)
        }
        
        
        
        //Prompt the user for number of cookies they are wanting to buy
        System.out.print("Enter the number of cookies:");
        
        //use if statement to validate the input as an integer above 0
        if(myScanner.hasNextInt()){//boolean that will return true if myScanner is a int
             nCookies=myScanner.nextInt();//stores the int into the variable cookies
             //Validate the int is greater than 0
            if (nCookies>0){
               
            }
            
            else{
                System.out.println("You did not enter an int>0");
                return; //terminate the program
            }
        }
        else{
            System.out.println("You did not enter an int");
            return;//leaves the program(terminates the program)
        }
        
        //Prompt the user for number of cookies they want each person to get
        System.out.print("How many cookies do you want each person to get:");
        
        //use if statement to validate the input as an integer above 0
        if(myScanner.hasNextInt()){//boolean that will return true if myScanner is a int
             nRecievedCookies=myScanner.nextInt();//stores the int into the variable cookies Recieved
             //Validate the int is greater than 0
            if (nRecievedCookies>0){
               
            }
            
            else{
                System.out.println("You did not enter an int>0");
                return; //terminate the program
            }
        }
        else{
            System.out.println("You did not enter an int");
            return;//leaves the program(terminates the program)
        }
        
        if(nCookies>=(nRecievedCookies*nPeople)){
            if(nCookies%(nPeople*nRecievedCookies)==0){
                System.out.println("You have enough, they will divide evenly.");
            }
            else{
                System.out.println("You have enough, but they will not divide evenly.");
            }
        }
        else{
            cookiesNeeded=(nRecievedCookies*nPeople)-nCookies;
            System.out.println("You will not have enough. You need to buy at least "+cookiesNeeded+" more.");
        }
        
        System.out.println("People:"+nPeople+" Cookies: "+nCookies);
        
    }//end of main method
    
}//end of main class