package com.company;

public class Task01_SumMultiple {

    public static void main(String[] args) {
	  int[] A = new int[] {1,5,2,10,9};
	  int sum = 0;
	  for (int i = 0; i < A.length; i++){
	      if (A[i] % 5 == 0){
	          sum+=A[i];
          }
      }
        System.out.println("sum="+sum);
    }
}
