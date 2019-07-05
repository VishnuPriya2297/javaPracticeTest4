package main.test.com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import main.java.com.stackroute.junit.SortWords;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortWordsTest {
    SortWords object;

    @Before
    public void setUp() throws Exception {
        object=new SortWords();
    }

    @After
    public void tearDown() throws Exception {
    object=null;
    }
    @Test
    public void GivenAStringReturnSortedString()
    {
        List<String> S=object.SortingCharecters("I am Vishnu Priya");
        List<String> Expected= Arrays.asList("am", "i", "priya", "vishnu");
        assertEquals(Expected,S);
    }
    @Test
    public void TestForGivenANumericListReturnSortedString()
    {
        List<String> S=object.SortingCharecters("23 0 69 49 17");
        List<String> Expected= Arrays.asList("0", "17", "23", "49","69");
        assertEquals(Expected,S);
    }
    @Test
    public void TestForGivenANullStringtNullString()
    {
        List<String> S=object.SortingCharecters("");
        List<String> Expected= Arrays.asList("");
        assertEquals(Expected,S);
    }
    @Test
    public void TestForGivenANegativeNumericListReturnSortedString()
    {
        List<String> S=object.SortingCharecters("23 0 69 -49 1 -7");
        List<String> Expected= Arrays.asList("-49", "-7", "0", "1","23","69");
        assertEquals(Expected,S);
    }
    @Test
    public void TestForGivenASpecialChharectersListReturnSortedString()
    {
        List<String> S=object.SortingCharecters("# + = - *");
        List<String> Expected= Arrays.asList("#", "*", "+", "-","=");
        assertEquals(Expected,S);
    }
}