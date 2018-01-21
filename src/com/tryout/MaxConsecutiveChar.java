package com.tryout;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxConsecutiveChar {
    public static void main(String[] args) {
        maxChar("geeeeek");

    }

    private static void maxChar(String str) {
        Map<Character, Integer> value = new HashMap<>();
        for (int i=0; i<str.length();i++) {
            Character ch = str.charAt(i);
            if (value.containsKey(ch))
                value.put(ch, value.get(ch) + 1);
            else
                value.put(ch, 0);
        }

        Set<Map.Entry<Character, Integer>> entries = value.entrySet();
        Character maxChar= '0';
        Integer maxOccurence = 0;

        for (Map.Entry<Character, Integer> e: entries) {
            if (e.getValue() > maxOccurence) {
                maxChar = e.getKey();
                maxOccurence = e.getValue();
            }
        }

        System.out.println(""+maxChar);
    }
}
