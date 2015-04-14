////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//CSE2Linear
//
//The function of this lab is to gain practice/experience with Searching information in arrays.
//
//declare Scanner
import java.util.Scanner;

//declare public class
public class CSE2Linear{


    public static void biSearch(int[] array2, int searchArray ){
        //declare variables
        int i=0, k=array2.length, j=(int) (i+k)/2, iterations=0, foundValue=array2[j]; 
        while(foundValue!=searchArray){
            foundValue=array2[j];
            if(k==i+1){
                iterations++;
                System.out.println(" :" +array2[0] );
                System.out.println(searchArray+" was not found in the array");
                System.out.println("The number above the key was "+array2[(k)]);
                System.out.println("The number below the key was "+array2[(i)]);
                System.out.println("The number was not found in "+iterations+" itterations.");
                return;
            }
            if (foundValue==searchArray){
                iterations++;
                System.out.println("Found it in element "+(j+1)+" of the array after "+iterations+" itterations." );
                break;
            }
            else{
                if(foundValue<searchArray){
                    i=j;
                    j=(int) ((i+k)/2);
                    
                }
                else{
                    k=j;
                    j=(int) ((i+k)/2);
                    
                }
            }
           iterations++;
        }//end of While loop
    }//end of method biSearch
    
    //linear search method
    public static void linearSearch(int[] array1, int searchArray ){
        int y=0;
        while(array1[y]!=searchArray){
            
            y++;
            if(y==15){
                System.out.println(searchArray+" was not found in the list with "+y+" iterations.");
                return;
            }//end of if
            
        }//end of while
        System.out.println(searchArray+" was found in the list with "+y+" iterations.");
        return;
    }//end of linearSearch method
    
    
    public static void scramble(int[] arrayIn ){
        int iter= (int) ((Math.random()*100)+1);
        int h, firstSwitch, secondSwitch, tempVal;
        for (h=0; h<iter; h++){
            firstSwitch=(int) (Math.random()*15);
            secondSwitch=(int) (Math.random()*15);
            tempVal=arrayIn[firstSwitch];
            arrayIn[firstSwitch]=arrayIn[secondSwitch];
            arrayIn[secondSwitch]=tempVal;
            
        }//end of for loop
        
        return;
    }//end of method scramble

    //Main Method///////////////////////////////////////////////////////
    public static void main(String [] args){
        int prevVal=0, j=0;
        int[] sortedArray= new int [15];
        System.out.println("Enter 15 ints for final grades in CSE2:");
        while(j<sortedArray.length){
            //check input
            boolean validQ=false;
            int input=0;
            while (!validQ){
                Scanner myScanner= new Scanner( System.in);
                if(myScanner.hasNextInt()){
                    if(((input=myScanner.nextInt())>0) && ( input<101)){
                        if(input>=prevVal){
                            validQ=true;
                        }//end of if
                        else{
                            System.out.println("Your value was less then the previous value.");
                            
                        }//end of else
                    }//end of if
                    else{
                        System.out.println("Your value was not between 0 and 100.");
                    }//end of else
                }//end of if
                else{
                    System.out.println("You did not input a int.");
                }//end of else
            }//end of while
            
            //input value into array
            sortedArray[j]= input;
            prevVal=sortedArray[j];
            j++;
        }//end of while
        
        //return the array
        System.out.print("The grades, sorted, are:");
        for(j=0; j<sortedArray.length; j++){
            System.out.print(" "+sortedArray[j]);
        }//end of for loop
        System.out.println("");
        System.out.print("Enter a grade to search for:");
        Scanner scan= new Scanner( System.in);
        int gradeSearch= scan.nextInt();
        biSearch(sortedArray, gradeSearch);
        
        
        System.out.println("Scrambled:");
        scramble(sortedArray);
        for(j=0; j<sortedArray.length; j++){
            System.out.print(" "+sortedArray[j]);
        }//end of for loop
        System.out.println("");
        
        System.out.print("Enter a grade to search for:");
        int checkScram= scan.nextInt();
        linearSearch(sortedArray, checkScram);
        
    }//end of main method
    
}//end of Public class