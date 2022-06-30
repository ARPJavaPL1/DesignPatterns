package designpatterns.state;

public class VendingMachineProgram {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setState(new VendingDepositState());

        vendingMachine.takeProduct();

        vendingMachine.buyProduct(5);
        vendingMachine.takeProduct();

        vendingMachine.buyProduct(10);
        vendingMachine.takeProduct();

        vendingMachine.buyProduct(2);
        vendingMachine.takeProduct();

        vendingMachine.buyProduct(8);
        vendingMachine.takeProduct();
    }
}
