package Unit5.notes.HeroVillainExample;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SemesterTester {
//-------------------------------------------------------------------------------------------------
    /**
     * This method runs the simulate() function, and creates the
     student object that will be used to run the school year*/
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = myObj.nextLine();
        System.out.println("'day' = one day, 'week' = one week,'semester' = one semester, 'stats' = get stats");
        Student s = new Student(name);
        simulate(s);
    }
    final static double TESTWEIGHT = 0.5;
    final static double QUIZWEIGHT = 0.35;
    final static double HWWEIGHT = 0.15;
    private static Student student;
//-------------------------------------------------------------------------------------------------
    /**
     * This method simulates one school year of the given student
     (takes user input to display statistics of the student)
     * @param s Student that will attend the year of school**/
    public static void simulate(Student s){
        Scanner input = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter a Command: (death to quit)");
        String value = input.nextLine();
        while (!value.equals("death")) {
            if (value.equals("day")){
                SchoolDay day = new SchoolDay(s);
                day.simDay(i);
            }
            else if (value.equals("week")){
                SchoolDay day = new SchoolDay(s);
                for (int j = 0; j<6; j++){
                    day.simDay(i);
                    i++;
                }
            }
            else if (value.equals("semester")){
                SchoolDay day = new SchoolDay(s);
                for (int j = 0; j<76; j++){
                    day.simDay(i);
                    i++;
                }
            }
            else if (value.equals("stats")){
                student = s;
                String output = "";
                output +=
                        "----------------------------------------";
                output += "\n";
                output += "-- Your name:\t\t\t" +
                        student.getName();
                output += "\n";
                output += "-- Todays knows:\t\t" +
                        student.getKnows();
                output += "\n";
                output += "-- WS done today:\t\t" +
                        student.getHwDone();
                output += "\n";
                output += "-- WS done this week:\t" +
                        student.getWeeklyHwDone();
                output += "\n";
                output += "-- Your current grade:\t" +
                        student.getSleepHours();
                output += "\n\n";
                output += "-- Weekly Worksheets Done:\t" +
                        student.getWeeklyHw();
                output += "\n";
                output += "-- Knows:\t" + student.getKnows();
                output += "\n";
                output += "-- Total Grade:\t" +
                        getWeightedGrade(student) + "%";
                output += "\n";
                output +=
                        "----------------------------------------";
                System.out.println(output);
            }
            else{
                System.out.println("bruh");
            }
            i++;
            System.out.println("Enter a Command: (death to quit)");
            value = input.nextLine();
        }
        String output = "";
        output += "----------------------------------------";
        output += "\n";
        output += "-- Your name:\t\t\t\t" + s.getName();
        output += "\n";
        output += "-- Total knows:\t\t\t\t" + s.getKnows();
        output += "\n";
        output += "-- Total worksheets done:\t" + s.getTotalHw();
        output += "\n";
        output += "-- Final Weighted Grade:\t" + getWeightedGrade(s)
                + "%";
        output += "\n";
        output += "----------------------------------------";
        System.out.println(output);
    }
//-------------------------------------------------------------------------------------------------
    /**
     * This method returns the final weighted grade of the
     student after a year of school
     * @param s Student that attend the year of school
     * @return Returns the weighted grade of the student**/
    public static int getWeightedGrade(Student s){
        double quizGrade = s.getQuizGrade();
        double testGrade = s.getTestGrade();
        double hwGrade = s.getHWGrade();
        quizGrade = quizGrade * QUIZWEIGHT;
        testGrade = testGrade * TESTWEIGHT;
        hwGrade = hwGrade * HWWEIGHT;
        return SchoolDay.roundScore(hwGrade + testGrade + quizGrade);
    }
}
