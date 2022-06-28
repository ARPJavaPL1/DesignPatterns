package solid.srp;

public class Delivery {
    private final Order order;

    public Delivery(Order order) {
        this.order = order;
    }

    public void deliver() {
        System.out.println("Delivering the order");
    }
}
