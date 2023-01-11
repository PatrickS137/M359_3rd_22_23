package Unit7;

import java.util.ArrayList;
public class notes7172 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        //there is no initializer list for ArrayLists
        names.add("Ashkat");
        names.add("Ben");
        names.add("Colin");
        names.add("denna");
        System.out.println(names.toString());
        names.add(1,"Amy");
        System.out.println(names.toString());
        //remove ben
        String removedName = names.remove(2);
        System.out.println(removedName + " was ejected");
        System.out.println(names.toString());
        //update or change Denna to say Mrs.Denna
        names.set(3, "Mrs.Denna");
        System.out.println(names);
        names.add(names.remove(2));
        System.out.println(names.toString());

    }
}
