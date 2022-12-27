package main.shnam.programmers;

public class Ex_12924 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/12924

    public static void main(String[] args) {
        int a = 0;

        Ex_12924 ex_12924 = new Ex_12924();

        System.out.println(ex_12924.solution(15));
    }

    public int solution(int n) {
        int left = 1;
        int right = 1;
        int sum = 0;
        int answer = 0;

        while(true) {

            if(sum >= n) {
                sum -= left++;
            } else if(right == n + 1) {
                break;
            } else if(sum < n) {
                sum += right++;
            }

            if(sum == n) {
                answer++;
            }
        }

        return answer;
    }
}
