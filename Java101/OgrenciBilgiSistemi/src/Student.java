import java.util.Scanner;

public class Student {
    private String name;
    private String studentNumber;
    private Course course1;
    private Course course2;
    private Course course3;
    private Grade grade1;
    private Grade grade2;
    private Grade grade3;
    private double average;

    public Student(String name, String studentNumber){
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public Student(String name, String studentNumber, Course course1, Course course2, Course course3){
        this.name = name;
        this.studentNumber = studentNumber;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

    public void addBulkExamNote() {
        if (isEnrolled()) {
            Scanner input = new Scanner(System.in);
            System.out.print(this.course1.getName() + " , Grade : ");
            double note1 = input.nextInt();
            grade1 = new Grade(note1,course1);
            System.out.print(this.course2.getName() + " , Grade : ");
            double note2 = input.nextInt();
            grade2 = new Grade(note2,course1);
            System.out.print(this.course3.getName() + " , Grade : ");
            double note3 = input.nextInt();
            grade3 = new Grade(note3,course1);
            input.close();
        }
    }

    public boolean isEnrolled() {
        if(course1 == null && course2 == null && course3 == null) {
            System.out.println("This student is not enrolled in any courses!");
            return false;
        }
        return true;
    }

    public boolean isGraded() {
        if(grade1 == null && grade2 == null && grade3 == null) {
            System.out.println("This student is not graded for any courses!");
            return false;
        }
        return true;
    }

    public void gradeList() {
        if(isEnrolled() && isGraded()) {
            System.out.println("Grade List : ");
            System.out.println(grade1.getCourse().getName() + "\t=>\t" + grade1.getNote());
            System.out.println(grade2.getCourse().getName() + "\t=>\t" + grade2.getNote());
            System.out.println(grade3.getCourse().getName() + "\t=>\t" + grade3.getNote());
        }
    }

    public void calculateAverage() {
        if(isGraded()) {
            System.out.print("Average : ");
            System.out.println((grade1.getNote() + grade2.getNote() + grade3.getNote()) / 3);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Course getCourse1() {
        return course1;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public Course getCourse2() {
        return course2;
    }

    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    public Course getCourse3() {
        return course3;
    }

    public void setCourse3(Course course3) {
        this.course3 = course3;
    }

    public Grade getGrade1() {
        return grade1;
    }

    public void setGrade1(Grade grade1) {
        this.grade1 = grade1;
    }

    public Grade getGrade2() {
        return grade2;
    }

    public void setGrade2(Grade grade2) {
        this.grade2 = grade2;
    }

    public Grade getGrade3() {
        return grade3;
    }

    public void setGrade3(Grade grade3) {
        this.grade3 = grade3;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}