package main.shnam.baekjoon;

public class Ex_9095 {

    //정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
    //1+1+1+1
    //1+1+2
    //1+2+1
    //2+1+1
    //2+2
    //1+3
    //3+1
    //정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

    //예제 입력
    //4
    //7
    //10

    //예제 출력
    //7
    //44
    //274

    public static void main(String[] args) {

        int n = 10;

        solution(n);
    }

    public static void solution(int n) {

        int[] arr = new int[n+1];

        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 4; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }

        System.out.println("result = " + arr[n]);
    }
}
