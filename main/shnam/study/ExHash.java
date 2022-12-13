package main.shnam.study;

import java.util.Collections;
import java.util.TreeSet;

public class ExHash {

    int a = 0;

    public static void main(String[] args) {
        new ExHash().solution();
    }

    public void solution() {
        트리셋();
    }

    private void 트리셋() {
        //내림차순
        TreeSet treeSet = new TreeSet(Collections.reverseOrder());

        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);

        treeSet.first();

        System.out.println(treeSet);
    }


}
