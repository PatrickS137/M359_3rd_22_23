package Unit2.examples;

public class PhoneDriver {
    //shortcut for public static void main(String[] args) is psvm then enter
    public static void main(String[] args){
        Phone p1 = new Phone("Samsung", 64, true);
        Phone p2 = new Phone("Apple", 8);

        //shortcut for System.out.println() sout then enter

        p1.printPhoneDetails();
        p2.printPhoneDetails();

        p1.turnOnService();
        p1.printPhoneDetails();
        p2.setBrand("Google");
    }
}

