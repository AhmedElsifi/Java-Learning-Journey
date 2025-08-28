package Chapter1.Basics;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int noYears;
        double loanAmount,interestRate,monthlyPayment;
        System.out.println("how much is your loan ?");
        loanAmount = input.nextDouble();
        System.out.println("how many years will you pay your loan in ?");
        noYears = input.nextInt();
        System.out.println("how much is the interest rate for this loan ?");
        interestRate = input.nextDouble();
        monthlyPayment = (loanAmount*(interestRate/12))/(1-(1/(Math.pow((1+interestRate/12), (noYears*12)))));
        System.out.println("for this loan you will need to pay "+monthlyPayment+" each month for the next "+noYears+" which is also equal "+noYears*12+" months.");
    }
}
my 