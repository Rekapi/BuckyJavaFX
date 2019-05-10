// this class is adding class for table view class
// this class representing the data on the table
public class Product {
    private String name;
    private double price;
    private int quantity;
    // constructor 1
    public Product(){
        this.name = "";
        this.price = 0;
        this.quantity = 0;
    }
    // constructor 2
    public Product(String name, double price , int quantity){
        this.name = name;
        this.price = price;
        this.quantity =quantity;
    }
    // getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
