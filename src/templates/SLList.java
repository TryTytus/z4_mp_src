package templates;

public abstract class SLList<TRAIN>
{
    public SLink<TRAIN> first;
    public int size;

    public abstract void InsertLast(SLink<TRAIN> x);
    public abstract SLink<TRAIN> Find(String searchKey);
    public abstract String Display();
    public abstract SLink<TRAIN> FindPrev(String searchKey);

    public abstract TRAIN DeleteAfter(SLink<TRAIN> prevLink);

    public abstract boolean IsEmpty();

}
