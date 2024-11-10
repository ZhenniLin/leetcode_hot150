package org.example;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class Test {
    SolutionHashmap solution = new SolutionHashmap();

    // leetcode 383
    @org.junit.jupiter.api.Test
     void testRansomSuccess() {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean result = solution.ransom(ransomNote, magazine);

        assertTrue(result, "Expected true, but got false");
    }

    // leetcode 205
    @org.junit.jupiter.api.Test
    void testIsOmorphicSuccess() {
        String s = "foo";
        String t = "baa";
        boolean result = solution.isOmorphic(s, t);
        assertTrue(result, "Expected true, but got false");
    }

    @org.junit.jupiter.api.Test
    void testIsOmorphicFailure() {
        String s = "foo";
        String t = "bad";
        boolean result = solution.isOmorphic(s, t);
        assertFalse(result, "Expected false, but got true");
    }

    // leetcode 209
    @org.junit.jupiter.api.Test
    void testWordsPatternSuccess() {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean result = solution.wordPattern(pattern, s);
        assertTrue(result, "Expect true, but got False");
    }

    // leetcode 242
    @org.junit.jupiter.api.Test
    void validAnagramSuccess() {
        String s = "anagram";
        String t = "nagaram";
        boolean result = solution.validAnagram(s, t);
        assertTrue(result, "Expect true, but got False");
    }

    // leetcode 49
    @org.junit.jupiter.api.Test
    void groupAnagramSuccess() {
        String[] s = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = solution.groupAnagrams(s);

        List<List<String>> expected = Arrays.asList(
                Arrays.asList("bat"),
                Arrays.asList("nat", "tan"),
                Arrays.asList("ate", "eat", "tea")

        );

        // List<List<String>> -> Set<Set<String>>
        Set<Set<String>> resultSet = new HashSet<>();
        for (List<String> group : result) {
            resultSet.add(new HashSet<>(group));
        }

        Set<Set<String>> expectedSet = new HashSet<>();
        for (List<String> group : expected) {
            expectedSet.add(new HashSet<>(group));
        }


        assertEquals(expectedSet, resultSet, "The grouped anagrams do not match the expected output.");

    }

    // leetcode 1
    @org.junit.jupiter.api.Test
    void twoSumSuccess() {
        int nums[] = {2,7,11,15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        int[] expected = {0, 1};
        assertArrayEquals(expected, result, "The indices do not match the expected output.");

    }

    @org.junit.jupiter.api.Test
    void happyNumberSuccess(){
        int n = 19;
        boolean result = solution.happyNumber(n);
        assertTrue(result, "Expected true, but got false");

    }


}
