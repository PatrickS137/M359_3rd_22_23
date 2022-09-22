package Unit2.homework;

public class Fruit {
    private String name;
    private boolean isRipe;
    private int numServings;

    public Fruit(String fruitName, boolean ripeNess){
        name = fruitName;
        isRipe = ripeNess;
        numServings = 1;

    }

    public Fruit(String fruitName, boolean ripeNess, int servAmount){
        name = fruitName;
        isRipe = ripeNess;
        numServings = servAmount;

    }
}






