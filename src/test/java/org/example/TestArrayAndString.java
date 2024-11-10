package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestArrayAndString {
    SolutionArrayAndString solution = new SolutionArrayAndString();

    // leetcode 13
    @Test
    void romanToInteger() {
        String s = "MCMXCIV";
        int expect = 1994;
        int result = solution.romanToInteger(s);
        assertEquals(expect, result, "Do not match");
    }

    // leetcode 58
    @Test
    void lengthOfLastWord() {
        String s = "Hello World";
        int expect = 5;
        int result = solution.lengthOfLastWord(s);
        assertEquals(expect, result, "Do not match");
    }

    // leetcode 14
    @Test
    void longestCommonPrefix() {
        String[] s = {"flower","flow","flight"};
        String expected = "fl";
        String result = solution.longestCommonPrefix(s);
        assertEquals(expected, result, "Do not match");
    }

    // leetcode 151
    @Test
    void reverseWordsInAString() {
        String s = "the sky is blue";
        String expected = "blue is sky the";
        String result = solution.reverseWordsInAString(s);
        assertEquals(expected, result, "Do not match");
    }

    // leetcode 6
    @Test
    void zigzagConversion() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        String result = solution.zigzagConversion(s, numRows);
        assertEquals(expected, result, "Do not match");
    }

    // leetcode 28
    @Test
    void indexOfTheFirst() {
        String haystack = "sadbutsadssz";
        String needle = "ssz";
        int expected = 9;
        int result = solution.indexOfTheFirst(haystack, needle);
        assertEquals(expected, result, "Do not match");
    }


}
