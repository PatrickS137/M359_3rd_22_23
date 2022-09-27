package Unit2.notes;

public class Chevy {
    private int year;
    private int mileage;
    private double fuelEfficiency;
    private double basePrice;
    private double upgradePrice;
    private double grandTotal;
    private String model;
    private String color;
    private boolean luxuryPackage;
    private boolean fourPackage;
    private boolean sportPackage;

    final String MAKE = "Chevrolet";
    final double TAXRATE = 1.122;
    final double LUXURYPRICE = 1.20;
    final double FOURPRICE = 3500;
    final double SPORTSPRICE = 1.15;
    final double SPORTSEFFICIENCY = 0.80;

    public Chevy(double upgradePrice, double grandTotal,boolean luxuryPackage, boolean fourPackage, boolean sportPackage) {
        this.year = 2021;
        this.mileage = 0;
        this.fuelEfficiency = 35;
        this.basePrice = 16000;
        this.upgradePrice = upgradePrice;
        this.grandTotal = grandTotal;
        this.model = "Trax";
        this.color = "White";
        this.luxuryPackage = luxuryPackage;
        this.fourPackage = fourPackage;
        this.sportPackage = sportPackage;
    }

    public Chevy(int year, int mileage, double fuelEfficiency, double basePrice, double upgradePrice, double grandTotal, String model, String color, boolean luxuryPackage, boolean fourPackage, boolean sportPackage) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.basePrice = basePrice;
        this.upgradePrice = upgradePrice;
        this.grandTotal = grandTotal;
        this.model = model;
        this.color = color;
        this.luxuryPackage = luxuryPackage;
        this.fourPackage = fourPackage;
        this.sportPackage = sportPackage;
    }
}
