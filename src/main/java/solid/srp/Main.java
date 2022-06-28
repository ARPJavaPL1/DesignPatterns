package solid.srp;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setName("John");
        // customer1.setAddress("St. Mary Street 12");
        // etc

        Order order1 = new Order();
        order1.setCustomer(customer1);
        order1.setItemName("Pizza Hawaii");

        order1.prepareOrder();

        BillCalculation billCalculation =
              new BillCalculation(order1);
        billCalculation.calculateBill();

        Delivery delivery = new Delivery(order1);
        delivery.deliver();
    }
}
