////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//hw04
//WhichNumber
//The purpose of this program is to guess the number of the user that is between 1 and 10 through a serious of questions.
// 
//Import the scanner
import java.util.Scanner;
//
//define main Class
public class WhichNumber{

    //DeClare main method
    public static void main(String[] args) {
        
        //declare scanner variable
        Scanner myScanner;
        myScanner =new Scanner( System.in );
        
        System.out.println("Think of a number between 1 and 10 inclusively.");
        
        System.out.print("Is your number even?");
        char answerEven= myScanner.next().trim().charAt(0); //Searched how to take the first char from an input of scanner
        //System.out.println(answerEven);
        
        switch (answerEven){//main switch A
            case 'Y'://main case A
            case 'y'://main case a
                System.out.print("Is it divisible by 3?");
                char answerDivThree =myScanner.next().trim().charAt(0);
                switch (answerDivThree){//switch A
                    case 'Y'://Switch A case 1
                    case 'y'://Switch A case 1
                        System.out.print("Is your number 6?");
                        char answerThree =myScanner.next().trim().charAt(0);
                        switch (answerThree){
                            case 'Y':
                            case 'y':
                                System.out.println("Yay!");
                            break;
                            case 'N':
                            case 'n':
                                System.out.println("Boo, you lie!");
                        }
                    break;
                    case 'N'://Switch A Case 2
                    case 'n'://Switch A Case 2
                        System.out.print("Is it divisible by 4?");
                        char answerDivFour =myScanner.next().trim().charAt(0);
                        switch (answerDivFour){
                            case 'Y':
                            case 'y':
                                System.out.print("Is the number divided by 4 greater than 1?");
                                char numberDivFour =myScanner.next().trim().charAt(0);
                                switch(numberDivFour){
                                    case 'Y':
                                    case 'y':
                                        System.out.print("Is your number 8?");
                                        char answerEight =myScanner.next().trim().charAt(0);
                                        switch (answerEight){
                                            case 'Y':
                                            case 'y':
                                                System.out.println("Yay!");
                                            break;
                                            case 'N':
                                            case 'n':
                                                System.out.println("Boo, you lie!");
                                            break;
                                        }
                                    case 'N':
                                    case 'n':
                                        System.out.print("Is your number 4?");
                                        char answerFour =myScanner.next().trim().charAt(0);
                                        switch (answerFour){
                                            case 'Y':
                                            case 'y':
                                                System.out.println("Yay!");
                                            break;
                                            case 'N':
                                            case 'n':
                                                System.out.println("Boo, you lie!");
                                            break;
                                        }
                                    break;
                                }
                            break;
                            case 'N':
                            case 'n':
                                System.out.print("Is it divisible by 5?");
                                char answerDivFive =myScanner.next().trim().charAt(0);
                                switch(answerDivFive){
                                    case 'Y':
                                    case 'y':
                                        System.out.print("Is your number 10?");
                                        char answerTen =myScanner.next().trim().charAt(0);
                                        switch (answerTen){
                                            case 'Y':
                                            case 'y':
                                                System.out.println("Yay!");
                                            break;
                                            case 'N':
                                            case 'n':
                                                System.out.println("Boo, you lie!");
                                            break;
                                        }
                                    break;
                                    case 'n':
                                    case 'N':
                                        System.out.print("Is your number 2?");
                                        char answerTwo =myScanner.next().trim().charAt(0);
                                        switch (answerTwo){
                                            case 'Y':
                                            case 'y':
                                                System.out.println("Yay!");
                                            break;
                                            case 'N':
                                            case 'n':
                                                System.out.println("Boo, you lie!");
                                            break;
                                        }
                                
                                }
                        }
                }
            break;
            case 'N'://main case B
            case 'n'://main case b
                 System.out.print("Is it divisible by 3?");
                answerDivThree =myScanner.next().trim().charAt(0);
                switch (answerDivThree){//switch A
                    case 'Y'://Switch A case 1
                    case 'y'://Switch A case 1
                        System.out.print("Is the number divided by 3 greater than 1?");
                        char numberDivThree =myScanner.next().trim().charAt(0);
                        switch(numberDivThree){
                            case 'Y':
                            case 'y':
                            System.out.print("Is your number 9?");
                            char answerNine =myScanner.next().trim().charAt(0);
                            switch (answerNine){
                                case 'Y':
                                case 'y':
                                    System.out.println("Yay!");
                                break;
                                case 'N':
                                case 'n':
                                    System.out.println("Boo, you lie!");
                                break;
                                        }
                            break;
                            case 'N':
                            case 'n':
                            System.out.print("Is your number 3?");
                            char answerThree =myScanner.next().trim().charAt(0);
                            switch (answerThree){
                                case 'Y':
                                case 'y':
                                    System.out.println("Yay!");
                                break;
                                case 'N':
                                case 'n':
                                    System.out.println("Boo, you lie!");
                                break;
                                        }
                            break;
                        }
                    break;
                    case'n':
                    case'N':
                        System.out.print("Is it greater than 6?");
                        char numberGreaterSix =myScanner.next().trim().charAt(0);
                        switch(numberGreaterSix){
                            case 'Y':
                            case 'y':
                                System.out.print("Is your number 7?");
                                char answerSeven =myScanner.next().trim().charAt(0);
                                switch (answerSeven){
                                    case 'Y':
                                    case 'y':
                                        System.out.println("Yay!");
                                    break;
                                    case 'N':
                                    case 'n':
                                        System.out.println("Boo, you lie!");
                                    break;
                                    
                                }
                                
                            break;
                            case 'N':
                            case 'n':
                                System.out.print("Is it less than 3?");
                                char numberGreaterThree =myScanner.next().trim().charAt(0);
                                switch(numberGreaterThree){
                                    case 'y':
                                    case 'Y':
                                        System.out.print("Is your number 5?");
                                        char answerFive =myScanner.next().trim().charAt(0);
                                        switch (answerFive){
                                            case 'Y':
                                            case 'y':
                                                System.out.println("Yay!");
                                            break;
                                            case 'N':
                                            case 'n':
                                                System.out.println("Boo, you lie!");
                                            break;
                                        }
                                    break;
                                    case 'n':
                                    case 'N':
                                        System.out.print("Is your number 1?");
                                        char answerOne =myScanner.next().trim().charAt(0);
                                        switch (answerOne){
                                            case 'Y':
                                            case 'y':
                                                System.out.println("Yay!");
                                            break;
                                            case 'N':
                                            case 'n':
                                                System.out.println("Boo, you lie!");
                                            break;
                                        }
                                    break;
                                }
                                
                                
                            break;
                            }
                                
                    break;
                    
                }
            break;
            default:
                System.out.println("Sorry that is not a valid input.");//case if they input a non-Y/N/y/n
            break;
        }//End of main Switch A
        
        
    }//end of main method
}//end of main class