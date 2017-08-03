package bean;

import factory.IComfortCar;

public class SkodaOctavia implements IComfortCar {
    public String getSpecs() {
        return "Skoda Octavia, vm. 2016, not so good";
    }

    public String getGasolineConsumation() {
        return "avg 6,5 liter/100km";
    }
}
