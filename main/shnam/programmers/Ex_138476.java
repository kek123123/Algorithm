package main.shnam.programmers;

import java.util.*;
import java.util.stream.Collectors;

public class Ex_138476 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/138476

    public static void main(String[] args) {
        Ex_138476 ex_138476 = new Ex_138476();

        int n = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        //3

        System.out.println(ex_138476.solution(n, tangerine));
    }

    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int length = tangerine.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            int size = tangerine[i];
            int cnt = map.getOrDefault(size, 0) + 1;
            map.put(size, cnt);
        }

        Comparator<Map.Entry<Integer, Integer>> order = Map.Entry.comparingByValue();

        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).collect(Collectors.toList());
        //map = map.entrySet().stream().sorted(order.reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        for (Map.Entry<Integer, Integer> tmp : map.entrySet()) {
            if (k <= 0) {
                break;
            }
            k -= tmp.getValue();
            answer++;
        }

        return answer;
    }
}
