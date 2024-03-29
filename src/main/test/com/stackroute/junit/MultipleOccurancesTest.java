package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.MultipleOccurances;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MultipleOccurancesTest {
    MultipleOccurances object;

    @Before
    public void setUp() throws Exception {
        object=new MultipleOccurances();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void returnTheIndex() {
        String actual = object.matching("She sells seashells by the seashore", "se");
        assertEquals("Found at: 4 - 6\n" +
                "Found at: 10 - 12\n" +
                "Found at: 27 - 29", actual);
    }

    @Test
    public void returnNotNull() {
        String actual = object.matching("She sells seashells by the seashore", "se");
        assertNotNull(actual);
    }
    @Test
    public void testForGivenStringReturnIndexes() {
        String actual = object.matching("She sell22s seashells b22y the seash22ore", "22");
        assertEquals("Found at: 8 - 10\n" +
                "Found at: 23 - 25\n" +
                "Found at: 36 - 38", actual);
    }


}