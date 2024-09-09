package main.shnam.leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution5 {

    public static void main(String[] args) {
        String str = "apple  banana orange";

        str.replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]", " ");

        Solution5 solution5 = new Solution5();
        int[] nums = {1, 1, 2};
        solution5.removeDuplicates(nums);
    }

    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        String s = "asd asd2  aa   ";
        String[] ss= s.split(" ");
        int length = ss.length;


        return set.size();
    }
}
