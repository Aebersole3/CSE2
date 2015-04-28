////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//raggedArray
//lab13
//The function of this lab is to gain practice/experience with ragged arrays.
//
//declare public class
public class raggedArray{
    
    //method for sorting arrays
    public static void sort(int [] inArray){
        int minIndex=0;
        for (int x=0; x<inArray.length; x++){
            int min=38;
            for (int y=x; y<inArray.length;y++){
                if(inArray[y]<min){
                    min = inArray[y];
                    minIndex=y;
                }
                
                
            }//end of finding the minimum in the unsorted array
            int temp = inArray[x];
            inArray[x]= min;
            inArray[minIndex]=temp;
        }//end of for loop for sorting
        
        
        
        return;
    }//end of methos sort
    
    
    //////////////////////////////////////////////////////////////////////////////
    public static void printMatrix( int[] [] array, boolean format ){
        if(array==null){
            System.out.println("The matrix was empty");
            return;
        }
        
        int arrayRow=0;
        int arrayColumn=0;
        if (format){
            int width=array.length;
            //int height=array[0].length;
            //starts with row [0] and continue through row [width-1]
            while (arrayRow<width){
                System.out.print("Row"+(arrayRow+1)+": ");
                //while loop to run from column[0] through column [height-1]
                arrayColumn=0;
                while(arrayColumn<array[arrayRow].length){
                System.out.print(array[arrayRow][arrayColumn]+" ");
                arrayColumn++;
                }
                System.out.println("");
            arrayRow++;
                
            }
            
        }//end of if
        else{
            int height=array.length;
            //int width=array[0].length;
            while(arrayRow<array[arrayColumn].length) {
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
/////////////////////////////////////////////////////////////////////////////////
    
/////////////////////////////////////////////////////////////////////////////////
    //Main method
    public static void main(String [] args){
        //declare ragged array
        int [][] randArray= new int[5][];
        //declare second dimension for ragged array via for loops
        for (int j=0; j<randArray.length; j++){
            randArray[j]=new int[(3*j)+5];
            //for loop to populate array
            for (int i=0; i<randArray[j].length;i++){
                randArray[j][i]= (int) (Math.random()*37); 
            }//end of for loop for populating matrix
        }//end of for loop
        System.out.println("The array before sorting:");
        printMatrix(randArray, true);
        
        System.out.println("The array after sorting:");
        
        for(int k=0; k<randArray.length;k++){
            sort(randArray[k]);
            
        }//end of for loop to sort the array
        printMatrix(randArray,true);
        
        int[][] squareArray= new int[5][randArray[4].length];
        for(int r=0; r<squareArray.length;r++){
            for(int s=0; s<randArray[r].length;s++){
                squareArray[r][s]=randArray[r][s];
            }
            for(int s=randArray[r].length;s<squareArray[r].length;s++){
                squareArray[r][s]=0;
            }
        }
        System.out.println("The array after sorting and copying:");
        printMatrix(squareArray,true);
        
    }//end of main method
}
