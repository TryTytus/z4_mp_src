package tests;

import components.SLList;
import components.Train;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SLListDisplayTests {

    @Test
    public void test1() {
        SLList list = new SLList();

        Assertions.assertEquals("", list.Display());

        Assertions.assertNull(list.FindPrev("T1"));

        list.InsertFirst(new Train("T1"));

        Assertions.assertEquals("T1", list.FindPrev("T1").info.toString());

        Assertions.assertEquals("T1", list.Display());

        list.InsertFirst(new Train("T2"));
        list.InsertFirst(new Train("T3"));
        list.InsertFirst(new Train("T4"));

        Assertions.assertEquals("T2", list.FindPrev("T1").info.toString());
        Assertions.assertEquals("T3", list.FindPrev("T2").info.toString());
        Assertions.assertEquals("T4", list.FindPrev("T3").info.toString());
        Assertions.assertEquals("T4", list.FindPrev("T4").info.toString());



        Assertions.assertEquals("T3", list.FindPrev("T2").info.toString());

        Assertions.assertEquals("T4 T3 T2 T1", list.Display());


    }
}
