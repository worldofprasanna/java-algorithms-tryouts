package com.tryout;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        nonRepeatingCharacter("aadffe");
    }

    private static void nonRepeatingCharacter(String str) {

       for (int i=0; i<str.length();i++) {
           boolean repeatedChar = false;
           for (int j=0; j<str.length();j++ ) {
               if (i!=j && str.charAt(i) == str.charAt(j)) {
                   repeatedChar = true;
                   break;
               }
           }
           if (!repeatedChar) {
               System.out.println(str.charAt(i));
               break;
           }
       }
    }
}
