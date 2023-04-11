package templates;

import components.DLink;
import components.Car;

public abstract class DLList {
    public DLink first;
    public DLink last;
    public int size;

    protected abstract void Init(DLink x);

    protected abstract void Reset();

    public abstract void InsertFirst(Car x);
    public abstract void InsertLast(Car x);
    public abstract void Reverse();

    public abstract void ConCatList(DLList list);

    public abstract boolean IsEmpty();

    public abstract Car DeleteFirst();
    public abstract Car DeleteLast();
    public abstract String Display();
    public abstract String DisplayFromLast();
}
