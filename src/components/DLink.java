package components;

public class DLink extends templates.DLink {
    DLink(DLink prev, Car info, DLink next) {
        this.prev = prev;
        this.info = info;
        this.next = next;
    }
}
