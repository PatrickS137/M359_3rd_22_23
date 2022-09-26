package Unit2.notes;

public class Course {
    private String classTitle;
    private int numStudentsEnrolled;
    private String teacherName;

    public Course(String classTitle, int numStudentsEnrolled, String teacherName) {
        this.classTitle = classTitle;
        this.numStudentsEnrolled = numStudentsEnrolled;
        this.teacherName = teacherName;
    }

    public boolean equals(Shoe other){

        return(this.classTitle.equals(other.classTitle) && this.numStudentsEnrolled.equals(other.numStudentsEnrolled));
    }

    public int compareTo(Shoe other) {
        if (this.classTitle.equals(other.classTitle)) {
            if (this.numStudentsEnrolled.compareTo(other.numStudentsEnrolled) < 0) {
                return (-1);
            }
            else if (diff == 0) {
                return (0);
            }
            else {
                return (1);
            }

        }
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public void setNumStudentsEnrolled(int numStudentsEnrolled) {
        this.numStudentsEnrolled = numStudentsEnrolled;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getClassTitle() {
        return classTitle;
    }

    public int getNumStudentsEnrolled() {
        return numStudentsEnrolled;
    }

    public String getTeacherName() {
        return teacherName;
    }
}
