package practice1;

import java.util.Stack;

public class RemoveAdjacentDuplication {
    public static String removeDupes(String str){
        Stack<Character> stack = new Stack<>();
        stack.push(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            if(!stack.empty() && stack.peek() == str.charAt(i)){
                stack.pop();
                continue;
            }
            else{
                stack.push(str.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        return String.valueOf(sb.reverse());
    }
    public static void main(String[] args) {
        System.out.println(removeDupes("abbaca"));
    }
}
