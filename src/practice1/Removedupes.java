package practice1;

import java.util.Stack;

public class Removedupes {
    public static void rmdupes(int[]num){
      int ac = 1;
        Stack<Integer> st = new Stack<>();

      for(int i=0; i<num.length - 1; i++){
          if(num[i] == num[i+1]){
              continue;
          }
          else{
              st.push(num[i] = num[i+1]);
              ac++;
          }
      }
        System.out.println(st);
        System.out.println(ac);
    }
    public static void main(String[] args) {
      int []arr = {1,2,2,2,3};
      rmdupes(arr);
    }
}
