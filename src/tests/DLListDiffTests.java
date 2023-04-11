package tests;

import components.Car;
import components.DLList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DLListDiffTests {

    @Test
    public void DiffFirst() {
        DLList list = new DLList();

        list.InsertFirst(new Car("1"));
        Assertions.assertEquals(
                "1",
                list.DeleteFirst().carName
        );

        Assertions.assertEquals(
                "",
                list.Display()
        );

        Assertions.assertEquals(
                "",
                list.DisplayFromLast()
        );

        Assertions.assertNull(list.DeleteFirst());

        list.DeleteFirst();

        Assertions.assertEquals("", list.Display());
        Assertions.assertEquals("", list.DisplayFromLast());


        // many

        list.InsertFirst(new Car("1"));
        list.InsertFirst(new Car("2"));

        list.DeleteFirst();

        list.InsertFirst(new Car("3"));
        list.InsertFirst(new Car("4"));
        list.InsertFirst(new Car("5"));

        list.DeleteFirst();
        list.DeleteFirst();

        list.InsertFirst(new Car("6"));
        list.InsertFirst(new Car("7"));


        Assertions.assertEquals("7 6 3 1 ", list.Display());
        Assertions.assertEquals("1 3 6 7 ", list.DisplayFromLast());
    }
    @Test
    public void DiffLast() {
        DLList list = new DLList();

        list.InsertLast(new Car("1"));
        Assertions.assertEquals(
                "1",
                list.DeleteLast().carName
        );

        Assertions.assertEquals(
                "",
                list.Display()
        );

        Assertions.assertEquals(
                "",
                list.DisplayFromLast()
        );

        Assertions.assertNull(list.DeleteLast());

        list.DeleteLast();

        Assertions.assertEquals("", list.Display());
        Assertions.assertEquals("", list.DisplayFromLast());

        // many

        list.InsertLast(new Car("1"));
        list.InsertLast(new Car("2"));

        list.DeleteLast();

        list.InsertLast(new Car("3"));
        list.InsertLast(new Car("4"));
        list.InsertLast(new Car("5"));

        list.DeleteLast();
        list.DeleteLast();

        list.InsertLast(new Car("6"));
        list.InsertLast(new Car("7"));


        Assertions.assertEquals("1 3 6 7 ", list.Display());
        Assertions.assertEquals("7 6 3 1 ", list.DisplayFromLast());
    }

    @Test
    public void DiffMany() {
        DLList list = new DLList();

        list.InsertLast(new Car("1"));
        Assertions.assertEquals(
                "1",
                list.DeleteFirst().carName
        );

        Assertions.assertEquals(
                "",
                list.Display()
        );

        Assertions.assertEquals(
                "",
                list.DisplayFromLast()
        );

        Assertions.assertNull(list.DeleteLast());

        list.DeleteFirst();

        Assertions.assertEquals("", list.Display());
        Assertions.assertEquals("", list.DisplayFromLast());

        // many

        list.InsertLast(new Car("1"));
        list.InsertFirst(new Car("2"));

        list.DeleteLast();

        list.InsertLast(new Car("3"));
        list.InsertFirst(new Car("4"));
        list.InsertFirst(new Car("5"));

        list.DeleteFirst();
        list.DeleteLast();

        list.InsertFirst(new Car("6"));
        list.InsertLast(new Car("7"));


        Assertions.assertEquals("6 4 2 7 ", list.Display());
        Assertions.assertEquals("7 2 4 6 ", list.DisplayFromLast());
    }
}
