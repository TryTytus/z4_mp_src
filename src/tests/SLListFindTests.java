package tests;

import components.SLList;
import components.Train;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SLListFindTests {
    @Test
    public void test1() {
        SLList list = new SLList();

        Assertions.assertNull(
                list.Find("T1")
        );

        Assertions.assertNull(
                list.FindPrev("T1")
        );

        list.InsertFirst(new Train("T1"));

        Assertions.assertEquals(
                "T1",
                list.Find("T1").info.toString()
        );

        Assertions.assertEquals(
                "T1",
                list.FindPrev("T1").info.toString()
        );


        list.InsertFirst(new Train("T2"));

        Assertions.assertEquals(
                "T1",
                list.Find("T1").info.toString()
        );

        Assertions.assertEquals(
                "T2",
                list.FindPrev("T1").info.toString()
        );


        list.InsertFirst(new Train("T3"));
        list.InsertFirst(new Train("T4"));
        list.InsertFirst(new Train("T5"));
        list.InsertFirst(new Train("T6"));
        list.InsertFirst(new Train("T7"));


        Assertions.assertNull(
                list.Find("T8")
        );

        Assertions.assertNull(
                list.FindPrev("T8")
        );

        Assertions.assertEquals("T7",
                list.Find("T7").info.toString()
                );

        Assertions.assertEquals("T7",
                list.FindPrev("T7").info.toString()
        );

        Assertions.assertEquals("T6",
                list.Find("T6").info.toString()
        );

        Assertions.assertEquals("T7",
                list.FindPrev("T6").info.toString()
        );


        Assertions.assertEquals("T1",
                list.Find("T1").info.toString()
        );

        Assertions.assertEquals("T2",
                list.FindPrev("T1").info.toString()
        );

        Assertions.assertEquals("T4",
                list.Find("T4").info.toString()
        );

        Assertions.assertEquals("T5",
                list.FindPrev("T4").info.toString()
        );


    }
}
