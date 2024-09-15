public class Grade {
    private double note;
    private Course course;

    public Grade(double note, Course course) {
        this.note = note;
        this.course = course;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
