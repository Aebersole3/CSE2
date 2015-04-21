////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//Arrays
//
//The function of this lab is to gain practice/experience with Searching information in arrays.
//

import java.util.Scanner;

public class Arrays{

    public static void main (String [] args()){
        //declare variables and arrays
        int[] array1= new int[50];
        int[] array2= new int[50];
        int i=0, j=0, k=0;
        int minArray1=9999999, maxArray1=0,minArray2=999999,maxArray2=0;
        int searchArray;
        int foundValue=0;
        //generates a random array
        while (i<50){
            array1[i]= (int) (101*Math.random());
            i++;
        }
        
        i=0;
        while(i<50){
            //store if larger than previous max
            if (array1[i]>maxArray1){
                maxArray1=array1[i];
            }
            //store if it is smaller then previous min
            if(array1[i]<minArray1){
                minArray1=array1[i];
            }
            i++;
        }
        //Print out results
        System.out.println("The maximum of Array1 is: "+maxArray1);
        System.out.println("The minimum of Array1 is: "+minArray1);
        
        //creates first value of array
        array2[j]= (int) (101*Math.random());
        j++;
        
        while(j<50){
            //increments the arrays values by addig previous to a random number between 0 and 100
        array2[j]= array2[(j-1)] + (int) ((100*Math.random())+1);
        j++;
        }
        
        //find min/max of array 2
        j=0;
        while(j<50){
            //store if larger than previous max
            if (array2[j]>maxArray2){
                maxArray2=array2[j];
            }
            //store if it is smaller then previous min
            if(array2[j]<minArray2){
                minArray2=array2[j];
            }
            j++;
        }
        System.out.println("The maximum of Array2 is: "+maxArray2);
        System.out.println("The minimum of Array2 is: "+minArray2);
        
        //prompt user for an input
        System.out.print("Enter an int: ");
        Scanner scan=new Scanner(System.in);
        
        //check the input
        if ((scan.hasNextInt()) && ((searchArray=scan.nextInt())>=0)){
            j=j/2;
        }
        else{
            System.out.println("You did not enter a positive int.");
            return;
        }
         
         i=0;
         k=50;
        //search for inputted value
        while(foundValue!=searchArray){
            foundValue=array2[j];
            if(k==i+1){
                System.out.println(" :" +array2[0] );
                System.out.println(searchArray+" was not found in the array");
                System.out.println("The number above the key was "+array2[(k)]);
                System.out.println("The number below the key was "+array2[(i)]);
                return;
            }
            if (foundValue==searchArray){
                
                System.out.println("Found it in element "+j+" of the array2." );
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
           
            
            
        }
        
        
        
    }
}