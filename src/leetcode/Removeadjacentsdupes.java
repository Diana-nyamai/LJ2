package leetcode;

import java.util.Stack;

public class Removeadjacentsdupes {
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(!st.empty() && st.peek() == s.charAt(i)){
                st.pop();
                continue;
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return String.valueOf(sb.reverse());
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
