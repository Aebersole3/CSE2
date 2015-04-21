////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//RowColumnMajor
//lab12
//The function of this lab is to gain practice/experience with 2D arrays.
//
//declare Scanner
import java.util.Scanner;

//declare public class
public class RowColumnMajor{
    // method to create the starting matrix
    public static int[][] increasingMatrix(int width, int height, boolean format){
        
        int arrayData= 0, arrayRow=0, arrayColumn=0;
        if (format){
            int[][] startingArray=  new int[width][height];//format if row major
            //starts with row [0] and continue through row [width-1]
            while (arrayRow<width){
                //while loop to run from column[0] through column [height-1]
                arrayColumn=0;
                while(arrayColumn<height){
                startingArray[arrayRow][arrayColumn]=arrayData;
                arrayData++;
                arrayColumn++;
                }
            arrayRow++;
            }
            return startingArray;
        }//end of if
        else{
            int[][] startingArray=  new int[height] [width];
            while (arrayColumn<height){
                arrayData=arrayColumn;
                //while loop to run from column[0] through column [height-1]
                arrayRow=0;
                    while(arrayRow<width){
                    startingArray [arrayColumn] [arrayRow]= arrayColumn+(arrayRow*height);
                    arrayRow++;
                    }
            arrayColumn++;
            }
            return startingArray;
        }//end of else
        
    }//end of method
    
    public static void printMatrix( int[][] array, boolean format ){
        if(array==null){
            System.out.println("The matrix was empty");
            return;
        }
        
        int arrayRow=0;
        int arrayColumn=0;
        if (format){
            int width=array.length;
            int height=array[0].length;
            //starts with row [0] and continue through row [width-1]
            while (arrayRow<width){
                System.out.print("[ ");
                //while loop to run from column[0] through column [height-1]
                arrayColumn=0;
                while(arrayColumn<height){
                System.out.print(array[arrayRow][arrayColumn]+" ");
                arrayColumn++;
                }
                System.out.println("]");
            arrayRow++;
                
            }
            
        }//end of if
        else{
            int height=array.length;
            int width=array[0].length;
            while(arrayRow<width) {
                System.out.print("[ ");
                //while loop to run from column[0] through column [height-1]
                arrayColumn=0;
                while(arrayColumn<height){
                System.out.print(array[arrayColumn][arrayRow]+" ");
                arrayColumn++;
                }
            System.out.println("]");
            arrayRow++;
            }
            
        }//end of else
        return ;
    }//end of method
///////////////////////////////////////////////////
    //method for translating matrix
    public static int[][] translate(int[][] array){
        int[][] transArray= new int [array[0].length][array.length];
        int height=array.length, width=array[0].length;
        int arrayRow=0, arrayColumn=0;
        while (arrayRow<width){
                //while loop to run from column[0] through column [height-1]
                arrayColumn=0;
                while(arrayColumn<height){
                transArray[arrayRow][arrayColumn]=array[arrayColumn][arrayRow];
                arrayColumn++;
                }
            arrayRow++;
        }
        return transArray;
        
    }
////////////////////////////////////////////////////////////////////////////////
    //method for adding matrix
    public static int[][] addMatrix(int[][] arrayA, boolean formatA, int[][] arrayB, boolean formatB){
        if (!formatA){
           arrayA= translate(arrayA);
           formatA=true;
       }
        if (!formatB){
            arrayB= translate(arrayB);
            formatB=true;
        }
        
        if((arrayA.length==arrayB.length)&&(arrayA[0].length==arrayB[0].length)){
            
        } 
        else{
            System.out.println("Unable to add matrices." );
            return null;
        }
        System.out.println("Adding two matrices" );
        printMatrix(arrayA,formatA);
        System.out.println("" );
        printMatrix(arrayB,formatB);
        
        int[][] addMatrix= new int [arrayA.length] [arrayA[0].length]; 
        for (int f=0;f<arrayA.length;f++){
            for(int g=0;g<arrayA[0].length;g++){
                addMatrix[f][g]= arrayA[f][g]+arrayB[f][g];
            }//end of for
        }//end of for
        
        System.out.println("output:" );
        printMatrix(addMatrix,true);
        return addMatrix;
    }
////////////////////////////////////////////////////////////////////////////////
    
    public static void main( String [] args){
        int randomABHeight= (int) ((10*Math.random())+1);
        int randomABWidth=(int) ((10*Math.random())+1);
        int randomCHeight=(int) ((10*Math.random())+1);
        int randomCWidth=(int) ((10*Math.random())+1);
        
         System.out.println("First matrix");
        int[][] arrayA= increasingMatrix(randomABWidth, randomABHeight, true);
        printMatrix( arrayA, true);
        
        
        System.out.println("Second matrix");
        int[][] arrayB= increasingMatrix(randomABWidth, randomABHeight, false);
        printMatrix( arrayB, false);
        
         System.out.println("Third matrix");
        int[][] arrayC= increasingMatrix(randomCWidth, randomCHeight, true);
        printMatrix( arrayC, true);
        
        
        int [][] addMatrixAB= addMatrix(arrayA, true, arrayB, false);
        int [][] addMatrixABC= addMatrix(addMatrixAB, true, arrayC, true);
        
    }//end of main method
}//end of public class
