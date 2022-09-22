/* package Unit2.examples;

public class StringPractice {
    public static void main(String[] args) {
        String course = "AP Java - CSA";
        String school = "Fremd High School";
        String teacherName;

        // find first occurrence of "a" in course and print out the result

        // find first occurrence of "a" in school and print out the result

        // how would you extract the string "md H" from school?

        // how would you extract the string CSA from course?
        // This can be done TWO ways - can you figure out both?

        // how can we print out FREMD HIGH SCHOOL


        // Create a Scanner object
         input = new (System.in);
        // Read in the teacher name as two words with a space in between them
        System.out.println("Enter your full name, with a space between the names");
        teacherName = input.nextLine();
        // using TWO lines of code, display the teacher name as ONE word, without a space

        int spaceLocation = teacherName.indexOf(" ");
        String newName = teacherName.substring(0, spaceLocation) + teacherName.substring(spaceLocation + 1);
        System.out.println(newName);
    }
}
*/