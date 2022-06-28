package solid.srp;

public class BillCalculation {

    private final Order order;

    public BillCalculation(Order order) {
        this.order = order;
    }

    public void calculateBill() {
        // TODO: calculate bill
        System.out.printf("Bill for customer %s ",
                order.getCustomer().getName());
    }
}
