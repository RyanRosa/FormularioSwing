package entities;

public class Product {
    private String numberCode;
    private String description;
    private String price;
    private String quantity;

    public Product(String numberCode, String description, String price, String quantity){
        this.numberCode = numberCode;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
    public String getAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("Number Code: " + this.numberCode);
        sb.append("\nDescription: " + this.description);
        sb.append("\nPrice: " + this.price);
        sb.append("\nQuantity: " + this.quantity);
        return sb.toString();
    }
}
