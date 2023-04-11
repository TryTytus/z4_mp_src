package components;

public class SLink<TRAIN> extends templates.SLink {
    SLink(TRAIN info, SLink<TRAIN> next) {
        this.info = info;
        this.next = next;
    }
}
