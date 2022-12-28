package main.shnam.programmers;

public class Ex_12985 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12985

    public static void main(String[] args) {
        Ex_12985 ex_12985 = new Ex_12985();

        int n = 8;
        int a = 4;
        int b = 7;

        System.out.println(ex_12985.solution(n, a, b));
    }

    public int solution(int n, int a, int b) {
        int answer = 0;

        while (true) {

            a = a/2 + a%2;
            b = b/2 + b%2;

            answer++;

            if (a == b) {
                return answer;
            }
        }
    }
}
