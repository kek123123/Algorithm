package main.shnam.study;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueImplForTwoStack {

    Stack<Integer> saveStack = new Stack<>();
    Stack<Integer> getStack = new Stack<>();

    public static void main(String[] args) {

        QueueImplForTwoStack queueImplForTwoStack = new QueueImplForTwoStack();

        queueImplForTwoStack.push(1);
        queueImplForTwoStack.push(2);
        queueImplForTwoStack.push(5);
        queueImplForTwoStack.push(4);

        System.out.println(queueImplForTwoStack.pop());
        System.out.println(queueImplForTwoStack.pop());
        System.out.println(queueImplForTwoStack.pop());
        System.out.println(queueImplForTwoStack.pop());
        System.out.println(queueImplForTwoStack.pop());
    }

    public int pop() {
        if (getStack.isEmpty()) {
            while (!saveStack.isEmpty()) {
                int num = saveStack.pop();
                getStack.push(num);
            }
        }

        if (getStack.isEmpty()) throw new EmptyStackException();

        return getStack.pop();
    }

    public void push(int num) {
        saveStack.push(num);
    }

}
