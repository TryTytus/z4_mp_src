package templates;

public abstract class DLList<CAR> {
    public DLink<CAR> first;
    public DLink<CAR> last;
    public int size;

    public abstract void InsertFirst(CAR x);
    public abstract void InsertLast(CAR x);
    public abstract void Reverse();

    public abstract void ConCatList(DLList<CAR> list);

    public abstract boolean IsEmpty();

    public abstract CAR DeleteFirst();
    public abstract CAR DeleteLast();
}
