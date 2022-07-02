package designpatterns.builder.lombok;

import lombok.Builder;

@Builder
public class Address {
    private String city;
    private String street;
    private int homeNumber;
    private String zipCode;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", homeNumber=" + homeNumber +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
