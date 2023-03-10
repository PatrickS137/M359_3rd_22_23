package Unit7.TicketMaster.U8.U9.Notes9_5;

public class Cow extends Animal
{
    private String cowType;                     // Dairy or Beef
    
    public Cow(String name, String cowType)
    {
        super(name);
        this.cowType = cowType;
    }

    public void milkCow(){
        if (cowType.equals("Dairy"))
            System.out.println("MILK");
        else
            System.out.println("wiertd milk");
    }

    /**
     * Makes a sound for a cow
     * 
    */
    public void speak()
    {
        System.out.println("The "+ cowType + " Cow " + getName() + " says MOOOOO.");
    }

}
