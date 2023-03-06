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

       // 2. Did I ONLY store Animal objects in this array?  If not, why do you
       //    think this was allowed?
       //no, they are other object types
       //this was allowed because cow and pig are subclasses of animal
   
       for (Animal a: barn)
            a.speak();
            // 3. What method is getting called here?  The speak method of the Animal class?
            //the speak method of each subclass, or the speak method of animal class if the type is animal

            /*when speak is called, java will look in the code for the type of object it is and if that class has overridden the method,
            the way java know what kind of object was created is by looking at the constructor call.

            it is the constructor call that tells us what kind of object it is, not the reference variable
             */


       // 4. Try to summarize in 2-3 sentences WHAT you observed in this code.
   }
   
}
