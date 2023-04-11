package templates;

public abstract class Train {
    public String trainName;
    public DLList cars;

    @Override
    public abstract String toString();
    public abstract void NewLocAndCar(String newLoc, String newCar);

    public abstract DLList TrainToCarList();
}
