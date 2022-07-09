package refactoring.extractclass;

public class CodeRefactored {

    private String firstName;
    private String lastName;
    private Address address;
    private Address secondaryAddress;
    private Phone phone;

    private class Address {
        private String country;
        private String city;
        private String zipCode;
        private String houseNumber;
        private String flatNumber;
    }

    private class Phone {
        private String mobilePhone;
        private String phone;
    }
}
