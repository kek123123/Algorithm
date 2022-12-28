package main.shnam.programmers;

import java.util.HashMap;
import java.util.Map;

public class Ex_17677 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/17677

    public static void main(String[] args) {

        Ex_17677 ex_17677 = new Ex_17677();

        /*String str1 = "FRANCE";
        String str2 = "french";*/
        /*String str1 = "handshake";
        String str2 = "shake hands";*/
        /*String str1 = "aa1+aa2";
        String str2 = "AAAA12";*/
        /*String str1 = "E=M*C^2";
        String str2 = "e=m*c^2";*/
        String str1 = "  ";
        String str2 = "    ";

        System.out.println(ex_17677.solution(str1, str2));
    }

    public int solution(String str1, String str2) {

        int unionCnt = 0;
        int interCnt = 0;

        Map<String, Integer> strMap1 = transferStr(str1);
        Map<String, Integer> strMap2 = transferStr(str2);

        for (Map.Entry<String, Integer> entry : strMap1.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (strMap2.containsKey(key)) {
                unionCnt += Math.max(value, strMap2.get(key));
                interCnt += Math.min(value, strMap2.get(key));
                strMap2.remove(key);
            } else {
                unionCnt += value;
            }
        }

        for (Map.Entry<String, Integer> entry : strMap2.entrySet()) {
            unionCnt += entry.getValue();
        }

        if (interCnt == 0 && unionCnt == 0) {
            return 65536;
        }

        return (int) ((double) interCnt/ unionCnt * 65536);
    }

    private Map<String, Integer> transferStr(String str) {

        Map<String, Integer> resultMap = new HashMap<>();

        str = str.toLowerCase();

        int strSize = str.length();
        char[] charArray = str.toCharArray();
        int charIdx = 0;

        for (int i = 0; i < strSize - 1; i++) {
            char firstCh = charArray[charIdx];
            char secondCh = charArray[charIdx+1];
            if (firstCh >= 97 && firstCh <= 122 && secondCh >= 97 && secondCh <= 122) {
                String transferStr = charArray[charIdx] + "" + charArray[charIdx+1];
                resultMap.put(transferStr, resultMap.getOrDefault(transferStr, 0) + 1);
            }
            charIdx++;
        }

        return resultMap;
    }
}
