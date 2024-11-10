package org.example;

import java.util.Stack;

public class SolutionStack {

    // leetcode 20
    public boolean validParentheses(String s) {
        char[] newS = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char ch : newS) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (ch == ')') {
                        char temp = stack.pop();
                        if (temp != '(') {
                            return false;
                        }
                    }
                    if (ch == ']') {
                        char temp = stack.pop();
                        if (temp != '[') {
                            return false;
                        }
                    }
                    if (ch == '}') {
                        char temp = stack.pop();
                        if (temp != '}') {
                            return false;
                        }
                    }
                }
            }
        }

        return stack.isEmpty();

    }

    // leetcode 71
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] newPath = path.split("/");

        for (String s : newPath) {
            if (s.equals(".") || s.isEmpty()) {
                continue;
            } else if (s.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(s);
            }
        }

        return "/" + String.join("/", stack);
    }

    // leetcode 155
    public static class MinStack {

        public Node head;
        public void push (int x) {
            if (head == null) {
                head = new Node(x, x, null);
            } else {
                head = new Node(x, Math.min(head.val, x), head);
            }
        }
        public void pop() {
            head = head.next;
        }
        public int top() {
            return head.val;
        }
        public int getMin() {
            return head.min;
        }
        private class Node {
            int val;
            int min;
            Node next;

            private Node (int val, int min, Node next) {
                this.val = val;
                this.min = min;
                this.next = next;
            }
        }

    }

    // leetcode 150
    public int polishNotation(String[] tokens) {
       Stack<Integer> stack = new Stack<>();
       for (String str : tokens) {
           if (str.equals("+")) {
               stack.push(stack.pop() + stack.pop());
           } else if (str.equals("-")) {
               int second = stack.pop();
               int first = stack.pop();
               stack.push(first - second);
           } else if (str.equals("/")) {
               int second = stack.pop();
               int first = stack.pop();
               stack.push(first / second);
           } else if (str.equals("*")) {
               stack.push(stack.pop() * stack.pop());
           } else {
               stack.push(Integer.parseInt(str));
           }
       }

       return stack.peek();
    }

}


