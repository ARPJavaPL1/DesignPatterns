package designpatterns.builder.customer;

public class Address {
    private String city;
    private String street;
    private int homeNumber;
    private String zipCode;

    public Address(AddressBuilder builder) {
        this.city = builder.getCity();
        this.street = builder.getStreet();
        this.homeNumber = builder.getHomeNumber();
        this.zipCode = builder.getZipCode();
    }
}
