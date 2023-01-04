package main.shnam.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex_13227 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/13227

    public static void main(String[] args) {
        Ex_13227 ex_13227 = new Ex_13227();

        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        System.out.println(ex_13227.solution(want, number, discount));
    }

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();
        int wantLength = want.length;

        for (int i = 0; i < wantLength; i++) {
            map.put(want[i], number[i]);
        }

        int day = discount.length;

        for (int i = 0; i <= day - 10; i++) {
            Map<String, Integer> tmp = new HashMap<>(map);
            boolean isFit = true;
            for (int j = i; j < i + 10; j++) {

                String food = discount[j];

                if (tmp.get(food) == null) {
                    isFit = false;
                    break;
                } else if (tmp.get(food) > 0) {
                    tmp.put(food, tmp.get(food) - 1);
                } else {
                    isFit = false;
                    break;
                }
            }
            if (isFit) answer++;
        }

        return answer;
    }
}
