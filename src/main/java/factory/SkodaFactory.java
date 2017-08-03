package factory;

import bean.SkodaOctavia;
import bean.SkodaRS;

public class SkodaFactory implements ICarFactory {

    public IComfortCar confortCar() {
        return new SkodaOctavia();
    }

    public ISportCar sportCar() {
        return new SkodaRS();
    }
}
