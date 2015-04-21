////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//MatrixMult
//hw12
//The function of this lab is to gain practice/experience with 2D arrays.
//
//declare Scanner
import java.util.Scanner;
import java.util.Random;

//declare public class
public class MatrixMult{
    
    //method for populating matriices
    public static int[][] randomMatrix(int height, int width) {
        int arrayRow=0,arrayColumn=0;
        Random ranData= new Random();
        int[][] startingArray=  new int[width][height];//format if row major
            //starts with row [0] and continue through row [width-1]
            while (arrayRow<width){
                //while loop to run from column[0] through column [height-1]
                arrayColumn=0;
                while(arrayColumn<height){
                startingArray[arrayRow][arrayColumn]=(int) (ranData.nextInt(20)-10);
                arrayColumn++;
                }
            arrayRow++;
            }
            return startingArray;
        
    }//end of method randomMatrix
    
////////////////////////////////////////////////////////////////////////////////////
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
//////////////////////////////////////////////////////////////////////////////////////////////////
    //multiply matrices
    public static int[][] matrixMultiply(int[][] arrayX, int[][] arrayY){
        int[][] arrayZ= new int[arrayX.length][arrayY[0].length];
        for(int w=0;w<arrayX.length;w++){
            for(int x=0;x<arrayY[0].length;x++){
                for(int y=0;y<arrayX[0].length;y++){
                    //System.out.println(w+" "+x+" "+y);
                    arrayZ[w][x]=(arrayX[w][y]*arrayY[y][x])+arrayZ[w][x];
                }//end of for
            }//end of for
        }//end of for
        return arrayZ;
    }//end of method matrixMultiply
    
///////////////////////////////////////////////////////////////////////////////////////////////////
    
    //Main method
    public static void main(String [] args){
        int widthA=0, heightA=0, widthB=0, heightB=0;
        boolean condition=false;
        Scanner myScan= new Scanner( System.in );
        
        while(!condition){
            System.out.print("Please input a width for Matrix A: ");
            while ((!myScan.hasNextInt()) || ( (widthA = myScan.nextInt()) < 0 ) ){//test for valid inpit
                
                 if (widthA<0){
                     System.out.print("That was not positive:");
                     myScan = new Scanner( System.in);
                 }
                 else{
                     System.out.print("That was not a integer:");
                     myScan = new Scanner( System.in);
                 }
            }
            
            
            System.out.print("Please input a height for Matrix A: ");
            while ((!myScan.hasNextInt()) || ( (heightA = myScan.nextInt()) < 0 ) ){//test for valid input
                
                 if (heightA<0){
                     System.out.print("That was not positive:");
                     myScan = new Scanner( System.in);
                 }
                 else{
                     System.out.print("That was not a integer:");
                     myScan = new Scanner( System.in);
                 }
            }
            
            
            System.out.print("Please input a width for Matrix B: ");
            while ((!myScan.hasNextInt()) || ( (widthB = myScan.nextInt()) < 0 ) ){//test for valid input
                 if (widthB<0){
                     System.out.print("That was not positive:");
                     myScan = new Scanner( System.in);
                 }//end of if
                 else{
                     System.out.print("That was not a integer:");
                     myScan = new Scanner( System.in);
                 }//end of else
            }//end of while loop
            
            
            System.out.print("Please input a height for Matrix B: ");
            while ((!myScan.hasNextInt()) || ( (heightB = myScan.nextInt()) < 0 ) ){//test for valid input
                 if (heightB<0){
                     System.out.print("That was not positive:");
                     myScan = new Scanner( System.in);
                 }//end of if
                 else{
                     System.out.print("That was not a integer:");
                     myScan = new Scanner( System.in);
                 }//end of else
            }//end of while loop
            if (widthA==heightB){//test to see if matrices are compatibile
                condition=true;
            }
            else{
                System.out.println("The matrices were not compatible, please input again.");
            }
        }//end of condition while loop
        //show the two random arrays
        System.out.println("Matrix A:");
        int[][] arrayA= randomMatrix(heightA, widthA);
        printMatrix(arrayA, true);
        System.out.println("Matrix B:");
        int[][] arrayB= randomMatrix(heightB, widthB);
        printMatrix(arrayB, true);
        //eturn output
        System.out.println("Matrix A times Matrix B:");
       int[][] arrayC= matrixMultiply(arrayA,arrayB);
        printMatrix(arrayC, true);
        
    }//end of main method
}//end of public class