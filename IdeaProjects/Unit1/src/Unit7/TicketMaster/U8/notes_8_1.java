package Unit7.TicketMaster.U8;

public class notes_8_1 {
    public static void main(String[] args) {


        // Three initialized 1D arrays

        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr3 = {3, 6, 9, 12, 15};
        int[] arr4 = {4, 8, 12, 16, 20};

        // 1. Create a 2D array called arr2D with arr2, arr3, and arr4

        int[][] arr2D; //a ref to a 2d array w/o any size
        //arr2D is null right now
        arr2D = new int[3][2]; //array has 3 rows, 2 columns
        arr2D[0][1] = 9999;    //set last value in first row
        arr2D[2][0] = 17;      //set first value in last row

        String[][] seatingChart = {
                {"Joey","Ved"},
                {"Kaito", "Audi"},
                {"Andrew", "Owen"},
                {"Patrick", "Akshat", "Colin"}
        };
        // 2. Create an int called last and save the last value of the first row
        //    in arr2D in this variable.  Print this value

        // 3.  Print the middle value of arr2D


        // 4.  Change the first value in the last row of arr2D to be equal to 0
        //     and then print its new value



        // BONUS challenge - see if you can figure out the way to use double for loops to
        // traverse a 2D array

        // Write a double loop to print all the values of the array arr2D.
        // Each row of the array should print on a new line


        // Create a 5 x 10 2D array called multiples


        /* Fill the multiples array using a for loop so that the values look like:
            2 4  6  8 10 12 14 16 18 20
            3 6  9 12 15 18 21 24 27 30
            4 8 12 16 20 24 28 32 36 40
            ..
            6 12 ...                 60
        */


        // Print all values in multiples using a for loop
    }
}
