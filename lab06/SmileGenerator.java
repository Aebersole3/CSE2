////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//lab06
//Smile Generator
//The purpose of this program is to Create an output of smile lines that incriment up to 30 times:
//
//define main class
public class SmileGenerator{
    
    //define main method
    public static void main(String[] args){
        
        //Define all variable for program
        int fiveSmilesLoop=0;
        int zeroHundredSmiles=0;
        int zeroHundredSmilesThirty=0;
        int counterLoops=0;
        int topEndCycles=(int) ((Math.random()*100)+1);
        String smileOutput="";
        
        while (fiveSmilesLoop<1){
            System.out.println(":) :) :) :) :)");
            fiveSmilesLoop++;
        }
        
        while(zeroHundredSmiles<topEndCycles){
            System.out.print(":) ");
            zeroHundredSmiles++;
        }
        
        while(zeroHundredSmilesThirty<topEndCycles){
            if ((zeroHundredSmilesThirty%30) !=0){
            System.out.print(":) ");
            zeroHundredSmilesThirty++;
            }
            else{
                System.out.println("");
                System.out.print(":) ");
                zeroHundredSmilesThirty++;
            }
        }
        
        System.out.println("");
        
        while (counterLoops<topEndCycles) {
            smileOutput=smileOutput+":) ";
            counterLoops++;
            System.out.println(smileOutput);
        }
        
        
        
    }
    
}