package solid.ocp;

public class Application {

    public double getTotalVolume(GeoObject[] geoObjects) {
        double totalVolume = 0;

        for (GeoObject geoObject : geoObjects) {
            totalVolume += geoObject.calculateVolume();
        }

        return totalVolume;
    }
}
