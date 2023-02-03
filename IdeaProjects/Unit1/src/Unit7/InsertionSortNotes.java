package Unit7;

import java.util.ArrayList;

public class InsertionSortNotes {
    public static void main(String[] args) {
        ArrayList<Integer> myNums = new ArrayList<>();
        for (int i = 0; i<15;i++){
            myNums.add((int) (Math.random()*20));
        }
        //insertion sort
        for (int i = 1; i<myNums.size();i++){
            Integer valueToInsert = myNums.get(i);
            int position = i;
            while (position >0 && myNums.get(position - 1) > valueToInsert){
                //shift value at position -1 over to position
                myNums.set(position, myNums.get(position -1 ));
                //decrease position so I can continue checking values
                position--;
            }

            //at this point i have either checked all values and I belong at
            //position 0(so first check of while loop failed) OR I am larger than
            //next element, so I found where I belong, at position

            //now, you se the value at index position with the value we saved in
            //valueToInsert
            myNums.set(position, valueToInsert);
        }
        System.out.println(myNums);
    }
}
