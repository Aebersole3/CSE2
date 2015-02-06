///////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//lab02
//Arithmetic callculations and input
//
//This program should take input from the user about uying some BigMacs and then computes the tota of this purchase.
//step one is import a scanner to input variable.
//the program needs to be able to handle different sales tax
//
//Import the scanner
import java.util.Scanner;

//the scanner should now be imported. If a compiler issue occurs, check to make sure import was successful
//now define the class of the program
public class BigMac {

    //now reate the main method that is needed for every java program
    public static void main(String[] args) {
        
        Scanner myScanner;//declares first instance of scannerin the variable myScanner
        
        //use the scanner construction to create an instance where the scanner will take input from STDIN
        myScanner= new Scanner( System.in );
        
        //now create an output to ask the user for the number of BigMacs he/she is buying
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
            //using .print instead of println prevents the cursor from jumping to the front of the line
        
        //use the scanner to get the number of BigMacs from the scanner
            int nBigMacs= myScanner.nextInt();
                //'.nextInt' makes the scanner function here only take the next Int, if you wanted double, use .nextDouble
        
        //follow the steps above to retrieve the price and percent sales tax for the Big Mac
            //Cost of big Mac
            System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx):" );
            double bigMac$=myScanner.nextDouble();//because it is money you want to use a double
            
            //Percent Sales tax
            System.out.print("Enter the percent sales tax as a whole number(xx): ");
            double taxRate=myScanner.nextDouble();
            taxRate/=100; //This take the tax rate and divides and re-stores it by 100
                //we do this becasue we asked for the percentage but want the ration which is why we cast it as a double
            
        //Now to create the output in an appealing nature and do all the calculation
            double cost$;//define variable cost$ to be used as total cost
            int dollars, //whole dollar of mount of cost (xx.00)
                dimes,//used for decimal of cost (00.x0)
                pennies;//used for decimal of cost (00.0x)
            cost$=nBigMacs*bigMac$*(1+taxRate);//calculate total cost where (1+taxRate is BigMacs+tax)
                                            //also this a whole number dropping the decimal place
            dollars=(int) cost$;
            //time to get the dimes and pennies
            //(int) (6.73*10) % 10 -> 67 % 10 ->7:where % is the the mod operator
            //mod operator is like division but only return the remainder after division instead of a fractional equivalent
            dimes=(int) (cost$*10)%10;// got the dimes as an int
            pennies=(int) (cost$*100)%10;//got the pennies as an int
            System.out.println("The total cost of "+nBigMacs+" BigMacs, at $"+bigMac$+" per BigMac, with a sales tax of "
            + (int)(taxRate*100)+"% is $"+dollars+'.'+dimes+pennies);
            
            
        
        
    }//this is the end of the main method
    
    
    
}//end of the public class BigMac
