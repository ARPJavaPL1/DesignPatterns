package designpatterns.builder.lombok;

public class AddressApp {

    public static void main(String[] args) {
        Address address = Address.builder()
                .city("Gdańsk")
                .street("Prosta")
                .homeNumber(11)
                .zipCode("80-000")
                .build();

        System.out.println(address);
    }
}
