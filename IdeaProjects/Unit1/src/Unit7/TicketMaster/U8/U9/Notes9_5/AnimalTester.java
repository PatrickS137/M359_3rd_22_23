package Unit7.TicketMaster.U8.U9.Notes9_5;

/**
* Lesson 9-5: Polymorphism
 * The purpose of this tester class is to see what happens when an array
 * of Animal references is assigned objects of type Animal, Pig, and Cow
 * 
 * @author   Mrs. Denna 
 */
public class AnimalTester
{
   public static void main(String[] args)
   {
       Animal[] barn = new Animal[6];
       // 1. What data type does this array hold?


       barn[0] = new Animal("Murphy");
       barn[1] = new Cow("Daisy", "Dairy");
       barn[2] = new Pig("Wilbur", false);
       barn[3] = new Cow("Billy", "Beef");
       barn[4] = new Animal("Maggie");
       barn[5] = new Pig("Max", true);

       Cow dairyCow = new Cow("Milk Cow", "Dairy");
       Cow beefCow = new Cow("Beef Cow", "Beef");
       Animal someCow = new Cow("Random Cow","Dairy");

       dairyCow.milkCow();
       beefCow.milkCow();
            //someCow.milkCow();
       //This will not work because all animals do not have a milkCow method
       //since we KNOW that someCow is really a Cow, we can cast it as a cow
       //then java will let us call methods that are only defined for cow objects
       ((Cow)someCow).milkCow();

       //we must put the class we are casting it to in parenthesis(cow
       //we must fully wrap the ref var that is being casted in parenthesis
       //before the dot so that Java will think of it as a Cow and allow us to call
       //the milkCow method

       //Cow newCow = someCow;
       /*
       this will not work.  Even thoug someCow is a Cow, Java can only see that it
       is an Animal.  In order to save in a specific ref var, we need to cast the
       generic ref var
        */
       Cow newCow = (Cow)someCow;

       if (someCow instanceof Cow)
           ((Cow)someCow).milkCow();

       // 2. Did I ONLY store Animal objects in this array?  If not, why do you
       //    think this was allowed?
       //no, they are other object types
       //this was allowed because cow and pig are subclasses of animal
   
       for (Animal a: barn) {
           a.speak();
           if (someCow instanceof Cow)
               ((Cow) a).milkCow();
       }
            // 3. What method is getting called here?  The speak method of the Animal class?
            //the speak method of each subclass, or the speak method of animal class if the type is animal

            /*when speak is called, java will look in the code for the type of object it is and if that class has overridden the method,
            the way java know what kind of object was created is by looking at the constructor call.

            it is the constructor call that tells us what kind of object it is, not the reference variable
             */


       // 4. Try to summarize in 2-3 sentences WHAT you observed in this code.
   }
   
}
