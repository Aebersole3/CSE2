///////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//lab02
//Cyclometer Program
//
//first compile the program, "javac Cyclometer.java"
//run the program, "java Cyclometer//"
//git push and make sure it appears in Github
//program needs to:
//      a)print the number of minutes for each trip
//      b)print the number of counts for each tirp
//      c)print the distance of each trip in miles
//      d)print the distance for the two trips combined
//given two types of data:
//      time elapsed in seconds
//      number of turns of the front wheel.
//
public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args) {

    //our input data
        int secsTrip1=480;  //time of trip one in seconds and is stored as an integer
       	int secsTrip2=3220;  //time of trip two in seconds and is stored as an integer
        int countsTrip1=1561;  //count of the number of rotions for trip one stored as an integer
        int countsTrip2=9037;  //count of the number of rotions for trip two stored as an integer

    //our intermediate variables. used to calculate our outputs.
        double wheelDiameter=27.0, //the Diameter of the front wheel of the bike stored as a double
        PI=3.14159, //PI, the ratio of the circumference to the diameter of a cirlce, curious about no variable type and the coma
        feetPerMile=5280, //conversion of how many feet are in a mile, curious about no variable type and the coma
        inchesPerFoot=12, //conversion of how many inches are in a foot, curious about no variable type and the coma
        secondsPerMinute=60; //conversion of how many seconds are in a minutes, curious about the lack of variable type
        double distanceTrip1, distanceTrip2, totalDistance; //defining three variables as doubles which will be calculated later.

        //Print time in minutes and counts of both trips
            System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
            System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
        
            //running the calculations
            //calculating the distance of each trip and the total and converting them to miles.
            distanceTrip1=countsTrip1*wheelDiameter*PI;
            //above gives the distance in inches, of trip one
            //(for each count, a rotation of the wheel travels the diameter in inches times PI)
            distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles instead of inches
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
            totalDistance=distanceTrip1+distanceTrip2; //only error from the compiler.
            
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }// end of main method, public static
    
    
}// end of class, public class