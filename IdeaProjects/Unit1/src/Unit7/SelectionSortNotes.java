package Unit7;

import java.util.ArrayList;

public class SelectionSortNotes {
    public static void main(String[] args) {
        ArrayList<Integer> myNums = new ArrayList<>();
        for (int i = 0; i<15;i++){
            myNums.add((int) (Math.random()*20));
        }

        for (int i = 0; i< myNums.size()-1;i++){
            //start assuming i is location of smallest value
            int currentMin = i; //this is current position I am sorting
            for (int j = i +1;j< myNums.size()-1;j++){
                //checking remaining values to see if they are smaller than the value located at index min
                if ( myNums.get(j)< myNums.get(currentMin)){
                    currentMin = j;
                    //swap

                }

            }
            int temp = myNums.get(currentMin);
            myNums.set(currentMin, myNums.get(i));
            myNums.set(i,temp);
            //I know that min has the index of the smallest value
            //swap the values from index i and index min
        }
        System.out.println(myNums);
    }

}
