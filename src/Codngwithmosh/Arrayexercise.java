package Codngwithmosh;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrayexercise {
      private int items[];
      private int count;
       public Arrayexercise(int length){
       items = new int[length];
       }
       public void print(){
           for (int i=0; i<count; i++){
               System.out.println(items[i]);
           }
       }
       public void insert(int item){
//           add an element
           items[count] = item;
           count++;
           if(items.length == count){
               int Newitems[] = new int[count * 2];
                for(int i=0; i<count; i++){
                    Newitems[i] = items[i];
                }
                items = Newitems;

           }
       }
       public void removeAt(int index){
          if(index < 0 || index >= count){
         throw new IllegalArgumentException();
          }
          for(int i=index; i<count; i++){
              items[i] = items[i+1];
          }
          count--;
       }
       public int IndexOf(int item){
//           time complexity of this method is linear - O(n)
           for(int i=1; i<count; i++){
               if(items[i] == item){
                  return i;
               }
           }
           return -1;
       }
}
