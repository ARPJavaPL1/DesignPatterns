package designpatterns.decorator.car;

public class CarDealerApplication {
    public static void main(String[] args) {
        Car audiA3 = new AudiA3();
        System.out.printf("Audi A3 price: %20.2f\n", audiA3.price());
        System.out.printf("Audi A3 description: %s\n", audiA3.description());

        audiA3 = new AirConditionAutomatic(audiA3);
        System.out.printf("Audi A3 price: %20.2f\n", audiA3.price());
        System.out.printf("Audi A3 description: %s\n", audiA3.description());

        Car car = new ColorBlue(
                new AirConditionAutomatic(
                        new AudiA3()));
        System.out.printf("Audi A3 price: %20.2f\n", car.price());
        System.out.printf("Audi A3 description: %s\n", car.description());

    }
}
