package app;

public class Product {
    private String name;
    private Category category;
    private float price;

    public Product(String name, Category category, float price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public float getTaxPercent(){
        return this.category.getTax();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }

    public float getPrice() {
        return price;
    }
}
