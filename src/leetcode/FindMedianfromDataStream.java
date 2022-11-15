package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMedianfromDataStream {
    ArrayList<Integer> list;
    public FindMedianfromDataStream() {
      list = new ArrayList<>();
    }

    public void addNum(int num) {
        int i;
        if(list.size()>0){
            for(i=0; (i< list.size() && list.get(i)<num); i++);
            if(i==-1){
                i=0;
            }
            list.add(i, num);
        }
        else{
            list.add(num);
        }

    }

    public double findMedian() {
       int index = list.size()/2;
       if(list.size()%2 == 0){
           return (double) (list.get(index) + list.get(index-1))/2;
       }
       else {
           return list.get(index);
       }
    }
    public static void main(String[] args) {
      FindMedianfromDataStream findMedianfromDataStream = new FindMedianfromDataStream();
      findMedianfromDataStream.addNum(2);
      findMedianfromDataStream.addNum(7);
      findMedianfromDataStream.addNum(5);
      System.out.println(findMedianfromDataStream.findMedian());


    }
}
