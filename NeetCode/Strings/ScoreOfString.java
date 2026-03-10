package Strings;
//Sum of the absolute difference between the ASCII values of adjacent characters.

public class ScoreOfString {
    public int scoreOfaString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++)
        {
            sum+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return sum;
    }
}