package tests;

import components.Car;
import components.DLList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DLListInsertTests {

    @Test
    public void InsertFirstTest() {
        DLList list1 = new DLList();

        Assertions.assertEquals("", list1.Display());

        // in 1
        list1.InsertFirst(new Car("1"));
        Assertions.assertEquals("1 ", list1.Display());
        Assertions.assertEquals("1 ", list1.DisplayFromLast());

        // in 2
        list1.InsertFirst(new Car("2"));
        Assertions.assertEquals("2 1 ", list1.Display());
        Assertions.assertEquals("1 2 ", list1.DisplayFromLast());

        // in many

        list1.InsertFirst(new Car("3"));
        list1.InsertFirst(new Car("4"));
        list1.InsertFirst(new Car("5"));

        Assertions.assertEquals("5 4 3 2 1 ", list1.Display());
        Assertions.assertEquals("1 2 3 4 5 ", list1.DisplayFromLast());

    }

    @Test
    public void InsertLastTest() {
        DLList list1 = new DLList();

        Assertions.assertEquals("", list1.Display());

        // in 1
        list1.InsertLast(new Car("1"));
        Assertions.assertEquals("1 ", list1.Display());
        Assertions.assertEquals("1 ", list1.DisplayFromLast());

        // in 2
        list1.InsertLast(new Car("2"));
        Assertions.assertEquals("1 2 ", list1.Display());
        Assertions.assertEquals("2 1 ", list1.DisplayFromLast());

        // in many

        list1.InsertLast(new Car("3"));
        list1.InsertLast(new Car("4"));
        list1.InsertLast(new Car("5"));

        Assertions.assertEquals("1 2 3 4 5 ", list1.Display());
        Assertions.assertEquals("5 4 3 2 1 ", list1.DisplayFromLast());

    }

    @Test
    public void InsertDiffTest() {
        DLList list1 = new DLList();

        Assertions.assertEquals("", list1.Display());

        // in 1
        list1.InsertLast(new Car("1"));
        Assertions.assertEquals("1 ", list1.Display());
        Assertions.assertEquals("1 ", list1.DisplayFromLast());

        // in 2
        list1.InsertFirst(new Car("2"));
        Assertions.assertEquals("2 1 ", list1.Display());
        Assertions.assertEquals("1 2 ", list1.DisplayFromLast());

        // in many

        list1.InsertLast(new Car("3"));
        list1.InsertLast(new Car("4"));
        list1.InsertFirst(new Car("5"));
        list1.InsertLast(new Car("6"));
        list1.InsertFirst(new Car("7"));
        list1.InsertFirst(new Car("8"));
        list1.InsertFirst(new Car("9"));

        Assertions.assertEquals("9 8 7 5 2 1 3 4 6 ", list1.Display());
        Assertions.assertEquals("6 4 3 1 2 5 7 8 9 ", list1.DisplayFromLast());

    }
}
