package main.java.com.stackroute.junit;
/*
a program to count the number of occurances of a string in a given input string
 */
public class CharecterOccurance {
    //method that returns the number of occurances of the string
    public int  charectercount(String inputString ,String stringToFind )
    {
        int numberOfOccurances;
        String[] temp;
        temp = inputString.split(stringToFind);

        return (temp.length-1);
    }
}
