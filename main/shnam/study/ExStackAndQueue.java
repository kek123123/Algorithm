package main.shnam.study;

import java.util.Stack;

public class ExStackAndQueue {

    public static void main(String[] args) {
        new ExStackAndQueue().solution();
    }

    public void solution() {
        올바른_괄호();
        카카오_크레인();
    }

    private void 올바른_괄호() {
        Stack<Character> stack = new Stack<>();
        char[] chArray = {'(', '(', ')', ')'};

        for (char ch : chArray) {
            if (ch == '(') stack.push(ch);
            else {
                if (stack.isEmpty()) System.out.println("X");
                else stack.pop();
            }
        }

        if (stack.isEmpty()) System.out.println("X");
        else System.out.println("O");
    }

    public void 카카오_크레인() {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int tmp = board[j][moves[i] - 1];
                if (tmp != 0) {
                    if (!stack.isEmpty() && stack.peek() == tmp) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(tmp);
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        System.out.println("stack = " + stack);

        System.out.println("answer = " + answer);
    }

    public void 후위식_연산() {

    }
}
