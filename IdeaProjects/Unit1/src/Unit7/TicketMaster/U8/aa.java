package Unit7.TicketMaster.U8;

public class aa {


    public static void main(String[] args) {

        int[][] nums;
        nums = new int[3][6];
        for(int row = 0; row<nums.length;row++){
            for(int col = row;col<row +6;col++){
                nums[row][col-1] = col;
            }
        }



        for(int[] row:nums){
            for (int col:row){
                System.out.print(" "+col);
            }
            System.out.println("");
        }
    }
}
