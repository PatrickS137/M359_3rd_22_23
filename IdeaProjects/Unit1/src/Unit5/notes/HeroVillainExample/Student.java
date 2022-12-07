package Unit5.notes.HeroVillainExample;

public class Student {
    private int hwDone;
    private int hwLeft;
    private int weeklyHw;
    private int weeklyHwDone;

    private boolean hasStudied; //if worksheetsDone >= quizWorksheets then true
    private int distractions;
    private double totalGrade;
    private int sleepHours = (int)(Math.random()*9 + 1); //"you got" + sleepHours + "and gained " + sleepHours/2 + "focus hours";
    private int knows;
    private int testGrade;
    private int totalHw;
    private int totalHwDone;
    private String name;

    private int quizGrade;//worksheets done
    //for knows each worksheet adds x knows
    public Student(String n){
        hwDone = 0;
        hasStudied = false;
        distractions = 0;
        totalGrade = 0.0;
        knows = 0;
        name = n;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }


    public int getHwDone() {
        return hwDone;
    }

    public void setHwDone(int hwDone) {
        this.hwDone = hwDone;
    }

    public int getHwLeft() {
        return hwLeft;
    }

    /**
     * This method simulates the student doing worksheets, and updates their grade accordingly
     */
    public void doWorksheets() {
        totalHw += hwLeft;
        if (sleepHours > hwLeft) {
            hwDone = hwLeft;
        } else {
            hwDone = sleepHours;
        }
        knows += hwDone;
        totalHwDone += hwDone;
        weeklyHwDone += hwDone;
        weeklyHw += hwLeft;
        getHWGrade();

    }

    public int getHWGrade(){
        return (SchoolDay.roundScore((totalHwDone / (double)(totalHw)) * 100));
    }
    public void setHwLeft(int hwLeft) {
        this.hwLeft = hwLeft;
    }

    public int getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(int sleepHours) {
        this.sleepHours = sleepHours;
    }

    public boolean isHasStudied() {
        return hasStudied;
    }

    public void setHasStudied(boolean hasStudied) {
        this.hasStudied = hasStudied;
    }

    public int getDistractions() {
        return distractions;
    }

    public int getTotalHw() {
        return totalHw;
    }

    public void setDistractions(int distractions) {
        this.distractions = distractions;
    }

    public double getTotalGrade() {
        return totalGrade;
    }

    public void setTotalGrade(double totalGrade) {
        this.totalGrade = totalGrade;
    }

    public int getKnows() {
        return knows;
    }

    public void setKnows(int knows) {
        this.knows = knows;
    }

    public int getWeeklyHw() {
        return weeklyHw;
    }

    public void setWeeklyHw(int weeklyHw) {
        this.weeklyHw = weeklyHw;
    }

    public int getWeeklyHwDone() {
        return weeklyHwDone;
    }

    public void setWeeklyHwDone(int weeklyHwDone) {
        this.weeklyHwDone = weeklyHwDone;
    }

    public int getTestGrade() {
        return testGrade;
    }

    public void setTestGrade(int testGrade) {
        this.testGrade = testGrade;
    }

    public void setTotalHw(int totalHw) {
        this.totalHw = totalHw;
    }

    public int getQuizGrade() {
        return quizGrade;
    }

    public void setQuizGrade(int quizGrade) {
        this.quizGrade = quizGrade;
    }
}
