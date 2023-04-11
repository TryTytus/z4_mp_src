package templates;

public abstract class TrainList<TRAIN> {
    SLink<TRAIN> trainList;

    public abstract void New(String T1, String W);
    public abstract void InsertFirst(String T1, String W);
    public abstract void InsertLast(String T1, String W);
    public abstract void DisplayTrain(String T1);
    public abstract void DisplayTrainList();
    public abstract void Reverse(String T1);
    public abstract void Union(String T1, String T2);
    public abstract void DelFirst(String T1, String T2);
    public abstract void DelLast(String T1, String T2);

}
