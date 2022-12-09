package Unit6.arrays;

import Unit5.notes.HeroVillainExample.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Course c1 = new Course("Matarrazo","Gym" , "A",1);
        Course c2 = new Course("Welch","Trigonometry" , "A",2);
        Course c3 = new Course("Denna","Comp Sci" , "A",3);
        Course c4 = new Course("Teichert","Music Production" , "A",4);
        Course c5 = new Course("Syed","English" , "A",5);
        Course c6 = new Course("Meuret","Chinese" , "A",6);
        Course c7 = new Course("--","Lunch" , "--",7);
        Course c8 = new Course("Carlson","Chemistry" , "A",8);

        String[] myCourses = {String.valueOf(c1), String.valueOf(c2), String.valueOf(c3), String.valueOf(c4), String.valueOf(c5), String.valueOf(c6), String.valueOf(c7), String.valueOf(c8)};

        for (String a: myCourses) {
            System.out.println(a);
        }
        */

    //create new file var to open file
    //create new file var to open file
    // read in student name
        //create a course [] array and instantiate to size 8
        //use for loop to read in data fro a Course 8 times
        //Read in teacher name, course, grade, period
        //need a dummy read to cleaar out the EOL char
        //create a course var with this data
        //save this Course in course array
        //create student object with this name and course[]
        //System.out.println(Stuident.getName());
        //print student to see if it works
        //set myClasses to totalCourses





        File allSchedule = new File ("studentScheduleData.txt");
        Scanner inStu = new Scanner(allSchedule);
        String maxStudents = inStu.nextLine();
        boolean e = false;
        while (!e) {
            String name = inStu.nextLine();
            if (name == null) {
                e = true;
            }
            else {
                Course[] totalCourses = new Course[8];
                for (int i = 0; i < totalCourses.length; i++) {
                    String teacherName = inStu.nextLine();
                    String className = inStu.nextLine(); // reads the entire line until end of line char
                    String grade = inStu.nextLine();
                    int period = inStu.nextInt();

                    if (i < 7) {
                        inStu.nextLine();
                    }
                    Course d = new Course(teacherName, className, grade, period);
                    totalCourses[i] = d;
                }
                if (inStu.hasNext()){
                    inStu.nextLine();
                }
                Stuident s = new Stuident(name, totalCourses);
            }
        }








/*
        //create a scanner to read file
        //select the option to add the throws FileNotFoundException to the main method header
        Scanner inF = new Scanner(oneCourse);

        //now we can call methods on the Scanner object inF to read data
        // .next()  .nextLine() .nextInt()  .hasNextLine    .etc

        String teacherName = inF.nextLine();
        String className = inF.nextLine(); // reads the entire line until end of line char
        String grade = inF.nextLine();
        int period = inF.nextInt();

        //create a course var

        Course c = new Course(teacherName, className, grade, period);

        System.out.println(c);


*/
    }





}
