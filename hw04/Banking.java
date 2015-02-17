////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//hw04
//Banking
//The purpose of this program is to simulate a banking program with the functions of giving the following functions:
//  depositing money,withdrawing money or viewing their balance.
//
//Import the scanner
import java.util.Scanner;

//define main class
public class Banking{

    //Declare Main Method
    public static void main(String[] args){
        //Declare a variable for the scanner imput
        Scanner myScanner=new Scanner( System.in );
        
        //Set a random number between 1000-5000 as bank balance
        int startingBalance= (int) ((Math.random()*4000)+1000) ;
        
        System.out.println("Current Balance:$"+startingBalance);//print oput starting balance
        
        //print out main menu with options
        System.out.println("Input the number of what you would like to do:");
        System.out.println("1) Deposit money");
        System.out.println("2) Withdraw money");
        System.out.println("3) View your balance");
        int mainMenu = myScanner.nextInt();//store main menu choice
        switch (mainMenu){// switch statement to use their choice
            case 1:
                System.out.print("Deposit amount:");
                //Check to see if the user's input is correct
                if (myScanner.hasNextDouble()){
                    double depositAmount= myScanner.nextDouble();
                    if (depositAmount>=0){
                    double finalBalance=(depositAmount+startingBalance);
                    System.out.println("Your balance is:$"+finalBalance);
                    }//end of if depositAmount
                    else{
                        System.out.println("You entered a negative number.");
                        return;
                        }//end of else depositAmount
                    }//end of if myScanner
                else {
                    System.out.println("You did not enter a number");
                    return;
                     }//end of else myScanner
                break;
            case 2:
                System.out.print("Withdraw amount:");
                //Check to see if the user's input is correct
                if (myScanner.hasNextDouble()){
                    double withdrawAmount= myScanner.nextDouble();
                    if (withdrawAmount>=0){
                        if(withdrawAmount>startingBalance){
                            System.out.println("Insufficient Funds");
                        }//end of if withdrawAmount(2)
                            else{
                            double finalBalance=(startingBalance-withdrawAmount);
                             System.out.println("Your balance is:$"+finalBalance);
                            }
                    }//end of if withdarwAmount(1)
                    else{
                        System.out.println("You entered a negative number.");
                        return;
                    }//end of else withdrawAmount(1)
                }//end of if myScanner
                else {
                    System.out.println("You did not enter a number");
                    return;
                     }//end of else myScanner
                break;
            case 3://just displays starting balance
                System.out.println("Your balance is:$"+startingBalance);
                
                break;
            default:
                System.out.println("That was not a valid input.");
                return;
                
        }//end of switch(mainMenu)
        
        
        
        
        
    }//end of main method
}//end of main class