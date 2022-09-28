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

    //return vars
    private boolean equalCar;
    private String newUsed;
    private String finalOutput;
    public Chevy(boolean luxuryPackage, boolean fourPackage, boolean sportPackage) {
        this.year = 2021;
        this.mileage = 0;
        this.fuelEfficiency = 35;
        this.basePrice = 16000;
        this.model = "Trax";
        this.color = "White";
        this.luxuryPackage = luxuryPackage;
        this.fourPackage = fourPackage;
        this.sportPackage = sportPackage;
    }
//------------------------------------------------
    public Chevy(int year, int mileage, double fuelEfficiency, double basePrice, String model, String color, boolean luxuryPackage, boolean fourPackage, boolean sportPackage) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.basePrice = basePrice;
        this.model = model;
        this.color = color;
        this.luxuryPackage = luxuryPackage;
        this.fourPackage = fourPackage;
        this.sportPackage = sportPackage;
    }
//------------------------------------------------
    public int compareTo(Chevy other){
        if (this.mileage > other.mileage){
            return(this.mileage);
        }
        else{
            return(other.mileage);
        }
    }
//------------------------------------------------
    public boolean equals(Chevy other){
        if (this.mileage < 200){
            newUsed = "new";
        }
        else{
            newUsed = "used";
        }

        if(this.model.equals(other.model) && this.color.equals(other.color)
                && this.newUsed.equals(other.newUsed)){
            equalCar = true;
        }
        else{
            equalCar = false;
        }

        return(equalCar);
    }
//------------------------------------------------
    public String toString(Chevy other){
        finalOutput += "***************************************************\n";
        finalOutput += ("\tBASE PRICE:\t\t\t\t\t$" + this.basePrice);
        finalOutput += ("\n\tMILES:\t\t\t\t\t\t$" + this.mileage);
        finalOutput += ("\n\tFUEL EFFICIENCY:\t\t\t$" + this.fuelEfficiency);

        if (luxuryPackage == true) {
            finalOutput += ("\n\t - Luxury Package");
        }
        if (fourPackage == true) {
            finalOutput += ("\n\t - 4WD Package");
        }
        if (sportPackage == true) {
            finalOutput += ("\n\t - Sport Package");
        }
        else{
            finalOutput += ("\n\t - None");
        }

        finalOutput += "\n\n";
        //finalOutput += ("PRICE WITH UPGRADES:\t\t$" + )
        return(finalOutput);
    }
//------------------------------------------------

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getUpgradePrice() {
        return upgradePrice;
    }

    public void setUpgradePrice(double upgradePrice) {
        this.upgradePrice = upgradePrice;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLuxuryPackage() {
        return luxuryPackage;
    }

    public void setLuxuryPackage(boolean luxuryPackage) {
        this.luxuryPackage = luxuryPackage;
    }

    public boolean isFourPackage() {
        return fourPackage;
    }

    public void setFourPackage(boolean fourPackage) {
        this.fourPackage = fourPackage;
    }

    public boolean isSportPackage() {
        return sportPackage;
    }

    public void setSportPackage(boolean sportPackage) {
        this.sportPackage = sportPackage;
    }

    public boolean isEqualCar() {
        return equalCar;
    }

    public void setEqualCar(boolean equalCar) {
        this.equalCar = equalCar;
    }

    public String getNewUsed() {
        return newUsed;
    }

    public void setNewUsed(String newUsed) {
        this.newUsed = newUsed;
    }

    public String getFinalOutput() {
        return finalOutput;
    }

    public void setFinalOutput(String finalOutput) {
        this.finalOutput = finalOutput;
    }
}
