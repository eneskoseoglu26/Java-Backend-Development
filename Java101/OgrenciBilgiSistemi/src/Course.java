public class Course {
    private String name;
    private String code;
    private Teacher teacher;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public void addTeacher(Teacher teacher) {
        if(teacher.getCode().equals(this.code)) {
            this.teacher = teacher;
            System.out.println("Teacher successfully added!\n" + this.name + " => " + this.teacher.getName());
        } else {
            System.out.println("This teacher is not responsible for this course!");
        }
    }

    public void teacherInfo() {
        if(teacher != null) {
            System.out.println("Teacher Information :\n" + teacher.getName() + "\n" + teacher.getBranch() + "\n" + teacher.getMobile());
        } else {
            System.out.println("There is no teacher responsible for this course!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
