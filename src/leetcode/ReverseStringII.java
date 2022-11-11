package leetcode;

public class ReverseStringII {
    public static String reverseStr(String s, int k) {
         char [] str = s.toCharArray();
         int size = str.length;
         int twok = 2*k;
         for(int i=0; i<size; i+=twok){
          if(i+k-1 < size){
             swap(str,i,i+k-1);
          }
          else{
              swap(str,i,size-1);
          }
         }
         String res = new String(str);
         return res;

    }

    public static void swap(char[] arr, int l, int r){
        while(l<r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }
}
