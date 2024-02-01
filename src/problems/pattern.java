package problems;

import java.util.Scanner;
import java.util.Stack;

public class pattern {
    public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    boolean testCases = (in.hasNext());
    while (in.hasNext()){
        String input = in.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i<input.length();i++){
            char current = input.charAt(i);
            if(current =='('|| current == '[' || current == '{'){
                stack.push(current);
            }
            if(stack.empty()){
                char peek = stack.peek();
                if((current == ')' && peek == '(')
                        || (current == ']'&& peek =='[')
                    || (current == '}' && peek == '{')){
                    stack.pop();
                }
            }else if((current == ')')
                || (current == '}')
            || (current == ']')){
                System.out.println("Invalid");
                stack.push(current);
            }
        }if(stack.empty()){
            System.out.println("Valid");
        }
//        else {
//            System.out.println("Invalid");
//            stack.clear();
//        }
    }

    }
}
