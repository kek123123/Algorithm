package main.shnam.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution4 {

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        solution4.mergeTwoLists(list1, list2);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return new ListNode();
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        List<Integer> list = new ArrayList();

        while (list1.next != null) {
            list.add(list1.val);
        }

        while (list2.next != null) {
            list.add(list2.val);
        }

        list = list.stream().sorted().collect(Collectors.toList());

        ListNode result = new ListNode(list.get(list.size() - 1));

        for (int i = list.size() -2; i > -1; i++) {
            result = new ListNode(list.get(i), result);
        }

        return result;
    }
}
