package app;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Basket {
    private List<Product> products;

    public Basket() {
        this.products = new LinkedList<>();
    }

    public void addProduct(Product product) throws NullPointerException{
        this.products.add(Objects.requireNonNull(product));
    }

    public void clear(){
        this.products.clear();
    }

    public void removeProduct(Product product) throws IllegalArgumentException{
        boolean removedSuccessfully = this.products.remove(product);
        if(!removedSuccessfully){
            throw new IllegalArgumentException(product + " is not in the basket.");
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
