////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//hw03
//FourDigits
//The purpose of this program is to display the first four digits of the decimal of any double given by the user.
//
//Import the scanner and store as a variable
import java.util.Scanner;
//
//define the main class
public class FourDigits {

    //now declare the main method 
    public static void main(String[] args) {
        
        //declare the variable for the scanner
        Scanner myScanner;
        myScanner =new Scanner( System.in );
        
        //prompt the user to imput a double and collect the double using the scanner
        System.out.print("Enter a double and I will display the four digits to the right of the decimal-");
        double myDouble= myScanner.nextDouble();
        
        
        //get the four digits of the decimal saved as a integer
        int myDecimal=(int) ((myDouble*10000)%10000);
        
        //
        int tenthDecimal= (myDecimal/1000);
        int hundrethDecimal= ((myDecimal/100)%10);
        int thousandthDecimal=((myDecimal/10)%10);
        int tenThousandthDecimal=((myDecimal)%10);
        
        //
        System.out.println("The four digits are "+tenthDecimal+hundrethDecimal+thousandthDecimal+tenThousandthDecimal);
        
    }
    
    
}