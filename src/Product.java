public class Product {
    private static long id = 0L;
    private String name;
    private Category category;
    private Double price;

    Product(String name, Category category, Double price){
        setName(name);
        setCategory(category);
        setPrice(price);
        id = id++;
    }

    @Override
    public String toString(){
        return getName() +  ", " + getCategory() + ", " + getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
