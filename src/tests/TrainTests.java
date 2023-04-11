package tests;

import components.Car;
import components.Train;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrainTests {
    @Test
    public void test1() {
        Train train = new Train("T1");

        Assertions.assertEquals("T1", train.toString());
        Assertions.assertEquals("", train.cars.Display());

        train.cars.InsertLast(new Car("W2"));
        train.cars.InsertLast(new Car("W3"));
        train.cars.InsertLast(new Car("W4"));
        train.cars.InsertFirst(new Car("W1"));

        Assertions.assertEquals("T1 W1 W2 W3 W4 ", train.TrainToCarList().Display());


        train.NewLocAndCar("T2", "W1");

        Assertions.assertEquals("T2", train.toString());
        Assertions.assertEquals("W1 ", train.cars.Display());

    }
}
