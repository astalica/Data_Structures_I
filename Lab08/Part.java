package Lab08;

public class Part {

    //Instance Variables
    private String partName;
    private String color;
    private double weight;
    private double price;
    private int amountInStock;
    private int reorderPoint;

    //---------------------------------------------------


    //Constructor
    public Part(String partName, String color,
                double weight, double price, int amountInStock,
                int reorderPoint) {
        this.partName = partName;
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.amountInStock = amountInStock;
        this.reorderPoint = reorderPoint;
    }

    //---------------------------------------------------

    //Accessor Methods

    public String getPartName() {
        return partName;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public int getReorderPoint() {
        return reorderPoint;
    }

    //---------------------------------------------------

    /*
    The class should have a public int compareTo (Part other) method
    that returns -1, 0 or +1 if this part is less-than,
     equal or greater-than the other respectively.
     It uses name as the first basis of comparison.
     If names are the same, then it uses weight
     (lower weight comes before higher weight).
    If the names and weights are the same, then it returns 0.
     */
    public int compareTo(Part other) {

        if (this.partName.compareTo(other.partName) > 0)
            return 1;

        else if (this.partName.compareTo(other.partName) < 0)
            return -1;

        else {
            if (other.weight < this.weight)
                return 1;
            else if (other.weight > this.weight)
                return -1;
            else
                return 0;
        }
    }

    public double getValue() {
       return price * amountInStock;
    }

    @Override
    public String toString() {
        return  "Part Name = " + partName + " | " +
                "Color = " + color  + " | " +
                "Weight = " + weight + " | " +
                "Price = " + price + " | " +
                "Amount In Stock = " + amountInStock + " | " +
                "ReorderPoint = " + reorderPoint + " | " +
                "Total Value = " + getValue() + " | " +
                '}' + "\n";
    }
}
