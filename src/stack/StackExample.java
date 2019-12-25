package stack;

import java.util.Stack;

public class StackExample {

    public StackExample() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i + 1); // stack 에 데이터 삽입
            System.out.println(stack.peek()); // 최근에 추가한 데이터 참조(read 만)
        }
        System.out.println(stack.pop()); // 최근에 추가한 데이터 삭제
        System.out.println(stack.lastElement());
        System.out.println("last added is " + stack.peek());
        int item = 1;
        System.out.println("searching " + item + " result " + stack.search(item)); // 4 반환
        System.out.println("stack is empty ? " + (stack.empty() ? "yes" : "no")); // false 면 값이 있음, true 면 없음.
    }

    public static void main(String[] args) {
        new StackExample();
    }
}
