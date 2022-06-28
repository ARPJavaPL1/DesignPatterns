package solid.ocp;

public class Cube extends GeoObject {

    private double length;

    public Cube(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(length, 3);
    }
}
