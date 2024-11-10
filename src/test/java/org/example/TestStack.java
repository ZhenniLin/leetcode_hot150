package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStack {
    SolutionStack solution = new SolutionStack();
    SolutionStack.MinStack minStack = new SolutionStack.MinStack();

    // leetcode 20
    @Test
    void validParentheses() {
        String s = "([])";
        boolean expected = true;
        boolean result = solution.validParentheses(s);
        assertEquals(expected, result, "Do not match");
    }

    // leetcode 71
    @Test
    void simplifyPath() {
        String path = "/home/user/Documents/../Pictures";
        String expected = "/home/user/Pictures";
        String result = solution.simplifyPath(path);
        assertEquals(expected, result, "Do not match");
    }

    // leetcode 155
    @Test
    void minStack() {
        minStack.push(2);
        minStack.push(1);
        minStack.pop();
        int topValue = minStack.top();
        int expected1 = 2;
        int getMin = minStack.getMin();
        int expected2 = 2;
        assertEquals(expected1, topValue, "Do not match");
        assertEquals(expected2, getMin, "Do not match");

    }

    // leetcode 150
    @Test
    void polishNotation(){
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int expected = 22;
        int result = solution.polishNotation(tokens);
        assertEquals(expected, result);
    }


}
