public class SecProduct extends Product {
    private Product firstProduct;
    private String category;
    private String name;
    private double popularity;
    private String whereUsed;
    private double price;
    private String whatGenderPriority;
    private int preferedAgePiorityFirstMin;
    private int PreferedAgePiorityFirstMax;

    public int getPreferedAgePiorityFirstMin() {
        return preferedAgePiorityFirstMin;
    }

    public void setPreferedAgePiorityFirstMin(int preferedAgePiorityFirstMin) {
        this.preferedAgePiorityFirstMin = preferedAgePiorityFirstMin;
    }

    public int getPreferedAgePiorityFirstMax() {
        return PreferedAgePiorityFirstMax;
    }

    public void setGetPreferedAgePiorityFirstMax(int tPreferedAgePiorityFirstMax) {
        this.PreferedAgePiorityFirstMax = PreferedAgePiorityFirstMax;
    }

    public String getWhatGenderPriority() {
        return whatGenderPriority;
    }

    public void setWhatGenderPriority(String whatGenderPriority) {
        this.whatGenderPriority = whatGenderPriority;
    }


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

    public SecProduct(Product firstProduct, String category, String name, int popularity, String whereUsed,
                      double price, String whatGenderPriority, int preferedAgePiorityFirstMin,
                      int preferedAgePiorityFirstMax) {
        this.firstProduct = firstProduct;
        this.category = category;
        this.name = name;
        this.popularity = popularity;
        this.whereUsed = whereUsed;
        this.price = price;
        this.whatGenderPriority = whatGenderPriority;
        this.preferedAgePiorityFirstMin = preferedAgePiorityFirstMin;
        this.PreferedAgePiorityFirstMax = preferedAgePiorityFirstMax;
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

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }
}
