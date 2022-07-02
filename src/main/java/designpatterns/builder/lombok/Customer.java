package designpatterns.builder.lombok;

import lombok.Builder;

import java.util.Date;

@Builder
public class Customer {
    private String firstName;
    private String lastName;
    private Address address;
    private Date birthDate;
    private String phoneNumber;
}
