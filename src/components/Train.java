package components;

import components.DLList;

public class Train extends templates.Train {

    public Train(String newLoc) {
        this.trainName = newLoc;
        this.cars = new DLList();
    }

    @Override
    public String toString() {
        return this.trainName;
    }

    @Override
    public void NewLocAndCar(String newLoc, String newCar) {
        this.trainName = newLoc;

        this.cars.Reset();
        this.cars.InsertFirst(new Car(newCar));
    }

    @Override
    public DLList TrainToCarList() {
        this.cars.InsertFirst(new Car(this.trainName));

        return (DLList) this.cars;
    }
}
