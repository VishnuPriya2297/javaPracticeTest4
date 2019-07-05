package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.CharecterOccurance;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharecterOccuranceTest {
CharecterOccurance object;
    @org.junit.Before
    public void setUp() throws Exception {
        object=new CharecterOccurance();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void testForGivenStringReturnNumberOfOccurances()
    {
        int n=object.charectercount("I am a very big String, do you have anything to find within me","5th");
       assertEquals(4,n);

    }
    @Test
    public void testForGivenNoOccuringCharecterReturnNull()
    {
        int n=object.charectercount("I am a very big String, do you have anything to find within me"," z ");
        assertEquals(0,n);

    }
    @Test
    public void testForGivenCapitalInStringReturnNumberOfOccurances()
    {
        int n=object.charectercount("I am a very big String, do you have anything to find within me","A");
        assertEquals(0,n);

    }
}