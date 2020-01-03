package com.company;

public class Task03_CountElement {
    public static void main(String[] args) {
        int[] a = new int[]{1, 0, 2, 6, 0,  -3, 9, -8};
      int CountNeg = 0;
      int CountPos = 0;
      int CountNull = 0;
      for (int i = 0; i<a.length; i++){
          if (a[i] > 0){
              CountPos++;
          }
          if (a[i] < 0){
              CountNeg++;
          }
          if (a[i] == 0){
              CountNull++;
          }
      }
      System.out.printf("Count negative = %d, count positive = %d, count null = %d ",CountNeg,CountPos,CountNull);
    }
}
