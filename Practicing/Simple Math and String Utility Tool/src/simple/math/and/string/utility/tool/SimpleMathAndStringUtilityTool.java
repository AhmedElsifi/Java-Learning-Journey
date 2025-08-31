package simple.math.and.string.utility.tool;

import java.util.Scanner;

public class SimpleMathAndStringUtilityTool {

    public static void main(String[] args) {
        float num1, num2;
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my Simple Math and String Utility Tool.");
        System.out.print("please enter your first number : ");
        num1 = input.nextFloat();
        System.out.print("please enter your second number : ");
        num2 = input.nextFloat();
        input.nextLine();
        System.out.print("please enter a string : ");
        str = input.nextLine();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num2 + " - " + num1 + " = " + (num2 - num1));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num2 + " / " + num1 + " = " + (num2 / num1));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        System.out.println(num2 + " % " + num1 + " = " + (num2 % num1));
        System.out.println(num1 + " to the power of " + num2 + " = " + Math.pow(num1, num2));
        System.out.println(num2 + " to the power of " + num1 + " = " + Math.pow(num2, num1));
        System.out.println("the square root of the number " + num1 + " is equal to " + Math.sqrt(num1));
        System.out.println("the square root of the number " + num2 + " is equal to " + Math.sqrt(num2));
        if (num1 == 0) {
            System.out.println("the first number is equal to zero");
        } else if (num1 > 0) {
            System.out.println("the first number is positive");

        } else if (num1 < 0) {
            System.out.println("the first number is negative");
        }
        System.out.println("=========================================");
        System.out.println("As for the string .");
        System.out.println("the string you entered length is " + str.length());
        System.out.println("the string you entered in upper case is " + str.toUpperCase());
        System.out.println("the string you entered in lower case is " + str.toLowerCase());
        if (Character.isLetter(str.charAt(0))) {
            System.out.println("the string you entered starts with a letter");
        } else {
            System.out.println("the string you entered does not start with a letter");
        }
    }

}
