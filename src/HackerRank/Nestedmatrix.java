package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nestedmatrix {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        List<Integer> inner2 = new ArrayList<>();
        List<Integer> inner3 = new ArrayList<>();
        arr.add(inner);
        arr.add(inner2);
        arr.add(inner3);

        inner.add(1);
        inner.add(2);
        inner.add(3);

        inner2.add(4);
        inner2.add(5);
        inner2.add(6);

        inner3.add(7);
        inner3.add(8);
        inner3.add(9);

        System.out.println(arr.get(0).get(1));

    }
}
