////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//hw03
//Bicycle
//This program should prompt the user for two digits, the first being the count of the cyclometer and the second being the time in seconds.
//tthe the program should calculate and output the distance in miles, time in minutes and average mph.
//
//Import the scanner
import java.util.Scanner;
// 
//define the main class
public class Bicycle {
    
    //declare main method
    public static void main(String[] args) {
        
        //declare the variable for the scanner
        Scanner myScanner;
        myScanner =new Scanner( System.in );
        
        //prompt user for cyclometer and time
        System.out.print("Enter the number of seconds:");
        double timeSeconds= myScanner.nextDouble();//time in seconds
        System.out.print("Enter the number of counts:");
        double cycloCount= myScanner.nextDouble();//count of the cyclometer
        
        //variables used to do calculations and conversions
        double wheelDiameter= 27;
        double wheelCircumferance= 3.14159*(wheelDiameter);
        double inchesPerFoot= 12;
        double feetPerMile= 5280;
        double secondsPerMinute= 60;
        double minutesPerHour= 60;
        
        //calculations
        double totalDistance= ((wheelCircumferance/inchesPerFoot)/feetPerMile)*cycloCount;
        double totalTimeMinutes= (timeSeconds/secondsPerMinute);
        double averageSpeed= totalDistance/(totalTimeMinutes/minutesPerHour);
        
        
        //Dropping the decimal places after the hundreth place.
        totalDistance= ((int)(totalDistance*100))/100.0;
        totalTimeMinutes= ((int)(totalTimeMinutes*100))/100.0;
        double mphDiff= averageSpeed%.01;
        
        
        //print out the results
        System.out.println("The distance was "+totalDistance+" miles and took "+totalTimeMinutes+" minutes." );
        System.out.println("The average mph was "+(averageSpeed-mphDiff));
        
    }
    
}
