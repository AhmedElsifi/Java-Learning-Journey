import java.math.BigDecimal;

public class Student {
    StringBuilder name;
    BigDecimal grade;

    public Student() {
        this.name = new StringBuilder("no name is set");
        this.grade = new BigDecimal(0);
    }

    public Student(String name, int grade) {
        this.name = new StringBuilder(name);
        this.grade = new BigDecimal(grade);
    }

    public void printStudentDetails() {
        System.out.printf("%-10s %-10d \n", this.name, this.grade);
    }
}
