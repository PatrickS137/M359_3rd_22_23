package Unit4.notes;

public class NestedIteration {
    public static void main(String[] args) {
        for (int z =5; z > 0; z--) {
            for (int i = 0; i < z; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
