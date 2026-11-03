package Stack;

import java.util.Stack;

public class stack1 {
    static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("java");
        stack.push("python");
        stack.push("c++");
        stack.push("Javascript");
        stack.push("Go");
        System.out.println("stack " + stack);

        System.out.println("should be " + stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println( "stack is empty = " + stack.empty());

        System.out.println("\n---- String reversal------");
        String orginal = "Hello World";
        Stack<Character> stack1 = new Stack<>();

        for (int i = 0; i < orginal.length(); i++) {
            stack1.push(orginal.charAt(i));
        }

        String reversed = "";
        while (!stack1.isEmpty()){
            reversed = reversed + stack1.pop();
        }
        System.out.println(orginal);
        System.out.println(reversed);

        System.out.println("\n-----Balance Bracket-----");

        String balanced = "({[()]})";
        String unbalanced = "({[})";
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < balanced.length(); i++) {
            char ch = balanced.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack2.push(ch);
            }else {
                if (stack2.isEmpty()) {
                    break;
                }
                stack2.pop();
            }
        }
        if (stack2.isEmpty()){
            System.out.println("balanced");
        }else  {
            System.out.println("not balanced");
        }






    }
}
