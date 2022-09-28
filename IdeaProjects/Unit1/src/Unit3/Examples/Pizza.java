package Unit3.Examples;

public class Pizza {
    private String store;
    private int inches, numToppings;
    private boolean isDeepDish;

    // menu go to code -> generage to access the shortcuts to have intellij
    //make the constructor and get/set methods for you
    //hold shift to select everything in between
    //code will be inserted where cursor is
    public Pizza(String store, int inches, int numToppings, boolean isDeepDish) {
        this.store = store;
        this.inches = inches;
        this.numToppings = numToppings;
        this.isDeepDish = isDeepDish;
    }

    public Pizza(String store, int inches, boolean isDeepDish) {
        this.store = store;
        this.inches = inches;
        this.isDeepDish = isDeepDish;
        this.numToppings = 0;
    }

    /** a toString method always has the method header of
     * public string tostring()
     * this method never has print statements
     * instead if creates a print-ready string and returns it
     * this mehod will be called on whenever we want to print a pizza object
     * reference variable
     *
     * (basically telling java how to print a pizza object
     *
     * @return
     */

    public String toString(){
        String str = "";
        str += "My pizza is from " + store + " it is " + inches + " inches";
        str += "\n";
        if (isDeepDish) {
            str += " I love deep dish" ;
        }
        else {
            str +=  "Thin crust is the way to go";
        }
        if (numToppings == 0){
            str += " \n I love  cheese pizza";
        }
        else{
            str += "\nMy pizza has" + numToppings + " toppings";
        }
        return str;
    }
    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }

    public String compareTo(Pizza other){

        int sizeDiff = this.getInches() - other.getInches();
        if (sizeDiff != 0){
            return("size difference is" + sizeDiff +"inches");
        }
        else{

            if (this.getNumToppings()-other.getNumToppings() != 0){
                return("size difference is" + sizeDiff +"inches");
            }
            //return("there are " + this.getNumToppings()-other.getNumToppings() + "a");
        }
        return("a");
    }


}
