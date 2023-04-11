package templates;

public abstract class Train<T> {
    public String trainName;
    public DLList<T> cars;

    @Override
    public abstract String toString();
    public abstract void NewLocAndCar(String newLoc, String newCar);

    public abstract DLList<T> TrainToCarList();
}
