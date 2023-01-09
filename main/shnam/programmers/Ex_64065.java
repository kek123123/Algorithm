package main.shnam.programmers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex_64065 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/64065

    public static void main(String[] args) {
        Ex_64065 ex_64065 = new Ex_64065();

        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";

        System.out.println(Arrays.toString(ex_64065.solution(s)));
    }

    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[100001];
        int idx = 0;

        s = s.substring(1, s.length()-1);

        String[] strArray = s.split("},");
        strArray = Arrays.stream(strArray).sorted(Comparator.comparing(String::length)).toArray(String[]::new);

        for (String str : strArray) {
            String[] arr = str.substring(1).split(",");

            for (String s2 : arr) {
                int num = Integer.valueOf(s2.replace("}", ""));
                if (!visited[num]) {
                    list.add(idx++, num);
                    visited[num] = true;
                }
            }

        }

        int size = list.size();
        int[] answer = new int[size];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
