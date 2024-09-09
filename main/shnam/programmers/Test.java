package main.shnam.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Test.solution("TOBEORNOTTOBEORTOBEORNOT");
    }

    public static int[] solution(String msg) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap();
        int index = 0;
        int cnt = 26;

        for (int i = 0; i < 26; i++) {
            char ch = (char)('A' + i);
            String str = String.valueOf(ch);
            map.put(str, i+1);
        }

        while (index + 1 < msg.length()) {
            String str = String.valueOf(msg.charAt(index));
            for (int i = index + 1; i <= msg.length(); i++) {
                String str2 = msg.substring(index, i);
                if (!map.containsKey(str2)) {
                    map.put(str2, ++cnt);
                    break;
                }
                str = str2;
            }

            result.add(map.get(str));
            index = index + str.length();
        }

        if (index != msg.length()) {
            result.add(map.get(msg.substring(index, msg.length())));
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
