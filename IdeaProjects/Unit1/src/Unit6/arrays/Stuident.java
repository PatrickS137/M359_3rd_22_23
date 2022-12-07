package Unit6.arrays;

public class Stuident {
    private String name;
    private Course[] myClasses;

    public Stuident(String name,Course[] courseArray) {
        this.name = name;
        myClasses = courseArray;

        System.out.println(name);
        for (Course a: myClasses){
            System.out.println(a);
        }
    }

    public Stuident(){
        String[] myClasses= {"Gym", "Trig", "Comp Sci A", "Music Production", "English", "Chinese 3", "Lunch", "Chemistry"};
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Course[] getMyClasses() {
        return myClasses;
    }

    public void setMyClasses(Course[] myClasses) {
        this.myClasses = myClasses;
    }
}
