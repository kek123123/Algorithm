package main.shnam.programmers;

import java.util.Stack;

public class Ex_12973 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12973

    public static void main(String[] args) {
        Ex_12973 ex_12973 = new Ex_12973();
        System.out.println(ex_12973.solution("cdcd"));
    }

    public int solution(String s) {
        int strSize = s.length();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < strSize; i++) {
            String str = s.substring(i, i+1);

            if (!stack.isEmpty() && str.equals(stack.peek())) {
                stack.pop();
            } else {
                stack.push(str);
            }
        }

        return stack.size() > 0 ? 0 : 1;
    }
}
