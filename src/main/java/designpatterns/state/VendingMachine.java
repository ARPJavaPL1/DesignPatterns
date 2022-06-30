package designpatterns.state;

public class VendingMachine {

    private VendingMachineState state;
    private int costOfProduct;

    public void buyProduct(int amount) {
        costOfProduct = amount;
        state.performOperation(amount, this);
    }

    public void takeProduct() {
        state.performOperation(costOfProduct, this);
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }
}
