public class Product {
    private String category;
    private String name;
    private String whereUsed;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(String category, String name, String whereUsed, double price) {
        this.category = category;
        this.name = name;
        this.whereUsed = whereUsed;
        this.price = price;
    }

    public String getWhereUsed() {
        return whereUsed;
    }

    public void setWhereUsed(String whereUsed) {
        this.whereUsed = whereUsed;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
