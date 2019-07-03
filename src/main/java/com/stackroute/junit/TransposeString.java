package main.java.com.stackroute.junit;
/*
a program to reverse all the words in the string
 */
public class TransposeString {
    public String reverseWords(String inputString)
    {
        String[] tempString = inputString.split(" ");
        String reverseString = "";
        for (int i = 0; i < tempString.length; i++)//reverse each word in the string
        {
            String word = tempString[i];
            String tempReverse="";
            for(int j=word.length()-1;j>=0;j--)
            {
                tempReverse=tempReverse+word.charAt(j);
            }
            if(i==tempString.length)//appending all the reverse words
            reverseString=reverseString+tempReverse;
            else
                reverseString=reverseString+tempReverse+" ";
        }
        return reverseString;
    }
}
