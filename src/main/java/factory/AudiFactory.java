package factory;

import bean.AudiA4;
import bean.AudiRS;

public class AudiFactory implements ICarFactory {

    public IComfortCar confortCar() {
        return new AudiA4();
    }

    public ISportCar sportCar() {
        return new AudiRS();
    }
}
