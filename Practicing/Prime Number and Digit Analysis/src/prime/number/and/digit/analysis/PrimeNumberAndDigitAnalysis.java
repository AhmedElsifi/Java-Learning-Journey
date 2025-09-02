package prime.number.and.digit.analysis;

import java.util.Scanner;

public class PrimeNumberAndDigitAnalysis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num, divider, noDigits = 0, sumOfDigits = 0;
        boolean prime = true;
        System.out.print("please enter a positive integer : ");
        num = input.nextLong();
        divider = num;
        if (num < 1) {
            System.err.println("you entered a negative number or a zero.");
            System.out.print("Exiting program....");
            System.exit(1);
        } else {
            System.out.println("Your number is " + num);
            if (num != 2) {
                for (long i = 2; i < Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        prime = false;
                    }
                }
            }
            System.out.println("This number is " + ((prime) ? "a prime number." : "not a prime number."));
            System.out.println("Whether each digit is even or odd :");
            while (divider != 0) {
                sumOfDigits += divider % 10;
                System.out.println(divider % 10 + (divider % 2 == 0 ? " : even" : " : odd"));
                divider /= 10;
                noDigits++;
            }
            System.out.println("The number of the digits in this number is = " + noDigits);
            System.out.println("The sum of digits in this number is = " + sumOfDigits);

        }
    }

}
