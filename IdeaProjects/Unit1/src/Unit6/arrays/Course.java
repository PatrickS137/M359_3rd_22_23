package Unit6.arrays;

public class Course {
    private String teacherName;
    private String subject;
    private String currentGrade;
    private int period;

    public Course(String teacherName, String subject, String currentGrade, int period) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.currentGrade = currentGrade;
        this.period = period;
    }

    public Course(String subject, int period) {
        this.subject = subject;
        this.period = period;
    }

    public String toString(){
        String output = "Per. " + period  + "\t" + currentGrade  + "\t" + subject  + "\t" + teacherName;
        return output;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    /*
    Course class:
    String teacherName, subject, currentGrade
    int period
    Constructor for a Course object where all fields are passed in
    Constructor for a Course object without a teacher or grade
    get/set methods
    toString to print all Course data on one line
    Per: 1	A	Basketball PE		Vlaming
 */

}
