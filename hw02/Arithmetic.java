//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE 002 HW02
//Due September 9th, 2014
//This will calculate the cost of a transaction, both before
//and after taxes

public class Arithmetic {
    public static void main (String[] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        double sockCost$=2.58;
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //Cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        //Total cost of socks
        double totalSockCost$=(double)Math.round(sockCost$*nSocks*100)/100;
        //Total cost of glasses
        double totalGlassesCost$=(double)Math.round(glassCost$*nGlasses*100)/100;
        //Total cost of envelopes
        double totalEnvelopeCost$=(double)Math.round(envelopeCost$*nEnvelopes*100)/100;
        //Sales tax on socks (not with cost of socks)
        double salesTaxSocks=(double)Math.round(totalSockCost$*taxPercent*100)/100;
        //Sales tax on glasses (not with cost of glasses)
        double salesTaxGlasses=(double)Math.round(totalGlassesCost$*taxPercent*100)/100;
        //Sales tax on Envelopes (not with cost of envelopes)
        double salesTaxEnvelopes=(double)Math.round(totalEnvelopeCost$*taxPercent*100)/100;
        //Total purchase without tax
        double totalPurchase=totalSockCost$+totalGlassesCost$
        +totalEnvelopeCost$;
        //Total purchase with tax
        //The reason the (double)Math.round command is not in this line is because it kept 
        //giving me a really small total transaction and I could not figure out why,
        //so instead I put the rounding command in the last line and it worked! 
        double totalTransaction=totalPurchase+taxPercent*totalPurchase;
        System.out.println("The total cost of socks is $"+totalSockCost$);
        System.out.println("The tax on the socks is $"+salesTaxSocks);
        System.out.println("The total cost of glasses is $"+totalGlassesCost$);
        System.out.println("The tax on the glasses is $"+salesTaxGlasses);
        System.out.println("The total cost of envelopes is $"+totalEnvelopeCost$);
        System.out.println("The tax on the envelopes is $"+salesTaxEnvelopes);
        System.out.println("The total cost of purchases is $"+totalPurchase+", before taxes");
        System.out.println("The total cost of the transaction is $"+(double)Math.round(totalTransaction*100)/100);
    }
}