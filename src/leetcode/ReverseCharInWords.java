package leetcode;

public class ReverseCharInWords {
    public static String reverseWords(String s) {
        String trim = s.trim();
        char[] tochar = trim.toCharArray();


        int last = trim.length() - 1;
        int first = 0;

        while(first<last){
            char temp = tochar[first];
            tochar[first] = tochar[last];
            tochar[last] = temp;
            first++;
            last--;
        }
        return String.valueOf(tochar);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
}
