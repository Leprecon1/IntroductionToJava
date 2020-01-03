package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task08_NewSequence {
    public static void main(String[] args) {
      int[] a = new int[] {1,4,-2,3,5,-2};
        List<Integer> list = new ArrayList<Integer>();
      int min = Arrays.stream(a).min().getAsInt();
      for (int i = 0; i < a.length; i++){
          if (a[i] != min){
              list.add(a[i]);
          }
      }
        System.out.println("New Sequence: "+list);
    }
}
