package Controller;

import factory.ICarFactory;
import factory.IComfortCar;
import factory.SkodaFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void createNewSkodaOcatvia() throws Exception {
        ICarFactory icf = new SkodaFactory();
        IComfortCar icc = icf.confortCar();
        assertEquals(icc.getSpecs(), "Skoda Octavia, vm. 2016, not so good");

    }


}