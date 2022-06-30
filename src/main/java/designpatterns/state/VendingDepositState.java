package designpatterns.state;

// stan - wrzuć monetę
public class VendingDepositState extends VendingMachineState {
    @Override
    public void changeVendingMachineState(VendingMachine vendingMachine) {
        vendingMachine.setState(new VendingStockState());
    }

    @Override
    public void performOperation(int amount, VendingMachine vendingMachine) {
        System.out.println("Thrown into machine " + amount);

        if (amount == 5) {
            System.out.println("Payment accepted");
            changeVendingMachineState(vendingMachine);
        } else if (amount > 5) {
            System.out.println("Payment accepted, pay the rest of money " + (amount - 5));
            changeVendingMachineState(vendingMachine);
        } else {
            System.out.println("Not enough money");
        }
    }
}
