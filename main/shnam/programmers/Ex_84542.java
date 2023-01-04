package main.shnam.programmers;

import java.util.HashMap;
import java.util.Map;

public class Ex_84542 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/84542

    public static void main(String[] args) {
        Ex_84542 ex_84542 = new Ex_84542();

        String word = "EIO";

        System.out.println(ex_84542.solution(word));
    }

    String[] strArray = {"A", "E", "I", "O", "U"};
    int cnt;
    int answer;

    public int solution(String word) {

        dfs("", word);

        return answer;
    }

    public void dfs(String str, String word) {

        if (word.equals(str)) {
            answer = cnt;
            return;
        } else if (str.length() >= 5) {
            return;
        }

        for (int i = 0; i < 5; i++) {
            cnt++;
            String nr = str + strArray[i];
            dfs(nr, word);
        }
    }
}
