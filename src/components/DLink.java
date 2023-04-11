package components;

public class DLink<CAR> extends templates.DLink {
    DLink(DLink<CAR> prev, CAR info, DLink<CAR> next) {
        this.prev = prev;
        this.info = info;
        this.next = next;
    }
}
