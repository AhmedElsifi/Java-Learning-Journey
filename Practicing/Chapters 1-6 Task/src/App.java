import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        score += createQuestion(
                "What is the output of the following code?\n\npublic class Test {\n    public static void main(String[] args) {\n        int x = 5;\n        System.out.println(x * 2 + 3);\n    }\n}\nA. 13\nB. 16\nC. 10\nD. 8",
                'A', input) ? 1 : 0;

        score += createQuestion(
                "Which of the following is a valid declaration of a constant in Java?\nA. final int x = 10;\nB. constant int x = 10;\nC. int final x = 10;\nD. int constant x = 10;",
                'A', input) ? 1 : 0;

        score += createQuestion(
                "What does the following code snippet do?\n\nboolean flag = (10 > 5) && (3 < 2);\nA. Sets flag to true\nB. Sets flag to false\nC. Causes a compilation error\nD. Sets flag to null",
                'B', input) ? 1 : 0;

        score += createQuestion(
                "Which method is used to read a double value from the user using Scanner?\nA. nextDouble()\nB. getDouble()\nC. readDouble()\nD. scanDouble()",
                'A', input) ? 1 : 0;

        score += createQuestion(
                "What is the result of 5 / 2 in Java?\nA. 2.5\nB. 2\nC. 2.0\nD. 3",
                'B', input) ? 1 : 0;

        score += createQuestion(
                "Which of the following is the correct way to generate a random integer between 0 and 9 inclusive?\nA. (int)(Math.random() * 10)\nB. (int)(Math.random() * 9)\nC. Math.random(10)\nD. Math.randint(0, 9)",
                'A', input) ? 1 : 0;

        score += createQuestion(
                "What is the output of the following code?\n\nint score = 85;\nif (score >= 90) {\n    System.out.print(\"A\");\n} else if (score >= 80) {\n    System.out.print(\"B\");\n} else {\n    System.out.print(\"C\");\n}\nA. A\nB. B\nC. C\nD. Nothing",
                'B', input) ? 1 : 0;

        score += createQuestion(
                "Which operator has the highest precedence in Java?\nA. +\nB. *\nC. ()\nD. =",
                'C', input) ? 1 : 0;

        score += createQuestion(
                "What does the following code print?\n\nSystem.out.print(\"Hello\" + \" \" + \"World\");\nA. HelloWorld\nB. Hello World\nC. Hello+World\nD. Compilation error",
                'B', input) ? 1 : 0;

        score += createQuestion(
                "Which of these is a valid main method signature in Java?\nA. public static void main(String[] args)\nB. public void main(String[] args)\nC. static void main(String[] args)\nD. public static int main(String[] args)",
                'A', input) ? 1 : 0;

        System.out.println("\nYour final score is: " + score * 10 + "%");
        letterGrade(score * 10);
        input.close();
    }

    public static void letterGrade(int score) {
        if (score > 90) {
            System.err.println("Excellent :)");
        } else if (score > 80) {
            System.err.println("Very Good :>");
        } else if (score > 50) {
            System.err.println("Fine :|");
        } else {
            System.err.println("Failed >:(");
        }
    }

    public static boolean createQuestion(String question, char rightAnswer, Scanner input) {
        System.out.println(question);
        System.out.println("=====================================================");
        char userAnswer = Character.toUpperCase(input.next().charAt(0));
        return (userAnswer == rightAnswer);
    }
}
