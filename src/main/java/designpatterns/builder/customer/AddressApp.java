package designpatterns.builder.customer;

public class AddressApp {
    public static void main(String[] args) {

        Address address = new AddressBuilder()
                .city("Gdańsk")
                .street("Prosta")
                .homeNumber(11)
                .zipCode("80-000")
                .build();
    }
}
