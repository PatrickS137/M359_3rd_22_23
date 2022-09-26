package Unit2.notes;

public class Shoe {
    private String brand;
    private String style;
    private double size;
    private double price;

    public Shoe(String brand, String style, double size, double price) {
        this.brand = brand;
        this.style = style;
        this.size = size;
        this.price = price;
    }

    public boolean equals(Shoe other){
//        if(this.brand.equals(other.brand)) {
//            if (this.style.equals(other.style)) {
//                return (true);
//            }
//        }
        return(this.brand.equals(other.brand) && this.style.equals(other.style));
    }

    public int compareTo(Shoe other){
        double diff = this.price - other.price;
        if (diff<0){
            return(-1);
        }
        else if (diff ==0){
            return(0);
        }
        else{
            return (1);
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getStyle() {
        return style;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
