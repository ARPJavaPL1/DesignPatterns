package designpatterns.builder.customer;

public class AddressBuilder {
    private String city;
    private String street;
    private int homeNumber;
    private String zipCode;

    public AddressBuilder city(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder street(String street) {
        this.street = street;
        return this;
    }

    public AddressBuilder homeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
        return this;
    }

    public AddressBuilder zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public Address build() {
        return new Address(this);
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public String getZipCode() {
        return zipCode;
    }
}
