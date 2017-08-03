package bean;

import factory.ISportCar;

public class AudiRS implements ISportCar {
    public String getSpecs() {
        return "Audi RS, vm.2018, godlike";
    }

    public String getMaximumSpeed() {
        return "320km/h";
    }
}
