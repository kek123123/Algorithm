package main.shnam.programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Ex_17680 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/17680

    public static void main(String[] args) {
        Ex_17680 ex_17680 = new Ex_17680();

        int n = 2;
        String[] arr = {"abc", "abc", "abc", "11", "abc"};

        System.out.println(ex_17680.solution(n, arr));
    }

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int length = cities.length;
        cities = Arrays.stream(cities).map(c -> c.toUpperCase()).toArray(String[]::new);
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            if (queue.contains(cities[i])) {
                answer += 1;
                queue.remove(cities[i]);
            } else {
                answer += 5;
                if (cacheSize > 0 && queue.size() >= cacheSize) {
                    queue.poll();
                }
            }

            if (cacheSize > 0) {
                queue.add(cities[i]);
            }
        }

        return answer;
    }
}
