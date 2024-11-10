package org.example;

import java.util.*;

public class SolutionArrayAndString {

    // leetcode 13
    public int romanToInteger(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }

        return result;
    }

    // leetcode 58
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                if (length > 0) {
                    break;
                }
            }
        }
        return length;
    }

    // leetcode 14
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String string1 = strs[0];
        String string2 = strs[strs.length - 1];
        int idx = 0;

        while (string1.length() > 0 && string2.length() > 0) {
            if(string1.charAt(idx) == string2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }

        return string1.substring(0,idx);
    }

    // leetcode 151
    public String reverseWordsInAString(String s) {
        String[] newS = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = newS.length - 1; i >= 0; i--) {
            result.append(newS[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    // leetcode 6
    public String zigzagConversion(String s , Integer numRows) {
        List<Character>[] rows = new ArrayList[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }

        int idx = 0;
        int d = 1;

        for (char ch : s.toCharArray()) {
            rows[idx].add(ch);
            if (idx == 0) {
                d = 1;
            } else if (idx == numRows - 1) {
                d = -1;
            }
            idx += d;
        }

        StringBuilder result = new StringBuilder();
        for (List<Character> row : rows) {
            for (char ch : row) {
                result.append(ch);
            }
        }

        return result.toString();

    }

    // leetcode 28
    public int indexOfTheFirst(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
               return i;
            }
        }
        return -1;
    }

}
