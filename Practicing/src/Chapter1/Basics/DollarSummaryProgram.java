package Chapter1.Basics;

import java.util.Scanner;

public class DollarSummaryProgram {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the amount of dollars and cents in a decimal format (1 dollar and 5 cents is 1.05 dollars) : ");
        double decimalNotation = input.nextDouble();
        int totalCents = (int)Math.round(decimalNotation * 100);
         int dollars = totalCents / 100;
        totalCents %= 100;

        int quarters = totalCents / 25;
        totalCents %= 25;

        int dimes = totalCents / 10;
        totalCents %= 10;

        int nickels = totalCents / 5;
        totalCents %= 5;

        int pennies = totalCents;
        
        System.out.println("You have "+ dollars +" dollars and "+quarters+" quarters and "+dimes+" dimes and "+nickels+" nickles and "+pennies+" pennies.");
    }
}
