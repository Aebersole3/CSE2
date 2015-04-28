////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//FourDwin
//hw13
//The function of this lab is to gain practice/experience with 3+ multidimensional arrays.
//
//declare scanner
import java.util.Scanner;
//declare public class
public class FourDwin{

///////////////////////////////////////////////////////////////////////////////
    //method for sorting 1D arrays
    public static void sort(double [] inArray){
        int minIndex=0;
        //works through whole array
        for (int x=0; x<inArray.length; x++){
            double min=38;
            //start of unsorted array
            for (int y=x; y<inArray.length;y++){
                if(inArray[y]<min){
                    min = inArray[y];
                    minIndex=y;
                }//end of if which stores if the value is a minimum
            }//end of finding the minimum in the unsorted array
            double temp = inArray[x];
            inArray[x]= min;
            inArray[minIndex]=temp;
        }//end of for loop for sorting
        return;
    }//end of methos sort
    
///////////////////////////////////////////////////////////////////////////////
    //method for sorting 3D arrays
    public static void sort3Darray(double [][][][] inArray){
       
        
        //start of the unsorted array
        //loops to go through the whole array
        for(int oneD=0; oneD<inArray.length; oneD++){
             for(int twoD=0; twoD<inArray[oneD].length; twoD++){
                  for(int redD=0; redD<inArray[oneD][twoD].length; redD++){
                        sort(inArray[oneD][twoD][redD]);//sorts each 1D array
                  }//end of redD
                 
             }//end of twoD
             
        }//end of oneD
        
    }//end of sorting method

///////////////////////////////////////////////////////////////////////////////
    //method for sorting 4D arrays
    public static void sort4Darray(double [][][][] inArray){
        
        
        int elements=0;
        int prevElem;
        double minA=31;
        double prevMin=32;
        double [][][] temp3D;
        int a,b,c,d;
        
        for(a=0;a<inArray.length;a++){//switches between the 3d loops
            //count the number of elements in 3D loop
            prevElem=elements;
            elements=0;
            for (b=0;b<inArray[a].length;b++){//
                for( c=0; c<inArray[a][b].length; c++){
                      for( d=0; d<inArray[a][b][c].length; d++){
                        if (inArray[a][b][c][d]<minA){
                            minA=inArray[a][b][c][d];
                        }
                        elements++;
                      }//end of for d
                  }//end of for c
            }//end of for b
            //swaps the arrays if conditions are met
            if(prevElem>=elements){
                if(prevElem==elements){
                    if(minA<prevMin){
                    temp3D =inArray[(a-1)];
                    inArray[(a-1)] =inArray[a];
                    inArray[a] =temp3D;
                    }//end of if minA
                }//end of if Prev
                else{
                    temp3D =inArray[(a-1)];
                    inArray[(a-1)] =inArray[a];
                    inArray[a] =temp3D;
                }
            }//end of if
            
        }//end of for a
        return;
        
        /**
        //start of the unsorted array
        for (int k=1; k<inArray.length;k++){
            //for loop to compare arrays
            for(int j=k, i=j-1;inArray[i].length>=inArray[j].length;j--,i--){ 
                if(inArray[i].length==inArray[j].length){
                    if(inArray[i][0][0].length>inArray[j][0][0].length){
                    //if this method is called after sorteing the 3D arrays, the first term in the 2D arrays is the minimium
                        //swap the arrays
                        temp3D= inArray[i];
                        inArray[i]= inArray[j];
                        inArray[j]= temp3D;
                    }//end of iff [i][0][0]
                }//end of if ==
                else{//means they are >
                    //swap the arrays
                    temp3D= inArray[i];
                    inArray[i]= inArray[j];
                    inArray[j]= temp3D;
                }//end of else
                if(j==1){
                    break;//exits if it is furthest to the left
                }
            }//end of inner for loop
        }//end of outer for loop
        return;**/
    }//end of sorting method
    
    
///////////////////////////////////////////////////////////////////////////////
    //method for printing 4Darrays
    public static void printArray(double [][][][] inArray){
        
        for(int oneD=0; oneD<inArray.length; oneD++){
            System.out.print("{");
             for(int twoD=0; twoD<inArray[oneD].length; twoD++){
                 System.out.print("{");
                  for(int redD=0; redD<inArray[oneD][twoD].length; redD++){
                      System.out.print("{");
                      for(int blueD=0; blueD<inArray[oneD][twoD][redD].length; blueD++){
                          System.out.print(inArray[oneD][twoD][redD][blueD]);
                          System.out.print(", ");
                      }//end of blueD
                       System.out.println("} ");
                  }//end of redD
                 System.out.println(" } ");
             }//end of twoD
            System.out.println("}, ");
        }//end of oneD

        
        
    }//end of method
///////////////////////////////////////////////////////////////////////////////

    //method for creating stats for 4D arrays
    public static void statArray(double[][][][] inArray){
    //declare variables
    double sum=0;
    double mean=0;
    int elements=0;
    
    
    //loops to go through the whole array
    for(int oneD=0; oneD<inArray.length; oneD++){
             for(int twoD=0; twoD<inArray[oneD].length; twoD++){
                  for(int redD=0; redD<inArray[oneD][twoD].length; redD++){
                      for(int blueD=0; blueD<inArray[oneD][twoD][redD].length; blueD++){
                        sum += inArray[oneD][twoD][redD][blueD];
                        elements++;
                      }//end of blueD
                  }//end of redD
             }//end of twoD
        }//end of oneD
    mean = sum/elements;
    System.out.println("Sum: "+ sum);
    System.out.println("Members: "+elements);
    System.out.println("Mean: "+mean);
    }//end of statArray method
////////////////////////////////////////////////////////////////////////////////
    //declare main method
    public static void main(String [] args){
        //declare scanner
        System.out.print("Enter an integer X: ");
        Scanner scan= new Scanner(System.in);
        int x,y;
        
        //check for valid input
        while( (!scan.hasNextInt()) || ((x=scan.nextInt())<1) ){
            System.out.print("Invalid input. Please enter an integer for X: ");
        }//end of while loop
        
        System.out.print("Enter an integer Y, where Y > X: ");
        scan= new Scanner(System.in);
        
        //check for valid input
        while( (!scan.hasNextInt()) || ((y=scan.nextInt())<=x) ){
            System.out.print("Invalid input. Please enter an integer for Y: ");
        }//end of while loop
        
        
        double [][][][] crazyArray= new double[3][x][y][];
        
        
        for(int oneD=0; oneD<crazyArray.length; oneD++){
             for(int twoD=0; twoD<crazyArray[oneD].length; twoD++){
                  for(int redD=0; redD<crazyArray[oneD][twoD].length; redD++){
                      crazyArray[oneD][twoD][redD]=new double [(int) ((Math.random()*5)+1)];
                      for(int blueD=0; blueD<crazyArray[oneD][twoD][redD].length; blueD++){
                        crazyArray[oneD][twoD][redD][blueD]=  (double) (((int) (Math.random()*300))/10.0);
                      }//end of blueD
                  }//end of redD
             }//end of twoD
        }//end of oneD
        
        printArray(crazyArray);
        statArray(crazyArray);
        
        sort3Darray(crazyArray);
        sort4Darray(crazyArray);
        printArray(crazyArray);
        
        
    }//end of main method
}//end of public class



