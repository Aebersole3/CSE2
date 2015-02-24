////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//hw05
//ToHex
//The purpose of this program is to take a user input for RGB in decimal range of 0-255 and convert it to Hex
// 
//Import the scanner
import java.util.Scanner;
//
//define main Class
public class ToHex{

    //DeClare main method
    public static void main(String[] args) {
        
        //declare scanner variable
        Scanner myScanner;
        myScanner =new Scanner( System.in );
        
        int rDecimal, gDecimal, bDecimal, rHex2, rHex1, bHex2, bHex1, gHex2, gHex1;//declare six variable for hex conversion
        String hexCode;//declare string 
        
        System.out.println("Please enter three numbers representing RGB values:");
        if(myScanner.hasNextInt()){ //boolean that will return true if myScanner is a int
            rDecimal=myScanner.nextInt(); //set the first input as the first decimal
            
            if (myScanner.hasNextInt()){ //check to see the input is an int
                gDecimal=myScanner.nextInt(); //check to see the input is an int
                
                if (myScanner.hasNextInt()){ //check to see the input is an int
                    bDecimal=myScanner.nextInt(); //check to see the input is an int
                    if ((rDecimal<256) && (gDecimal<256) && (bDecimal<256)&&(rDecimal>=0) && (gDecimal>=0) && (bDecimal>=0)){
                        rHex2 =rDecimal%16;//finds the second value of hex
                        rHex1 =(rDecimal-rHex2)/16;//find the first value of hex
                        gHex2 =gDecimal%16;//finds the second value of hex
                        gHex1 =(gDecimal-gHex2)/16;//find the first value of hex
                        bHex2 =bDecimal%16;//finds the second value of hex
                        bHex1 =(bDecimal-bHex2)/16;//find the first value of hex
                        hexCode = "0";//initialize the String hex code.
                        switch (rHex1){ //switch statement for 1st hex value
                            case 0:
                                hexCode ="0";
                                break;
                            case 1:
                                hexCode ="1";
                                break;
                            case 2:
                                hexCode ="2";
                                break;
                            case 3:
                                hexCode ="3";
                                break;
                            case 4:
                                hexCode ="4";
                                break;
                            case 5:
                                hexCode ="5";
                                break;
                            case 6:
                                hexCode ="6";
                                break;
                            case 7:
                                hexCode ="7";
                                break;
                            case 8:
                                hexCode ="8";
                                break;
                            case 9:
                                hexCode ="9";
                                break;
                            case 10:
                                hexCode ="A";
                                break;
                            case 11:
                                hexCode ="B";
                                break;
                            case 12:
                                hexCode ="C";
                                break;
                            case 13:
                                hexCode ="D";
                                break;
                            case 14:
                                hexCode ="E";
                                break;
                            case 15:
                                hexCode ="F";
                                break;
                        }
                        switch (rHex2){ //switch statement for 2nd hex value
                            case 0:
                                hexCode = hexCode+"0";
                                break;
                            case 1:
                                hexCode = hexCode+"1";
                                break;
                            case 2:
                                hexCode =hexCode+"2";
                                break;
                            case 3:
                                hexCode =hexCode+"3";
                                break;
                            case 4:
                                hexCode =hexCode+"4";
                                break;
                            case 5:
                                hexCode =hexCode+"5";
                                break;
                            case 6:
                                hexCode =hexCode+"6";
                                break;
                            case 7:
                                hexCode =hexCode+"7";
                                break;
                            case 8:
                                hexCode =hexCode+"8";
                                break;
                            case 9:
                                hexCode =hexCode+"9";
                                break;
                            case 10:
                                hexCode =hexCode+"A";
                                break;
                            case 11:
                                hexCode =hexCode+"B";
                                break;
                            case 12:
                                hexCode =hexCode+"C";
                                break;
                            case 13:
                                hexCode =hexCode+"D";
                                break;
                            case 14:
                                hexCode =hexCode+"E";
                                break;
                            case 15:
                                hexCode =hexCode+"F";
                                break;
                            
                        }
                        switch (gHex1){ //switch statement for 3rd hex value
                            case 0:
                                hexCode = hexCode+"0";
                                break;
                            case 1:
                                hexCode = hexCode+"1";
                                break;
                            case 2:
                                hexCode =hexCode+"2";
                                break;
                            case 3:
                                hexCode =hexCode+"3";
                                break;
                            case 4:
                                hexCode =hexCode+"4";
                                break;
                            case 5:
                                hexCode =hexCode+"5";
                                break;
                            case 6:
                                hexCode =hexCode+"6";
                                break;
                            case 7:
                                hexCode =hexCode+"7";
                                break;
                            case 8:
                                hexCode =hexCode+"8";
                                break;
                            case 9:
                                hexCode =hexCode+"9";
                                break;
                            case 10:
                                hexCode =hexCode+"A";
                                break;
                            case 11:
                                hexCode =hexCode+"B";
                                break;
                            case 12:
                                hexCode =hexCode+"C";
                                break;
                            case 13:
                                hexCode =hexCode+"D";
                                break;
                            case 14:
                                hexCode =hexCode+"E";
                                break;
                            case 15:
                                hexCode =hexCode+"F";
                                break;
                            
                        }
                        switch (gHex2){ //switch statement for 4th hex value
                            case 0:
                                hexCode = hexCode+"0";
                                break;
                            case 1:
                                hexCode = hexCode+"1";
                                break;
                            case 2:
                                hexCode =hexCode+"2";
                                break;
                            case 3:
                                hexCode =hexCode+"3";
                                break;
                            case 4:
                                hexCode =hexCode+"4";
                                break;
                            case 5:
                                hexCode =hexCode+"5";
                                break;
                            case 6:
                                hexCode =hexCode+"6";
                                break;
                            case 7:
                                hexCode =hexCode+"7";
                                break;
                            case 8:
                                hexCode =hexCode+"8";
                                break;
                            case 9:
                                hexCode =hexCode+"9";
                                break;
                            case 10:
                                hexCode =hexCode+"A";
                                break;
                            case 11:
                                hexCode =hexCode+"B";
                                break;
                            case 12:
                                hexCode =hexCode+"C";
                                break;
                            case 13:
                                hexCode =hexCode+"D";
                                break;
                            case 14:
                                hexCode =hexCode+"E";
                                break;
                            case 15:
                                hexCode =hexCode+"F";
                                break;
                            
                        }
                        switch (bHex1){ //switch statement for 5th hex value
                            case 0:
                                hexCode = hexCode+"0";
                                break;
                            case 1:
                                hexCode = hexCode+"1";
                                break;
                            case 2:
                                hexCode =hexCode+"2";
                                break;
                            case 3:
                                hexCode =hexCode+"3";
                                break;
                            case 4:
                                hexCode =hexCode+"4";
                                break;
                            case 5:
                                hexCode =hexCode+"5";
                                break;
                            case 6:
                                hexCode =hexCode+"6";
                                break;
                            case 7:
                                hexCode =hexCode+"7";
                                break;
                            case 8:
                                hexCode =hexCode+"8";
                                break;
                            case 9:
                                hexCode =hexCode+"9";
                                break;
                            case 10:
                                hexCode =hexCode+"A";
                                break;
                            case 11:
                                hexCode =hexCode+"B";
                                break;
                            case 12:
                                hexCode =hexCode+"C";
                                break;
                            case 13:
                                hexCode =hexCode+"D";
                                break;
                            case 14:
                                hexCode =hexCode+"E";
                                break;
                            case 15:
                                hexCode =hexCode+"F";
                                break;
                            
                        }
                        switch (bHex2){ //switch statement for 6th hex value
                            case 0:
                                hexCode = hexCode+"0";
                                break;
                            case 1:
                                hexCode = hexCode+"1";
                                break;
                            case 2:
                                hexCode =hexCode+"2";
                                break;
                            case 3:
                                hexCode =hexCode+"3";
                                break;
                            case 4:
                                hexCode =hexCode+"4";
                                break;
                            case 5:
                                hexCode =hexCode+"5";
                                break;
                            case 6:
                                hexCode =hexCode+"6";
                                break;
                            case 7:
                                hexCode =hexCode+"7";
                                break;
                            case 8:
                                hexCode =hexCode+"8";
                                break;
                            case 9:
                                hexCode =hexCode+"9";
                                break;
                            case 10:
                                hexCode =hexCode+"A";
                                break;
                            case 11:
                                hexCode =hexCode+"B";
                                break;
                            case 12:
                                hexCode =hexCode+"C";
                                break;
                            case 13:
                                hexCode =hexCode+"D";
                                break;
                            case 14:
                                hexCode =hexCode+"E";
                                break;
                            case 15:
                                hexCode =hexCode+"F";
                                break;
                            
                        }
                        
                        
                        System.out.println("The decimal numbers R:"+rDecimal+", G:"+gDecimal+", B:"+bDecimal+", is represented in hexaecimal as: "+hexCode);//prints out final code
                    }
                    else{
                    System.out.println("Sorry, you must enter values between 0-255");//results if the number is not between 0 and 255
                    
                    }
                }
                else{
                    System.out.println("Sorry, your inputs consist of intergers");//result if the first value is not an int
                
                }
                
            }
            else{
                System.out.println("Sorry, your inputs consist of intergers");//result if the second value is not an int
            }
        }
        else{
            System.out.println("Sorry, your inputs consist of intergers");//result if the third value is not an int
        }
    }// end of main method
}//end of public class