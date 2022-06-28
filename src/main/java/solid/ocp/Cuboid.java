package solid.ocp;

/// prostopadłościan
public class Cuboid extends GeoObject {
    private double length;
    private double breadth;
    private double height;

    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateVolume() {
        return length * breadth * height;
    }
}
