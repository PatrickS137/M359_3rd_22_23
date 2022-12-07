package Unit5.notes.HeroVillainExample;

public class SchoolDay {
//    private static int weeksPassed = 0;
    private static int quizCounter = 0;
    private static int testCounter = 0;

    private int submittedHw;
    private int quizzes = 0;
    private Student student;
    private static int quizGrade = 0;
    private static int testGrade = 0;
    private static int hwGrade = 0;
    public SchoolDay(Student s){
        student = s;
    }

//-------------------------------------------------------------------------------------------------
    /**
     * This method simulates a school day; the student takes tests and quizzes/gets homework assigned that will adjust their grade accordingly
     * @param days The number of school days that have passed
     */
    public void simDay(int days){
        System.out.println("Today is day " + days);
        student.setHwLeft((int)(Math.random() * 8 + 3));
        student.setSleepHours((int)(Math.random()*9 + 1));
        student.doWorksheets();
        int numQuizzes = (int)(Math.random() * 2 + 1);
        for(int i = 0; i < numQuizzes; i++){
            passQuiz();
        }
        System.out.println("\t\t\t" + student.getName()+ " has done " + student.getHwDone() + " worksheets today");
        System.out.println("\t\t\t" + student.getName() + "'s knowledge is " + student.getKnows());
        if(days % 10 == 0){
            passTest();
        }
        if(days % 5 == 0){
            student.setWeeklyHw(0);
            student.setWeeklyHwDone(0);
        }
    }
//-------------------------------------------------------------------------------------------------
    /**
     * This method simulates the student taking a test and updates their grade accordingly
     */
    public void passTest(){
        int dayTestGrade;
        testCounter++;
        int reqKnows  = (int)(Math.random() * student.getKnows() + student.getKnows() / 2.75);
        if (reqKnows > student.getKnows()  * 1.0) {
            dayTestGrade = roundScore((100)*((double)student.getKnows()/reqKnows));
        }
        else{
            dayTestGrade = 100;
        }
        testGrade += dayTestGrade;
        System.out.println("\t\tTest grade = " + dayTestGrade + "%");

        calcTestGrade();
    }
//-------------------------------------------------------------------------------------------------
    /**
     * This method simulates the student taking a quiz and updates their grade accordingly
     */
    public void passQuiz(){
        int dayQuizGrade;
        quizCounter++;
        double reqKnows  = (Math.random() * student.getWeeklyHw() + 3) ;
        if (reqKnows > student.getWeeklyHwDone()  * 1.0) {
            dayQuizGrade = roundScore((100)*((double)student.getWeeklyHwDone()/reqKnows));
        }
        else{
            dayQuizGrade = 100;
        }
        quizGrade += dayQuizGrade;
        calcQuizGrade();
        System.out.println("\t\tQuiz grade = " + dayQuizGrade + "%");
    }
//-------------------------------------------------------------------------------------------------
    /**
     * This method rounds any given score to the nearest int (test, quiz, homework grades)
     * @param score  The score that needs to be rounded
     * @return Returns the rounded score (int)
     */
    public static int roundScore(double score){
        score += 0.5;
        return (int)(score);
    }
//-------------------------------------------------------------------------------------------------
    /**
     * Calculates and updates the total quiz grade by dividing the raw quiz grade by the number of quizzes and rounding it
     */
    public void calcQuizGrade(){
        student.setQuizGrade(roundScore((quizGrade / (double)(100 * quizCounter)) * 100));
    }
//-------------------------------------------------------------------------------------------------
    /**
     * Calculates and updates the total test grade by dividing the raw test grade by the number of tests and rounding it
     */
    public void calcTestGrade(){
        student.setTestGrade(roundScore((testGrade / (double)(100 * testCounter)) * 100));
    }

    public static int getQuizCounter() {
        return quizCounter;
    }

    public static void setQuizCounter(int quizCounter) {
        SchoolDay.quizCounter = quizCounter;
    }

    public static int getTestCounter() {
        return testCounter;
    }

    public static void setTestCounter(int testCounter) {
        SchoolDay.testCounter = testCounter;
    }

    public int getSubmittedHw() {
        return submittedHw;
    }

    public void setSubmittedHw(int submittedHw) {
        this.submittedHw = submittedHw;
    }

    public int getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(int quizzes) {
        this.quizzes = quizzes;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public static int getQuizGrade() {
        return quizGrade;
    }

    public static void setQuizGrade(int quizGrade) {
        SchoolDay.quizGrade = quizGrade;
    }

    public static int getTestGrade() {
        return testGrade;
    }

    public static void setTestGrade(int testGrade) {
        SchoolDay.testGrade = testGrade;
    }

    public static int getHwGrade() {
        return hwGrade;
    }

    public static void setHwGrade(int hwGrade) {
        SchoolDay.hwGrade = hwGrade;
    }
}
