package solid.srp;

public class Driver {

    private final Delivery delivery;

    public Driver(Delivery delivery) {
        this.delivery = delivery;
    }

    public void deliver() {
        delivery.deliver();
    }
}
