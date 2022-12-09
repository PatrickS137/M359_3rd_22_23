package Unit6.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    //point values are randomized lunch cost(2.5 to 3.25), usd to indonesian dollar(rupiah)
    private int totalPoints;

    Scanner input = new Scanner(System.in);
    String name = input.nextLine();

    public TriviaGame() throws FileNotFoundException {
        fileInput();


    }

    public void fileInput() throws FileNotFoundException {
        File allQuestions = new File ("studentScheduleData.txt");
        Scanner inQ = new Scanner(allQuestions);

        boolean e = false;
        while (!e) {
            String name = inQ.nextLine();
            if (name == null) {
                e = true;
            } else {
                Course[] totalCourses = new Course[8];
                for (int i = 0; i < totalCourses.length; i++) {
                    String teacherName = inQ.nextLine();
                    String className = inQ.nextLine(); // reads the entire line until end of line char
                    String grade = inQ.nextLine();
                    int period = inQ.nextInt();

                    if (i < 7) {
                        inQ.nextLine();
                    }
                    Course d = new Course(teacherName, className, grade, period);
                    totalCourses[i] = d;
                }
                if (inQ.hasNext()) {
                    inQ.nextLine();
                }
            }
        }
    }


}

