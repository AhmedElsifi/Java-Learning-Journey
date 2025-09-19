import java.math.BigDecimal;

public class Student {
    private StringBuilder name;
    private int grade;

    public Student() {
        this.name = new StringBuilder("no name is set");
        this.grade = 0;
    }

    public Student(String name, int grade) {
        this.name = new StringBuilder(name);
        this.grade = grade;
    }

    public void printStudentDetails() {
        System.out.printf("%-10s %-10d \n", this.name, this.grade);
    }

    public void setName(String name) {
        this.name = new StringBuilder(name);
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public StringBuilder getname() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }
}
