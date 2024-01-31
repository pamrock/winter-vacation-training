package nuc.ss.day06;

import java.util.Stack;

/**
 * @ClassName StackTest
 * @Description TODO
 * @Author 12459
 * @Date 2024/1/30 19:48
 **/
public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        System.out.println(stack);
        stack.push(22);
        System.out.println(stack);
        stack.push(33);
        System.out.println(stack);
        stack.push(44);
        System.out.println(stack);
        stack.push(55);
        System.out.println(stack);
        System.out.println("---------------------");
        System.out.println("栈顶元素为: " + stack.peek());
        System.out.println("---------------------");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }


}
