package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.ReplaceCharecters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharectersTest {
    ReplaceCharecters object;

    @Before
    public void setUp() throws Exception {
        object=new ReplaceCharecters();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void testForGivenStringReplaceWithFandT()
    {
        String s=object.ReplacingCharecters("daily dry");
        assertEquals("faity fry",s);
    }
    @Test
    public void testForGivenStringWithOneReplacementsReturnReplacedString()
    {
        String s=object.ReplacingCharecters("dry");
        assertEquals("fry",s);
    }
    @Test
    public void testForGivenStringWithNoReplacementsReturnOriginalString()
    {
        String s=object.ReplacingCharecters("fry");
        assertEquals("fry",s);
    }
}