package bean;

import factory.ISportCar;

public class SkodaRS implements ISportCar {
    public String getSpecs() {
        return "Skoda RS, vm.2017, supergood";
    }

    public String getMaximumSpeed() {
        return "300km/h";
    }
}
