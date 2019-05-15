public class SecProduct extends Product {
    private Product firstProduct;
    private String category;
    private String name;
    //private double popularity;
    private String whereUsed;
    private double price;
    private String whatGenderPriority;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getWhereUsed() {
        return whereUsed;
    }

    @Override
    public void setWhereUsed(String whereUsed) {
        this.whereUsed = whereUsed;
    }

    public SecProduct() {
    }

    public SecProduct(Product firstProduct, String category, String name, String whereUsed, double price, String whatGenderPriority) {
        this.firstProduct = firstProduct;
        this.category = category;
        this.name = name;
        this.whereUsed = whereUsed;
        this.price = price;
        this.whatGenderPriority = whatGenderPriority;
    }


    public Product getFirstProduct() {
        return firstProduct;
    }

    public void setFirstProduct(Product firstProduct) {
        this.firstProduct = firstProduct;
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

//    public double getPopularity() {
//        return popularity;
//    }
//
//    public void setPopularity(double popularity) {
//        this.popularity = popularity;
//    }
}
