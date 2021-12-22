package app;

import java.util.Arrays;
import java.util.List;

public class DbService {
    private String dbName;
    private String dbUsername;
    private String dbPassword;
    private int port;

    public DbService(String dbName, String dbUsername, String dbPassword, int port) {
        this.dbName = dbName;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
        this.port = port;
    }

    public List<Product> getBoughtProducts(){
        return Arrays.asList(new Product("hat", Category.HOME, 35f),
                new Product("PC", Category.ELECTRONICS, 390f),
                new Product("mouse", Category.ELECTRONICS, 40f),
                new Product("wardrobe", Category.HOME, 70f),
                new Product("chicken", Category.FOOD, 10f));
    }

    @Override
    public String toString() {
        return "DbService{" +
                "dbName='" + dbName + '\'' +
                ", dbUsername='" + dbUsername + '\'' +
                ", dbPassword='" + dbPassword + '\'' +
                ", port=" + port +
                '}';
    }
}
