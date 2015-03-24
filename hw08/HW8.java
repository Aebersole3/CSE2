////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//hw08
//HW8
//Import the scanner
import java.util.Scanner;
//define main class
public class HW8{
    
    public static String getInput(Scanner scan, String string){
        String scanner="";
        scanner= scanner+ scan.next().trim().charAt(0);//gets the character of the input
        if(scanner.equals("C") || scanner.equals("c") ){//tests for user input
            return scanner;
        }
        else{
            System.out.println("Yea right LOSER!");
            System.exit(0);//exits the program
            return scanner;
        }
        
    }
    
    public static String getInput(Scanner scan, String string, int trial){
            //declare variables
            int rollForCrit;
            int rollToEscape;
            
            while(trial>0){//while loop for fighting giant
                char turnAttack =scan.next().trim().charAt(0);
                switch(turnAttack){
                    case 'A':
                    case 'a':
                        rollForCrit= (int)(Math.random()+.1);//roll for critical hit 0-1
                        switch(rollForCrit){
                            case 1://if a 1 is rolled, they crit
                                System.out.println("Critical Hit!");
                                trial--; //treat trial like hp, so each hit decriments it
                                break;
                            case 0:
                                System.out.println("Gosh! How can you miss it!");
                                break;
                        }
                        break;
                    //case if the try to run
                    case 'E':
                    case 'e':
                        rollToEscape= (int)((10*Math.random())+1);
                        if (rollToEscape==10){//if they succeed the roll for running
                            System.out.println("You have escaped the Giant!");
                            System.exit(0);//exits the program
                        }
                        else{
                            System.out.println("You failed to escape the Giant!");
                            return "";
                        }
                        break;
                    default://default case that ends the program
                    System.out.println("Executed by the GIANT! Game Over! ");
                    System.exit(0);
                        break;
                }
                //if statement to print out the prompt to do a move unless the giant is at zero hp(trial==0)
                if(trial==0){
                return "";
                }
                else{
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                }
            }
            
        return "";
    }
    
    //simple method that uses a switch statement to prin out the prize or exit the program
    public static String getInput(Scanner scan){
        char chestPick =scan.next().trim().charAt(0);
        switch(chestPick){
            case '1':
                System.out.print("It is a brand new shiny sword! ");
            break;
            case '2':
                System.out.print("It is a GPA4.00 ");
            break;
            case '3':
                System.out.print("It is a piece of lint! Lame... Better luck next time, ");
            break;
            default:
                System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                System.exit(0);
        }
        return "";
    }
    
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
        System.out.println("                     *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }

    
    public static void main(String[] args) {
            char option;
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            String input = getInput(scan, "Cc");
            System.out.println("You are in a dead valley.");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("You walked and walked and walked and you saw a cave!");
            cave();
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("You entered a cave!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("Unfortunately, you ran into a GIANT!");
            giant();
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            input = getInput(scan, "AaEe", 10);
            System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
            System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
            box();
            input = getInput(scan);
            System.out.println("Hero! Have a good day!");
        }
}

