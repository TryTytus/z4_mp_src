package components;


public class SLList extends templates.SLList {
    @Override
    public void InsertFirst(Train x) {
        if (this.size == 0) {
            this.first = new SLink(x, null);
            size++;
            return;
        }

        this.first = new SLink(
                x, this.first
        );
        size++;
    }

    @Override
    public SLink Find(String searchKey) {
        if (this.first == null)
            return null;

        if (this.first.info.toString().equals(searchKey))
            return this.first;

        SLink find = FindPrev(searchKey);

        if (find == null)
            return null;

        if (find.next == null)
            return find;

        return (SLink) find.next;
    }

    @Override
    public String Display() {
        StringBuilder out = new StringBuilder();

        SLink curLink = this.first;

        if (curLink == null)
            return "";

        out.append(curLink.info).append(" ");

        while (curLink.next != null)
        {
            curLink = (SLink) curLink.next;
            out.append(curLink.info).append(" ");
        }

        out.setLength(out.length() - 1);

        return out.toString();
    }

    @Override
    public SLink FindPrev(String searchKey) {
        if (this.size == 0)
            return null;

        // if first
        if (this.first.info.toString().equals(searchKey)) {
            return this.first;
        }

        SLink curLink = this.first;

        while (curLink.next != null)
        {
            if (curLink.next.info.toString().equals(searchKey))
                return curLink;
            curLink = (SLink) curLink.next;
        }

        return null;
    }

    @Override
    public Train DeleteAfter(SLink prevLink) {
        if (prevLink == null || prevLink.next == null)
            return null;

        Train delTrain = (Train) prevLink.next.info;
        prevLink.next = prevLink.next.next;

        return delTrain;
    }

    @Override
    public boolean IsEmpty() {
        return this.size == 0;
    }
}
