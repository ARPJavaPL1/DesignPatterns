package designpatterns.state;

public abstract class VendingMachineState {

    public abstract void changeVendingMachineState(
            VendingMachine vendingMachine);

    public abstract void performOperation(
            int amount, VendingMachine vendingMachine);
}
