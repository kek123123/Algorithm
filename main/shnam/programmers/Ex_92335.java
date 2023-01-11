package main.shnam.programmers;

import java.util.*;
import java.util.stream.Collectors;

public class Ex_92335 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/92335

    public static void main(String[] args) {
        Ex_92335 ex_92335 = new Ex_92335();

        int n = 1000000;
        int k = 4;

        System.out.println(ex_92335.solution(n, k));
    }

    public int solution(int n, int k) {
        int answer = 0;

        String str = Integer.toString(n, k);
        char[] chArray = str.toCharArray();
        String tmp = "";

        for (char ch : chArray) {
            if (ch > 48 && ch <= 57) {
                tmp += ch;
            } else {
                if (!tmp.equals("")) {
                    long num = Long.parseLong(tmp);
                    if(isPrime(num)) answer++;
                }
                tmp = "";
            }
        }

        if (!tmp.equals("")) {
            long num = Long.parseLong(tmp);
            if(isPrime(num)) answer++;
        }

        return answer;
    }

    private boolean isPrime(long n) {

        if (n == 1) return false;

        if(n % 2 == 0) return n == 2 ? true : false;

        for(long i = 3; i <= (long)Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
