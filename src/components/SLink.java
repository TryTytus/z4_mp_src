package components;

import templates.Train;

public class SLink extends templates.SLink {
    SLink(Train info, SLink next) {
        this.info = info;
        this.next = next;
    }
}
