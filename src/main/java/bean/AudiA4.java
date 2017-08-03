package bean;

import factory.IComfortCar;

public class AudiA4 implements IComfortCar {
    public String getSpecs() {
        return "Audi A4, vm.1918, kinda old";
    }

    public String getGasolineConsumation() {
        return "avg 7,5 liter/100km";
    }
}
