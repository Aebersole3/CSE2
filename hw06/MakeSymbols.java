////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//HW06
//MakeSymbols
//The purpose of this program is to find the sum of five integers
//
//define main class
public class MakeSymbols{
    
    //define main method
    public static void main(String[] args){
        int runs=0;
        int randomBase= (int) ((Math.random()*100)+1);
        int remainder= randomBase%2;
        System.out.println("Random number generated:"+randomBase);
        if (remainder==1){
            System.out.print("The output pattern:");
            do{
                System.out.print("&");
                runs++;
            }while(runs<randomBase);
        }
        else{
            System.out.print("The output pattern:");
            do{
                System.out.print("*");
                runs++;
            }while(runs<randomBase);}
        System.out.println("");
        
    }
    
}
