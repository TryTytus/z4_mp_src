package components;

import templates.SLink;
import templates.Train;

public class SLList extends templates.SLList {
    @Override
    public void InsertFirst(Train x) {
        if (this.size == 0) {
            this.first = new components.SLink(x, null);
            size++;
        }

        this.first = new components.SLink(
                x, (components.SLink) this.first
        );
        size++;
    }

    @Override
    public SLink Find(String searchKey) {
        return null;
    }

    @Override
    public String Display() {
        return null;
    }

    @Override
    public SLink FindPrev(String searchKey) {
        return null;
    }

    @Override
    public Train DeleteAfter(SLink prevLink) {
        return null;
    }

    @Override
    public boolean IsEmpty() {
        return this.size == 0;
    }
}
