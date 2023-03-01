package Unit7.TicketMaster.U8;

import java.util.ArrayList;

public class Fix2D {
    public static void main(String[] args) {

        ArrayList<String> myKids = new ArrayList<>();
        myKids.add("Aubrey");
        myKids.add("Riley");
        myKids.add("Brayden");

        int numKids = myKids.size();

        for (String kid: myKids) {
            System.out.println(kid);
        }

        int[][] favNums = { {1, 2, 3}, {2, 4, 6}, {3, 6, 9} };

        for (int[] row: favNums) {
            for (int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        String[] pets = {"cat", "dog", "bird"};
        String[] foods = {"pizza", "ice cream", "chocolate"};
        String[] movies = {"Avengers", "Harry Potter", "Oceans 11"};

        String[][] myFavs = {pets, foods, movies};

        boolean result = isFound(myFavs, "ice cream");
        System.out.println("Is ice cream a fav? " + result);

        result = isFound(myFavs, "speghetti");
        System.out.println("Is speghetti a fav? " + result);

    }

    public static boolean isFound(String[][] arr, String word) {
        for (String[] row: arr) {
            for (String s: row) {
                if (s.equals( word)) {
                    return true;
                }

            }
        }
        return false;
    }

}