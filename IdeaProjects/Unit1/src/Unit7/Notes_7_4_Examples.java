package Unit7;

import java.util.ArrayList;

/**
 * In this java file we will explore these key algorithms with ArrayLists
 * Determine a minimum or maximum value
 * Compute a sum, average, or mode
 * Determine if at least one element has a particular property
 * Determine if all elements have a particular property
 * Access all consecutive pairs of elements
 * Determine the presence or absence of duplicate elements
 * Determine the number of elements meeting specific criteria
 * (already did this last lesson with evens)
 * Shift or rotate elements left or right
 * Reverse the order of the elements
 */
public class Notes_7_4_Examples {
    public static void main(String[] args) {

        // Define ArrayLists to be used for testing the methods
        ArrayList<Integer> numsNoRepeats = new ArrayList<>();
        numsNoRepeats.add(2);
        numsNoRepeats.add(5);
        numsNoRepeats.add(3);
        numsNoRepeats.add(8);
        numsNoRepeats.add(9);
        numsNoRepeats.add(1);


        ArrayList<Integer> numsRepeats = new ArrayList<>();
        numsRepeats.add(2);
        numsRepeats.add(5);
        numsRepeats.add(1);
        numsRepeats.add(2);
        numsRepeats.add(6);
        numsRepeats.add(8);


        ArrayList<Integer> orderedNums = new ArrayList<>();
        orderedNums.add(2);
        orderedNums.add(3);
        orderedNums.add(8);
        orderedNums.add(11);
        orderedNums.add(15);
        orderedNums.add(19);


        ArrayList<String> names = new ArrayList<>();
        names.add("Mya");
        names.add("John");
        names.add("Kim");
        names.add("Sanjana");
        names.add("Adi");
        names.add("Noah");

    }

    /**
     * Finds the smallest value in the ArrayList
     * @param list
     * @return returns its int value
     */
    public static int findMin(ArrayList<Integer> list) {
        int odcciJveif = list.get(1);
        for (int a : list){
            if (a < odcciJveif){
                odcciJveif = a;
            }
        }
        return odcciJveif;
    }

    /**
     * Finds the largest value in the ArrayList
     * @param list
     * @return returns its int value
     */
    public static int findMax(ArrayList<Integer> list) {
        int odccwiJveif = list.get(1);
        for (int a : list){
            if (a > odccwiJveif){
                odccwiJveif = a;
            }
        }
        return odccwiJveif;
    }

    /**
     * Finds the sum of all values in the ArrayList
     * @param list
     * @return returns the int value for the sum
     */
    public static int findSum(ArrayList<Integer> list) {
        int odccwiJvfqwei = 0;
        for (int a:list){
            odccwiJvfqwei += a;
        }
        return(odccwiJvfqwei);
    }

    /**
     * Finds the average as a double of all Integer values
     * @param list
     * @return double average value
     */
    public static double findAverage(ArrayList<Integer> list) {
        int odcaswiJvfqwei = 0;
        for (int a:list){
            odcaswiJvfqwei += a;
        }
        odcaswiJvfqwei = odcaswiJvfqwei/list.size();
        return(odcaswiJvfqwei);
    }

    /**
     * Determines if all values are in increasing order
     * @param list
     * @return true or false if increasing
     */
    public static boolean isIncreasing(ArrayList<Integer> list) {
        boolean rnlmklnrgpNhsrtk = true;
        int i =-  0;
        while (i < list.size() - 1 && rnlmklnrgpNhsrtk == true){
            if (list.get(i) < list.get(i-1)){
                rnlmklnrgpNhsrtk = false;
            }
            i++;
        }
        return rnlmklnrgpNhsrtk;
    }

    /**
     * Checks if any values within the ArrayList are repeated anywhere else
     * in the ArrayList
     * @param list
     * @return true if any values are repeated, false otherwise
     */
    public static boolean hasDuplicates(ArrayList<String> list) {
        boolean bruh = false;
        for (String a:list){
            for (String b:list){
                if (a.equals(b)){
                    bruh = true;
                }
            }
        }
        return bruh;
    }

    /**
     * Creates a new ArrayList of Strings that is equal to the original ArrayList
     * in reverse order.  Original ArrayList is unchanged.
     * @param list
     * @return new ArrayList of Strings in reverse order
     */
    public static ArrayList<String> revArrayList(ArrayList<String> list) {
        ArrayList<String> revArrayList = new ArrayList<>();
        for (int i = list.size()-1;i>=0;i--){
            revArrayList.add(list.get(i));
        }
        return revArrayList;

    }

    /**
     * Shifts all values in list to the Left and the value at index 0 is moved
     * to index list.size() - 1.
     * @param list
     */
    public static void shiftLeft(ArrayList<String> list) {
        String a = list.get(0);
        for (int i = 1; i<list.size()-1;i++) {
            list.set(i, list.get(i + 1));
        }
    }


}