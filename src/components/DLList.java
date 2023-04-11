package components;

public class DLList extends templates.DLList {
    public DLList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    @Override
    protected void Init(DLink x) {
        this.first = x;
        this.last = x;
        this.size = 1;
    }

    @Override
    protected void Reset() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    @Override
    public boolean IsEmpty() {
        return this.size == 0;
    }

    @Override
    public void InsertFirst(Car x) {
        if (IsEmpty()) {
            DLink link = new DLink(null, x, null);
            Init(link);
            return;
        }

        DLink oldFirst = this.first;

        this.first = new DLink(null, x, oldFirst);
        oldFirst.prev = this.first;

        this.size++;
    }

    @Override
    public void InsertLast(Car x) {
        if (IsEmpty()) {
            DLink link = new DLink(null, x, null);
            Init(link);
            return;
        }

        DLink oldLast = this.last;

        this.last = new DLink(oldLast, x, null);
        oldLast.next = this.last;

        this.size++;
    }

    @Override
    public void Reverse() {
        if (this.first == null)
            return;

        DLink curLink = this.first;
        this.last = curLink;

        // swap
        DLink tmpDLink = (DLink) curLink.prev;
        curLink.prev = curLink.next;
        curLink.next = tmpDLink;

        while (curLink.prev != null) {
            curLink = (DLink) curLink.prev;

            tmpDLink = (DLink) curLink.prev;
            curLink.prev = curLink.next;
            curLink.next = tmpDLink;

        }

        this.first = curLink;

    }

    @Override
    public void ConCatList(templates.DLList list) {

    }

    @Override
    public Car DeleteFirst() {
        if (this.size == 0)
            return null;

        if (this.size == 1) {
            DLink oldFirst = this.first;
            Reset();
            return oldFirst.info;
        }

        DLink oldFirst = this.first;
        DLink afterFirst = (DLink) oldFirst.next;

        afterFirst.prev = null;
        this.first = afterFirst;

        size--;

        return oldFirst.info;
    }

    @Override
    public Car DeleteLast() {
        if (this.size == 0)
            return null;

        if (this.size == 1) {
            DLink oldFirst = this.first;
            Reset();
            return oldFirst.info;
        }

        DLink oldLast = this.last;
        DLink beforeLast = (DLink) oldLast.prev;

        beforeLast.next = null;
        this.last = beforeLast;

        size--;

        return oldLast.info;
    }

    @Override
    public String Display() {
        String out = "";

        DLink curLink = this.first;

        if (curLink == null)
            return "";

        out = out.concat(curLink.info.carName + " ");

        while (curLink.next != null) {
            curLink = (DLink) curLink.next;
            out = out.concat(curLink.info.carName + " ");
        }

        return out;
    }

    @Override
    public String DisplayFromLast() {
        String out = "";

        DLink curLink = this.last;

        if (curLink == null)
            return "";

        out = out.concat(curLink.info.carName + " ");

        while (curLink.prev != null) {
            curLink = (DLink) curLink.prev;
            out = out.concat(curLink.info.carName + " ");
        }

        return out;
    }

}
