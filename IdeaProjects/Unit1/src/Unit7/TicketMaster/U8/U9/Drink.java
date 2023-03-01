package Unit7.TicketMaster.U8.U9;

public class Drink extends MenuItem{
    private int numOz;
    private boolean isFrozen;

    public Drink(String name, int numOz) {
        super(name);
        this.numOz = numOz;
        this.isFrozen = false;
        System.out.println(getName() + " holds " + numOz + " ounces");
    }

    public Drink(String name, int numOz, boolean isFrozen) {
        super(name);
        this.numOz = numOz;
        this.isFrozen = isFrozen;
        if (isFrozen) {
            System.out.println(getName() + " holds " + numOz + " ounces");
        }
        else {
            System.out.println(getName() + " holds " + numOz + " ounces");
        }
    }

}
