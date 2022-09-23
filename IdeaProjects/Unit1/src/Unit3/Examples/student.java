package Unit3.Examples;

public class student {
    this.fname;
    this.lname;

    public boolean equals(Student other){
        return (this.fName.equals(other.Fname) && this.getlName().equals(other.getlName()));
    }

    public compareTo(Student other){
        //use compareTo from String class to check what value is returned
        //when lNames are compared
        int (lNameDiff = this.lName.compareTo(other.lName_);
        if (lNameDiff != 0)
            return lNameDiff;
        return this.fName.compareTo(other.fName);
    }
}
