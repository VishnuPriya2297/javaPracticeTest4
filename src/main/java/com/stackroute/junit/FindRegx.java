package main.java.com.stackroute.junit;
/*
a program to check whether a pattern is present in ths string or not
 */

public class FindRegx {
    //method that returns true if the pttern is present else returns false
    public boolean  PatternMatching(String inputString ,String wordToFind)
    {

        boolean check = false;
        if(inputString.length()<=0)
            return check;
        if(inputString.matches("(.*)"+wordToFind+"(.*)")) {//using the matches to method fo find the pattern
            check = true;

        }
        return check;
    }
}
