package main;

public class ExString {

    public static void main(String[] args) {
        new ExString().solution();
    }

    public int solution() {

        //대소문자
        String upperCase = "abc".toUpperCase();
        String lowerCase = "ABC".toLowerCase();

        char charUpperCase = Character.toUpperCase('a');
        char charUpperCase2 = 'a' - 32;
        char charLowerCase = Character.toLowerCase('A');
        char charLowerCase2 = 'A' + 32;

        System.out.println("charUpperCase2 = " + charUpperCase2);
        System.out.println("charLowerCase2 = " + charLowerCase2);

        boolean isLowerCase = Character.isLowerCase('a'); //아스키 97~122
        boolean isUpperCase = Character.isUpperCase('A'); //아스키 65~90

        // 문자열 뒤집기
        String reverseString = new StringBuilder("abcde").reverse().toString();

        System.out.println("reverseString = " + reverseString);

        String reverseString2 = "abcde";

        char[] chArray = reverseString2.toCharArray();
        int lt = 0, rt = chArray.length -1;

        while (rt > lt) {
            char tmp = chArray[lt];
            chArray[lt] = chArray[rt];
            chArray[rt] = tmp;
            lt++;
            rt--;
        }
        reverseString2 = String.valueOf(chArray);

        System.out.println("reverseString2 = " + reverseString2);

        // 문자 알파벳 확인
        boolean isAlpabet = Character.isAlphabetic('c');

        // 문자열 안의 숫자 제거
        String onlyString = "abc212c$$@2";
        onlyString = onlyString.replaceAll("[^a-z]", "").toString();

        // 문자열 안의 문자 제거(아스키 48~57)
        boolean isNumber = Character.isDigit('c');

        String mixedString = "abc212c$$@2";
        StringBuilder onlyNumber = new StringBuilder();

        for (char ch : mixedString.toCharArray()) {
            if (ch >= 48 && ch <= 57) {
                onlyNumber.append(ch);
            }
        }

        System.out.println("onlyNumber = " + onlyNumber);


        return 0;
    }
}
