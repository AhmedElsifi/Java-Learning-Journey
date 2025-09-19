import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        String name;
        int grade;

        System.out.println("How many Students will you process ? ");
        int noStudents = input.nextInt();
        Student[] students = new Student[noStudents];
        for (int i = 0; i < noStudents; i++) {
            System.out.print("Enter the name for student [" + (i + 1) + "]: ");
            input.nextLine();
            name = input.nextLine();
            System.out.print("Enter the grade for student [" + (i + 1) + "]: ");
            grade = input.nextInt();
            students[i] = new Student(name, grade);

        }
        while (true) {
            System.out.println("What do you wantt to do ?");
            System.out.println("1. Print the Average Grade");
            System.out.println("2. Print the Highest and Lowest Grades and who got them");
            System.out.println("3. Print the number of students who passed");
            System.out.println("4. Exit");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The Average Grades for the students you entered = " + averageGrades(students));
                    break;
                case 2:
                    System.out.println("The Highest of the Grades for the students you entered is : ");
                    System.out.println("Name : " + HighestGrade(students).getname() + ", Grade : "
                            + HighestGrade(students).getGrade());
                    System.out.println("The Lowest of the Grades for the students you entered is : ");
                    System.out.println("Name : " + LowestGrade(students).getname() + ", Grade : "
                            + LowestGrade(students).getGrade());
                    break;
                case 3:
                    System.out.println("The Number of students who passed = " + passedCounter(students));
                    break;
                case 4:
                    System.out.println("Thanks for using my program");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("please enter a valid input!");
                    break;
            }
        }
    }

    public static float averageGrades(Student[] students) {
        int sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return (float) sum / students.length;
    }

    public static int passedCounter(Student[] students) {
        int passed = 0;
        for (Student student : students) {
            if (student.getGrade() > 60) {
                passed++;
            }
        }
        return passed;
    }

    public static Student HighestGrade(Student[] students) {
        Student HighestGradeStudent = new Student();
        for (Student student : students) {
            if (student.getGrade() > HighestGradeStudent.getGrade()) {
                HighestGradeStudent.setName(student.getname().toString());
                HighestGradeStudent.setGrade(student.getGrade());
            }
        }
        return HighestGradeStudent;
    }

    public static Student LowestGrade(Student[] students) {
        Student LowestGradeStudent = new Student("", 100);
        for (Student student : students) {
            if (student.getGrade() < LowestGradeStudent.getGrade()) {
                LowestGradeStudent.setName(student.getname().toString());
                LowestGradeStudent.setGrade(student.getGrade());
            }
        }
        return LowestGradeStudent;
    }

}