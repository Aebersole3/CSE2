////////////////////////////////////////////////////////////////////////////////
//Alan Ebersole
//hw02
//Arithmetic program
//
//Task: Calculate the cost, including sales tax, of the item you just bought at Walmart.
//PA sales tax is 6% and the program should store all the values of the item's costs, quantity, and price after sales tax.
//
//start by defining a class
public class Arithmetic{
    
    //now define the main method
    public static void main(String[] args) {
        
        //variable storage and defining
            //Number of pairs of socks
            int nSocks=3;
            //Cost per pair of Socks
            //('$' is part of the ariable name)
            double sockCost$=2.58;
            
            //Number of drinking glasses
            int nGlasses=6;
            //Cost per glass
            double glassCost$=2.29;
            
            //Number of boxes of envelopes
            int nEnvelopes=1;
            //Cost per box of envelopes
            double envelopesCost$=3.25;
            double taxPercent=0.06;
            
        //calculate total cost of each item
            //Socks
            double totalSockCost$=nSocks*sockCost$;//Subtotal cost of socks
            double totalSockTax$=(totalSockCost$)*taxPercent;//Cost of tax for the subtotal of socks
            
            //Drinking glasses
            double totalGlassCost$=nGlasses*glassCost$;//Subtotal cost of drinking glasses
            double totalGlassTax$=(totalGlassCost$)*taxPercent;//Cost of tax for the subtotal of Drinking glasses
            
            //Boxes of Envelopes
            double totalEnvelopeCost$=nEnvelopes*envelopesCost$;//Subtotal cost of the boxes of Envelopes
            double totalEnvelopeTax$=(totalEnvelopeCost$)*taxPercent;//Cost of tax for the subtotal of boxes of Envelopes
            
        //Clean up Subtotals
            //Take the variable, multiple by 100 and store as an integer in temporary variable
            //Take temporary variable and store into subtotal
            //Temporary's
                //Sock
                int tempSockCost$=(int) (totalSockCost$*100);//clears extra numbers after the hundred's decimal places
                totalSockCost$=(tempSockCost$)/100.0;//reduces variable back to decimal and stores back into original variable
                int tempSockTax$=(int) (totalSockTax$*100);//clears extra numbers after the hundred's decimal places
                totalSockTax$=tempSockTax$/100.0;//reduces variable back to decimal and stores back into original variable
                
                //Glass
                int tempGlassCost$=(int)(totalGlassCost$*100);//clears extra numbers after the hundred's decimal places
                totalGlassCost$=tempGlassCost$/100.0;//reduces variable back to decimal and stores back into original variable
                int tempGlassTax$=(int)(totalGlassTax$*100);//clears extra numbers after the hundred's decimal places
                totalGlassTax$=tempGlassTax$/100.0;//reduces variable back to decimal and stores back into original variable
                
                //Boxes of Envelopes
                int tempEnvelopeCost$=(int)(totalEnvelopeCost$*100);//clears extra numbers after the hundred's decimal places
                totalEnvelopeCost$=tempEnvelopeCost$/100.0;//reduces variable back to decimal and stores back into original variable
                int tempEnvelopeTax$=(int)(totalEnvelopeTax$*100);//clears extra numbers after the hundred's decimal places
                totalEnvelopeTax$=tempEnvelopeTax$/100.0;//reduces variable back to decimal and stores back into original variable
            
            //Print out the items and their base cost
            System.out.println("Buying "+nSocks+" pair(s) of socks at $" +sockCost$+" per item.");
            System.out.println("Buying "+nGlasses+" drinking glass(es) at $" +glassCost$+" per item.");
            System.out.println("Buying "+nEnvelopes+" box(es) of envelopes at $" +envelopesCost$+" per item.");
            
            //Print out the number of items bought, subtotal of each item and the tax of each.
            System.out.println(nSocks+" pairs of socks cost $"+totalSockCost$+" with $"+totalSockTax$+" tax.");
            System.out.println(nGlasses+" drinking glasses cost $"+totalGlassCost$+" with $"+totalGlassTax$+" tax.");
            System.out.println(nEnvelopes+" boxes of envelopes cost $"+totalEnvelopeCost$+" with $"+totalEnvelopeTax$+" tax.");
            
            
            
                //Compute the subtotals and final total
                    //subtotal of items(before tax)
                    double totalItemPretax$=(double) (totalEnvelopeCost$+totalGlassCost$+totalSockCost$);
                    int bugFix=(int) (totalItemPretax$*100);//had a bug, adding three item subtotals added a floating 3 out in the decimal place.
                    totalItemPretax$=bugFix/100.0;
                    //subtotal of the Tax
                    double totalTax$=totalSockTax$+totalGlassTax$+totalEnvelopeTax$;
                    //Final Total of tax and items
                    double totalItemCost$=totalItemPretax$+totalTax$;
                    
            //Print out subtotals and final total
            System.out.println("Subotal(pretax): $"+totalItemPretax$);
            System.out.println("Total Tax: $"+totalTax$);
            System.out.println("Total cost of Purchase: $"+totalItemCost$);
            
        
    }//End of main method
    
    
}//end of public class