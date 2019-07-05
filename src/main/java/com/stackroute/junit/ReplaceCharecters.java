package main.java.com.stackroute.junit;
/*
a program to replace the words in the string
replace d with f
replace l with t
 */
public class ReplaceCharecters {
    //method that returns the modified string
public String ReplacingCharecters(String inputString)
{

    String replacedString=inputString.replace("d","f");
    String finalReplacement=replacedString.replace("l","t");//using the replace method.
    return finalReplacement;
}
}
