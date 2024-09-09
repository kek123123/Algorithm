package main.shnam.leetcode;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution2 {

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        String[] strs = {"flower","flow","flight"};
        solution2.longestCommonPrefix(strs);
    }

    public String longestCommonPrefix(String[] strs) {
        String result = "";
        String firstStr = strs[0];

        for (int i = 1; i <= firstStr.length(); i++) {
            String str = firstStr.substring(0, i);
            boolean isCorrect = true;
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(str)) {
                    isCorrect = false;
                    break;
                }
            }

            if (isCorrect) {
                result = str;
            }
        }

        return result;
    }
}
