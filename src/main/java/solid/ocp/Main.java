package solid.ocp;

import java.security.SecurityPermission;

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid1 = new Cuboid(5, 10, 15);
        Cuboid cuboid2 = new Cuboid(2, 4, 8);
        Cuboid cuboid3 = new Cuboid(1, 3, 9);

        // Cuboid[] cuboids = new Cuboid[] { cuboid1, cuboid2, cuboid3};

        Sphere sphere1 = new Sphere(12);
        Sphere sphere2 = new Sphere(5);
        Sphere sphere3 = new Sphere(1);

        // Sphere[] spheres = new Sphere[] { sphere1, sphere2, sphere3 };

        GeoObject[] geoObjects = new GeoObject[] {
                cuboid1,
                cuboid2,
                cuboid3,
                sphere1,
                sphere2,
                sphere3,
                new Cube(4)
        };

        Application application = new Application();
        double totalVolume = application.getTotalVolume(geoObjects);

        System.out.printf("The total volume is %.2f", totalVolume);
    }
}
