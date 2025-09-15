import java.util.*;

public class App {
    public static void main(String[] args) {
        Student[] students = new Student[100];
        Scanner input = new Scanner(System.in);
        int choice, searchID;
        String tempName;
        int tempDay, tempMonth, tempYear;
        BirthDate tempBirthDate = new BirthDate();
        System.out.println("Welcome to Prime Academy Simulator!");
        System.out.println("Initializing Academy data…”");
        System.out.println("Ready to manage your prime students!");
        while (true) {
            System.out.println("Main Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Print student report");
            System.out.println("3. Print all students");
            System.out.println("4. Exit");
            System.out.println("Choose an option (1-5)");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter student name:");
                    tempName = input.nextLine();
                    while (true) {
                        System.out.println("Enter birth year:");
                        tempYear = input.nextInt();
                        input.nextLine();
                        System.out.println("Enter birth month (1-12):");
                        tempMonth = input.nextInt();
                        input.nextLine();
                        System.out.println("Enter birth day (1-31):");
                        tempDay = input.nextInt();
                        input.nextLine();
                        if (tempMonth > 12 || tempMonth < 1 || tempDay > 31 || tempDay < 1 || tempYear < 0) {
                            System.out.println("Wrong Date , Please re-enter it again!");
                        } else {
                            break;
                        }
                    }
                    System.out.println("Enter number of exams:");
                    int examCount = input.nextInt();
                    input.nextLine();
                    int[] tempExamScores = new int[examCount];
                    for (int i = 0; i < examCount; i++) {
                        System.out.println("Enter score for exam " + (i + 1) + ": ");
                        tempExamScores[i] = input.nextInt();
                    }

                    tempBirthDate.setBirthdate(tempDay, tempMonth, tempYear);
                    students[Student.id] = new Student();
                    students[Student.id].newStudent(tempName, tempBirthDate, tempExamScores);

                    System.out.println("Student " + students[Student.id - 1].name + " added successfully!");
                    break;
                case 2:
                    System.out.println("Select student by index or ID : ");
                    searchID = input.nextInt();
                    students[searchID].printDetails();
                    break;
                case 3:
                    for (int i = 0; i < Student.id; i++) {
                        students[i].printDetails();
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using my program!");
                    System.out.println("exiting the program.....");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

}

class Student {
    String name;
    public static int id;
    int studentId, sum = 0, examCount;
    BirthDate birthDate;
    int[] examScores;

    public void newStudent(String name, BirthDate birthDate, int[] examScores) {
        this.name = name;
        this.birthDate = birthDate;
        this.examScores = examScores;
        this.examCount = examScores.length;
        studentId = id;
        id++;
    }

    public void printDetails() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.studentId);
        System.out.println("Birth Date: ");
        this.birthDate.printBirthDate();
        System.out.println("Exam Scores: ");
        sum = 0;
        for (int score : this.examScores) {
            System.out.println(score);
            sum += score;
        }
        System.out.println("Average Score: " + (sum / this.examCount));
        System.out.println("---------------------");
    }
}

class BirthDate {
    int day, month, year;

    public void setBirthdate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printBirthDate() {
        System.out.println(day + " - " + month + " - " + year);
    }
}
