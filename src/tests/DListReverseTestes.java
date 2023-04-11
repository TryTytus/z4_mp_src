package tests;

import components.Car;
import components.DLList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DListReverseTestes {
    @Test
    public void Reverse1() {
        DLList list = new DLList();

        list.Reverse();

        Assertions.assertNull(list.first);
        Assertions.assertNull(list.last);

        list.InsertLast(new Car("1"));

        Assertions.assertEquals("1 ", list.Display());

        list.InsertLast(new Car("2"));
        list.Reverse();

        Assertions.assertEquals("2 1 ", list.Display());
        Assertions.assertEquals("1 2 ", list.DisplayFromLast());

        list.InsertLast(new Car("3"));
        list.InsertLast(new Car("4"));

        list.Reverse();

        Assertions.assertEquals("4 3 1 2 ", list.Display());
        Assertions.assertEquals("2 1 3 4 ", list.DisplayFromLast());

        list.InsertLast(new Car("5"));

        list.Reverse();

        Assertions.assertEquals("5 2 1 3 4 ", list.Display());
        Assertions.assertEquals("4 3 1 2 5 ", list.DisplayFromLast());

        list.InsertLast(new Car("6"));
        list.InsertLast(new Car("7"));

        list.Reverse();

        Assertions.assertEquals("7 6 4 3 1 2 5 ", list.Display());
        Assertions.assertEquals("5 2 1 3 4 6 7 ", list.DisplayFromLast());

        list.InsertLast(new Car("8"));
        list.InsertLast(new Car("9"));

        list.Reverse();

        Assertions.assertEquals("9 8 5 2 1 3 4 6 7 ", list.Display());
        Assertions.assertEquals("7 6 4 3 1 2 5 8 9 ", list.DisplayFromLast());

    }
}
