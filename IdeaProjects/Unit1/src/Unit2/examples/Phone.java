package Unit2.examples;

public class Phone {
    private String brand;
    private int storage;
    private boolean service;

    public Phone(String aBrand, int aStorage){
        brand = aBrand;
        storage = aStorage;
    }

    public Phone(String aBrand, int aStorage, boolean aService){
        brand = aBrand;
        storage = aStorage;
        service = aService;
    }

    public void turnOffService(){
        service = false;
    }

    public void turnOnService(){
        service = true;
    }

    public void printPhoneDetails(){
        System.out.print(brand + "\n" + storage + "\n" + service);
    }
    //getter method that allows us to return the value of the
    //private instance vars to the users\
    //return type is equal to the data type of variable
    public String getBrand() {
        return brand;
    }

    public int getStorage(){
        return storage;
    }

    public boolean getServiceStatus(){
        return service;
    }

    //setter methods allow us to change  the value of the
    //private instance vars by the user
    //return type is always void
    //one parameter equal to the data type of the variable
    public void setBrand(String aBrand){
        brand = aBrand;
    }

    public void setStorage(int aStorage){
        storage = aStorage;
    }

    public void setHasService(boolean aHasService){
        service = aHasService;
    }

}
