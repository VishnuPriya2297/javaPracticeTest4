package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.TransposeString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString object;

    @Before
    public void setUp() throws Exception {
        object=new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void testForGivenAStringReturnReverse()
    {

        String str=object.reverseWords("I am a very big String, do you have anything to find within me");
        assertEquals("I ma a yrev gib ,gnirtS od uoy evah gnihtyna ot dnif nihtiw em ",str);
    }
    @Test
    public void testForGivennumberReturnReverse()
    {

        String str=object.reverseWords("24");
        assertEquals("42 ",str);
    }
}