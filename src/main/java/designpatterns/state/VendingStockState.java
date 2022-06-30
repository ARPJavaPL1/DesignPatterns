package designpatterns.state;

// stan - odbierz produkt
public class VendingStockState extends VendingMachineState {
    @Override
    public void changeVendingMachineState(VendingMachine vendingMachine) {
        vendingMachine.setState(new VendingDepositState());
    }

    @Override
    public void performOperation(int amount, VendingMachine vendingMachine) {
        System.out.println("Money delivered, amount " +
                amount + " give product");
        changeVendingMachineState(vendingMachine);
    }
}
