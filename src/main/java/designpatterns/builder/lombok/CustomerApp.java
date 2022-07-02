package designpatterns.builder.lombok;

import java.util.Date;

public class CustomerApp {
    public static void main(String[] args) {

        Customer customer = Customer.builder()
                .address(Address.builder()
                        .city("Gdańsk")
                        .street("Prosta")
                        .zipCode("80-000")
                        .homeNumber(11)
                        .build())
                .firstName("Jan")
                .lastName("Nowak")
                .phoneNumber("123456789")
                .birthDate(new Date())
                .build();
    }
}
