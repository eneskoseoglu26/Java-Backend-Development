public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Mathematics", "MAT");
        Course course2 = new Course("Physics", "PHY");
        Course course3 = new Course("History", "HST");
        Course course4 = new Course("Biology", "BIO");

        Teacher teacher1 = new Teacher("Mehmet Kara", "Mathematics", "111");
        Teacher teacher2 = new Teacher("Yücel Alver", "History", "222");

        course1.addTeacher(teacher1);
        course2.addTeacher(teacher2);
        course3.addTeacher(teacher2);
        System.out.println("-------------------");
        course1.teacherInfo();
        course2.teacherInfo();
        course3.teacherInfo();

        Student student1 = new Student("Enes Köseoğlu", "19011907", course1, course3, course4);
        student1.addBulkExamNote();
        student1.gradeList();
        student1.calculateAverage();
        System.out.println("-------------------");
        Student student2 = new Student("Hande Koşuta", "16111232");
        student2.gradeList();

    }
}