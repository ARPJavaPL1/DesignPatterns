package solid.srp;

public class Order {

    private Customer customer;
    private String itemName;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void prepareOrder() {
        System.out.printf("Preparing order for customer " +
                        "- %s who ordered %s"
                , customer.getName(), itemName);
    }

    public Customer getCustomer() {
        return customer;
    }
}
