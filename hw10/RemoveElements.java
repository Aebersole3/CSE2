////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//RemoveElements
//
//The function of this lab is to gain practice/experience with inputting information into arrays.
//

import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
public static int[] randomInput(){
    int num[]=new int[10];//declare the array
    int i=0;
    while(i<10){//count number of inputs
        num[i]=(int) (10*Math.random());//creates a random number between 0-9
        i++;
    }
    return num;
} //end of random

public static int[] delete(int[] list,int pos){
    if((pos>9) || (pos<0)){
        Scanner myScanner= new Scanner(System.in);
        while( (!myScanner.hasNextInt()) || ( ((pos=myScanner.nextInt())<0) && (pos>9) ) ){
            
            
        }
    }
    int current=0;
    int del[]=new int[9];
    while(current<9){
        
        if(current<pos){
            del[current]= list[current];
        }
        
        if(current>pos){
            del[current]= list[current+1];
        }
        current++;
    }
    return del;
}//end of method delete

public static int[] remove(int[] list, int target){
    int i=0, j=0, k=0;//declare variable for loops
    int countVal=0;//variable to count number of valid data item
    
    //count the number of data items
    while(i<list.length){
        if(list[i]!=target){
            countVal++;
        }
        i++;
    }//end of while i<list.length
    
    if (countVal==9){//return if all the values are correct
        System.out.println("Element "+target+" was not found");
        return list;
    }
    else{//else of countVal==9
        int[] rem;
        rem =new int[countVal];
        while(j<countVal){
            if(list[k]!=target){
                rem[j]=list[k];
                k++;
                j++;
            }
            else{
                k++;
            }
            
        }//end of while
        return rem;
    }//end of else
    
}//end of method remove

}
