package refactoring.replacetempwithquery;

public class CodeRefactored {
    private int quantity;
    private double itemPrice;

    public double calculateTotal() {
        if (basePrice() > 1000) {
            return basePrice() * 0.95f;
        } else {
            return basePrice() * 0.95f;
        }
    }

    private double basePrice() {
        return quantity * itemPrice;
    }
}
