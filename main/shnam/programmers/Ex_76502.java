package main.shnam.programmers;

import java.util.Stack;

public class Ex_76502 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/76502

    public static void main(String[] args) {
        Ex_76502 ex_76502 = new Ex_76502();

        //String str = "[](){}";
        String str = "}]()[{";

        System.out.println(ex_76502.solution(str));
    }

    int answer = 0;

    public int solution(String s) {
        int strLength = s.length();

        for (int i = 0; i < strLength; i++) {
            isCorrectStr(s.substring(i, strLength) + s.substring(0, i));
        }

        return answer;
    }

    private void isCorrectStr(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chArray = str.toCharArray();
        boolean isCorrect = true;

        for (char ch : chArray) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    isCorrect = false;
                    break;
                } else if (stack.peek() == '[' && ch == ']') {
                    stack.pop();
                } else if (stack.peek() == '{' && ch == '}') {
                    stack.pop();
                } else if (stack.peek() == '(' && ch == ')') {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty() && isCorrect) {
            answer++;
        }
    }
}
