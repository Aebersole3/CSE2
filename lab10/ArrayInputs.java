////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//ArrayInputs
//
//The function of this lab is to gain practice/experience with inputting information into arrays.
//
//Import the scanner
import java.util.Scanner;
// 
//define the main class
public class ArrayInputs{
    
    public static int inputCheck( Scanner inputTest){
        
        int returnVal=0;
        while ((!inputTest.hasNextInt()) || ( (returnVal = inputTest.nextInt()) < 0 ) ){
         if (returnVal<0){
             System.out.print("That was not positive:");
             inputTest = new Scanner( System.in);
         }
         else{
             System.out.print("That was not a integer:");
             inputTest = new Scanner( System.in);
         }
         returnVal=0;
        }
        
        return returnVal;
        
    } //end of method input
    
    public static void main(String [] args ){
        //declare variables
        int arraySize; 
        int arrayParcle=0;
        int arrayPrint=0;
        
        System.out.print("Please enter an integer for the size of an array:");
        Scanner myScanner = new Scanner( System.in );
        arraySize= myScanner.nextInt();
        int [] crazyArray;
        crazyArray= new int [arraySize];
        
        
        
        while (arrayParcle < (arraySize)){
        System.out.print("Please enter "+arraySize+" positive integer(s):");
        crazyArray [arrayParcle] = inputCheck(myScanner);
        arrayParcle++;
        
        }
        
        
        while(arrayPrint<(arraySize)){
            System.out.println(crazyArray[arrayPrint]);
            arrayPrint++;
            
        }
        
        
        
        
    }//end of main method
    
    
}// end of public class