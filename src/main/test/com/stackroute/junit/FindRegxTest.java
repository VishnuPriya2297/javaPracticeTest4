package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.FindRegx;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindRegxTest {
    FindRegx object;

    @Before
    public void setUp() throws Exception {
        object=new FindRegx();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void TestForGivenStringReturnTrue()
    {
        boolean t=object.PatternMatching("hello there you","there");
        assertEquals(true,t);
    }
    @Test
    public void TestForGivenStringReturnFalse()
    {
        boolean t=object.PatternMatching("hello there you","hi");
        assertEquals(false,t);
    }


}