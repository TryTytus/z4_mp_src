package tests;

import components.SLList;
import components.Train;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SLListDeleteTestes {
    @Test
    public void test1() {
        SLList list = new SLList();

        Assertions.assertNull(
                list.DeleteAfter(null)
        );

        list.InsertFirst(new Train("T1"));

        Assertions.assertNull(
                list.DeleteAfter(list.Find("T1"))
        );



        list.InsertFirst(new Train("T2"));
        list.InsertFirst(new Train("T3"));

        //list

    }
}
