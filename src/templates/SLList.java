package templates;

public abstract class SLList
{
    public SLink first;
    public int size;

    public abstract void InsertLast(SLink x);
    public abstract SLink Find(String searchKey);
    public abstract String Display();
    public abstract SLink FindPrev(String searchKey);

    public abstract Train DeleteAfter(SLink prevLink);

    public abstract boolean IsEmpty();

}
