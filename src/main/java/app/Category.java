package app;

public enum Category {
    FOOD(0.18f),
    HOME(0.18f),
    ELECTRONICS(0.09f);

    private final float tax;

    public float getTax() {
        return tax;
    }

    Category(float tax) {
        this.tax = tax;
    }
}
