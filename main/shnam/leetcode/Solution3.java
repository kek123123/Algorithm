package main.shnam.leetcode;

import java.util.Stack;

public class Solution3 {

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        String s = "(]";
        solution3.isValid(s);
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (ch.equals('(') || ch.equals('[') || ch.equals('{')) {
                stack.push(ch);
            } else if (ch.equals(')')) {
                if (stack.peek().equals('(')) {
                    stack.pop();
                }
            } else if (ch.equals(']')) {
                if (stack.peek().equals('[')) {
                    stack.pop();
                }
            } else if (ch.equals('}')) {
                if (stack.peek().equals('{')) {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
