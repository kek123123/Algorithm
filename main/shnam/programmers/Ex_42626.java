package main.shnam.programmers;

import java.util.PriorityQueue;

public class Ex_42626 {

    //문제 출처 : https://school.programmers.co.kr/learn/courses/30/lessons/42626

    public static void main(String[] args) {
        Ex_42626 ex_42626 = new Ex_42626();

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 600;

        System.out.println(ex_42626.solution(scoville, K));
    }

    public int solution(int[] scoville, int K) {

        int cnt = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i=0; i < scoville.length-1; ++i) {
            minHeap.offer(scoville[i]);
        }

        while (minHeap.size() > 1) {

            cnt++;

            int first = minHeap.poll();
            int second = minHeap.poll();

            int sum = first + (2 * second);

            if (sum >= K) {
                return cnt;
            } else {
                minHeap.offer(sum);
            }
        }

        return -1;
    }
}
