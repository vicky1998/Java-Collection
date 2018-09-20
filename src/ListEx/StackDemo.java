package ListEx;

import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {

        Stack s1=new Stack();
        s1.add(1);
        s1.push(2);
        System.out.println(s1.peek());
        System.out.println(s1);
        System.out.println(s1.pop());
        System.out.println(s1);
    }
}
