package com.tryout;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by prasanna on 21/01/18.
 */
public class Anagram {
    public static void main(String[] args) {

        checkAnagram("SILENT", "LISTEN");
    }

    private static void checkAnagram(String first, String second) {
        Map<Character, Integer> firstMap = new HashMap<>();
        for (Character ch: first.toCharArray()) {
            if (firstMap.containsKey(ch))
                firstMap.put(ch, firstMap.get(ch)+1);
            else
                firstMap.put(ch, 1);
        }

        Map<Character, Integer> secondMap = new HashMap<>();
        for (Character ch: second.toCharArray()) {
            if (secondMap.containsKey(ch))
                secondMap.put(ch, secondMap.get(ch)+1);
            else
                secondMap.put(ch, 1);
        }


        boolean isAnagram = true;
        if (firstMap.entrySet().size() != secondMap.entrySet().size())
            System.out.println("Not an Anagram");
        else {

            for (Map.Entry<Character, Integer> entry : firstMap.entrySet()) {
                Character key = entry.getKey();
                Integer value = entry.getValue();
                Integer secondValue = secondMap.get(key);
                if (value != secondValue) {
                    isAnagram = false;
                    break;
                } else
                    isAnagram = true;
            }

            if (isAnagram)
                System.out.println("Anagram");
            else
                System.out.println("Not an Anagram");
        }

    }
}
