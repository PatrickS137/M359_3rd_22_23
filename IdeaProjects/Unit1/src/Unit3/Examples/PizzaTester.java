package Unit3.Examples;

public class PizzaTester {
    /*this class will test our Pizza code
     * it will contain the main method
     *shortcut:psvm a
     */
    public static void main(String[] args) {


        Pizza dd = new Pizza("Lou Malnatis", 12, 2, true);
        Pizza thin = new Pizza("Dominoes", 16, 3, false);
        Pizza thinCheese = new Pizza("Dominoes", 14, false);

        System.out.println(dd);
        System.out.println(thin);
        System.out.println(thinCheese);
        System.out.println(dd.compareTo(thin));
    }
}
