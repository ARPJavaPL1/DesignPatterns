package refactoring.replacetempwithquery;

// Replace Temp With Query
public class Code {

    private int quantity;
    private double itemPrice;

    public double calculateTotal() {
        double basePrice = quantity * itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95f;
        } else {
            return basePrice * 0.95f;
        }
    }
}
