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
    final double LUXURYPRICE = 0.20;
    final double FOURPRICE = 3500;
    final double SPORTSPRICE = 0.15;
    final double SPORTSEFFICIENCY = 0.80;

    //return vars
    private boolean equalCar;
    private String newUsed;
    private String newUsed2;

    private String finalOutput;

    public Chevy() {
        this.year = 2021;
        this.mileage = 0;
        this.fuelEfficiency = 35;
        this.basePrice = 16000;
        this.model = "Chevrolet Trax";
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
    public void calcPrice() {
        if (this.luxuryPackage == true) {
            upgradePrice += this.basePrice * LUXURYPRICE;
        }
        if (this.fourPackage == true) {
            upgradePrice += FOURPRICE;
        }
        if (this.sportPackage == true) {
            upgradePrice += this.basePrice * SPORTSPRICE;
            this.fuelEfficiency = this.fuelEfficiency * SPORTSEFFICIENCY;

        }
        upgradePrice += basePrice;
        grandTotal = TAXRATE * (upgradePrice);

    }

    //------------------------------------------------
    public String toString() {
        this.calcPrice();
        finalOutput += "\n***************************************************\n";
        finalOutput += (year + " " + model + " " + "(" + color + ")\n");
        finalOutput += ("\tBASE PRICE:\t\t\t\t\t$" + basePrice);
        finalOutput += ("\n\tMILES:\t\t\t\t\t\t" + this.mileage);
        finalOutput += ("\n\tFUEL EFFICIENCY:\t\t\t" + this.fuelEfficiency + "mpg");

        int test = 0;
        if (luxuryPackage == true) {
            finalOutput += ("\n\t - Luxury Package");
            test += 1;
        }
        if (fourPackage == true) {
            finalOutput += ("\n\t - 4WD Package");
            test += 1;

        }
        if (sportPackage == true) {
            finalOutput += ("\n\t - Sport Package");
            test += 1;

        } if (test == 0) {
            finalOutput += ("\n\t   None");
        }
        upgradePrice += basePrice;
        finalOutput += ("\n\n\tPRICE WITH UPGRADES:\t\t$" + this.upgradePrice);
        finalOutput += ("\n\tFINAL PRICE WITH TAX:\t\t$" + this.grandTotal);


        finalOutput += "\n";
        //finalOutput += ("PRICE WITH UPGRADES:\t\t$" + )
        finalOutput += "***************************************************\n";

        return (finalOutput);
    }
    //------------------------------------------------
    public int compareTo(Chevy other) {
        int tester = this.mileage - other.mileage;
        return(tester);


    }

    //------------------------------------------------
    public boolean equals(Chevy other) {
        if (this.mileage < 200) {
            newUsed = "new";
        } else {
            newUsed = "used";
        }

        if (other.mileage < 200) {
            newUsed2 = "new";
        } else {
            newUsed2 = "used";
        }
        String model1 = this.model;
        String model2 = other.model;

        if (this.model.contains(" ")) {
            model1 = this.model.substring(0, this.model.indexOf(" "));
        }
        if (this.model.contains(" ")) {
            model2 = other.model.substring(0, other.model.indexOf(" "));
        }

        if (model1.equals(model2) && this.color.equals(other.color)
                && newUsed.equals(newUsed2)) {
            equalCar = true;
        } else {
            equalCar = false;
        }

        return (equalCar);
    }


    //------------------------------------------------

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return mileage;
    }

    public void setMiles(int mileage) {
        this.mileage = mileage;
    }

    public double getMpg() {
        return fuelEfficiency;
    }

    public void setMpg(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getMAKE() {
        return MAKE;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean getLuxuryPkg() {
        return luxuryPackage;
    }

    public void setLuxuryPkg(boolean luxuryPackage) {
        this.luxuryPackage = luxuryPackage;
    }

    public boolean get4WDPkg() {
        return fourPackage;
    }

    public void set4WDPkg(boolean fourPackage) {
        this.fourPackage = fourPackage;
    }

    public void setHasSportPkg(boolean sportPackage) {
        this.sportPackage = sportPackage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPriceWithUpgrades() {
        this.calcPrice();
        return upgradePrice;
    }
    public void setPriceWithUpgrades(double upgradePrice) {
        this.upgradePrice = upgradePrice;
    }

    public double getGrandTotal() {
        this.calcPrice();
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }




    public boolean isSportPackage() {
        return sportPackage;
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