package main.java.com.stackroute.junit;
/*
program to sort all the words in the string in alphabatical order
 */
import java.util.*;
// method to return the sorted string
public class SortWords {

    public List<String> SortingCharecters(String inputString){
        String input = inputString.toLowerCase();//converting the string into lower case
        List<String> sortedString = Arrays.asList(input.split(" "));
        Collections.sort(sortedString);//using the sort method
        return sortedString;
    }
}