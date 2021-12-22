package app;

public class PricingService {
    private DbService dbService;

    public PricingService(DbService dbService) {
        this.dbService = dbService;
    }

    public float getTotalMoneyEarned(){
        float sum = 0;
        for (Product boughtProduct : dbService.getBoughtProducts()) {
            float productPrice = boughtProduct.getPrice();
            float taxPrice = productPrice * boughtProduct.getTaxPercent();
            sum += (Math.round(productPrice + taxPrice));
        }
        return sum;
    }

    public float getFinalPrice(Basket basket){
        float sum = 0;
        for (Product product : basket.getProducts()) {
            float productPrice = product.getPrice();
            float taxPrice = productPrice * product.getTaxPercent();
            sum += (Math.round(productPrice + taxPrice));
        }
        return sum;
    }
}
