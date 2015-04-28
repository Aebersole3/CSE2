////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//lab09
//
//The function of this lab is to gain practice/experience with methods.
//
//Import the random function
import java.util.Random;
//Import the scanner
import java.util.Scanner;
// 
//define the main class
public class lab09{
    
    //Method 0 uses java.util.Random to produce a random 0<int<10
    public static int random(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        return randomInt;
    }
    
    //Method 1 adjectives
    public static String adjectives(){
        
        int generatedNumber= random();
        switch (generatedNumber){
            case 0:
                return " agile";
            case 1:
                return " red";
            case 2: 
                return " sleepy";
            case 3:
                return " old";
            case 4:
                return " young";
            case 5:
                return " tiny";
            case 6:
                return " oversized";
            case 7: 
                return " crazed";
            case 8:
                return " rare";
            case 9:
                return " energetic";
            default:
                return " error";
        }
    }
    
    //Method 2 nouns
    public static String nounSubj(){
        
        int generatedNumber= random();
        switch (generatedNumber){
            case 0:
                return " cat";
            case 1:
                return " frog";
            case 2: 
                return " mouse";
            case 3:
                return " chicken";
            case 4:
                return " monkey";
            case 5:
                return " iguanna";
            case 6:
                return " cobra";
            case 7: 
                return " eagle";
            case 8:
                return " turtle";
            case 9:
                return " dragon";
            default:
                return " error";
        }
    } 
    
    //Method 3 verbs
    public static String verbPast(){
        
        int generatedNumber= random();
        switch (generatedNumber){
            case 0:
                return " hit";
            case 1:
                return " tackled";
            case 2: 
                return " passed";
            case 3:
                return " scratched";
            case 4:
                return " headbutted";
            case 5:
                return " bit";
            case 6:
                return " hugged";
            case 7: 
                return " threw";
            case 8:
                return " struck";
            case 9:
                return " buried";
            default:
                return " error";
        }
    }
    
    //Method 3 verbs
    public static String nounObj(){
        
        int generatedNumber= random();
        switch (generatedNumber){
            case 0:
                return " ball.";
            case 1:
                return " rock.";
            case 2: 
                return " desk.";
            case 3:
                return " cake.";
            case 4:
                return " vase.";
            case 5:
                return " traffic cone.";
            case 6:
                return " refrigerator.";
            case 7: 
                return " wagon.";
            case 8:
                return " phone.";
            case 9:
                return " book.";
            default:
                return " error.";
        }
    }
    
    //define main method
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        boolean runAgain=true;
        while (runAgain){
            String sentence="";
            sentence= sentence + "The";
            sentence= sentence + adjectives();
            sentence= sentence + adjectives();
            sentence= sentence + nounSubj();
            sentence= sentence + verbPast();
            sentence= sentence + " the";
            sentence= sentence + nounObj();
            
            
            System.out.println(sentence);
            System.out.print("Would you like another sentence(Y/y/N/n):");
            char answer= myScanner.next().trim().charAt(0); //Searched how to take the first char from an input of scanner
            //while loop to check for valid input
            while((answer !='N') && (answer != 'n') && (answer != 'Y') && (answer != 'y')){
                System.out.println("Invalid input, I'll ask again:");
                System.out.print("Would you like another sentence(Y/y/N/n):");
                answer= myScanner.next().trim().charAt(0); //Searched how to take the first char from an input of scanner
                }
            switch(answer){
                case 'Y':
                case 'y':
                    runAgain=true;
                    break;
                case 'N':
                case 'n':
                    runAgain=false;
                break;
            }//end of switch answers
        
        }// end of while loop
    }//end of main method
}//end of public class
