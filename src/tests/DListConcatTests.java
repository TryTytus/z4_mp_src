package tests;

import components.Car;
import components.DLList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DListConcatTests {

    @Test
    public void test1() {
        DLList list1 = new DLList();
        DLList list2 = new DLList();

        list1.ConCatList(list2);
        //list2.ConCatList(list1);

        Assertions.assertEquals("", list1.Display());
        Assertions.assertEquals("", list2.Display());
        Assertions.assertEquals(0, list1.size);

        list1.InsertFirst(new Car("1"));

        list1.ConCatList(list2);
        //list2.ConCatList(list1);
        list2 = new DLList();
        list2.InsertFirst(new Car("1"));

        Assertions.assertEquals("1 ", list1.Display());
        Assertions.assertEquals("1 ", list2.Display());
        Assertions.assertEquals(1, list1.size);

        list1.InsertLast(new Car("2"));
        list1.InsertLast(new Car("3"));
        list1.InsertLast(new Car("4"));
        list1.InsertLast(new Car("5"));
        list1.InsertLast(new Car("6"));

        list1.ConCatList(list2);
        //list2.ConCatList(list1);

        Assertions.assertEquals("1 2 3 4 5 6 1 ", list1.Display());
        Assertions.assertEquals(7, list1.size);
        //Assertions.assertEquals("1 1 2 3 4 5 6 ", list2.Display());

        list2 = new DLList();

        list2.InsertLast(new Car("2"));
        list2.InsertLast(new Car("3"));
        list2.InsertLast(new Car("4"));
        list2.InsertLast(new Car("5"));
        list2.InsertLast(new Car("6"));

        list1.ConCatList(list2);

        Assertions.assertEquals("1 2 3 4 5 6 1 2 3 4 5 6 ", list1.Display());
        Assertions.assertEquals(12, list1.size);

    }
}
