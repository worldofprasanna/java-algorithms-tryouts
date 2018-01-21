package com.tryout;

/**
 * Created by prasanna on 21/01/18.
 */
public class Palindrome {

    public static void main(String[] args) {
        String[] str = {"geekf", "geeks", "or",
                "keeg", "abc", "bc"};
        panlindrome(str);

    }

    private static void panlindrome (String[] str) {
//        Reverse and store it separately
//        Is substring for each string

        String[] revStr = new String[str.length];
        for (int i=0; i<str.length;i++)
            revStr[i] = reverse(str[i]);

        for (int i=0; i<str.length;i++){
            for (int j=0; j<str.length;j++){
                String actualString = str[i];
                if (revStr[j].contains(actualString)) {
                    System.out.println(actualString + " " + str[j]);
                    break;
                }
            }
        }

    }

    private static String reverse(String str) {
        String revString = "";
        for (int i=str.length()-1; i >= 0; i--)
            revString += str.charAt(i);
        return revString;
    }
}
