package com.company;

public class Task04_ExchangeSort {
    public static void main(String[] args) {
        int[] a = new int[] {1,3,5,-5,4,-10,3,8};
        ExchangeSort(a);
        outputArray(a);
    }

    public static void outputArray(int[] arr){
        System.out.println("mas = ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void ExchangeSort ( int [ ] num )
    {
        int i, j, temp;
        for ( i = 0; i < num.length - 1; i ++ )
        {
            for ( j = i + 1; j < num.length; j ++ )
            {
                if( num[ i ] > num[ j ] )
                {
                    temp = num[ i ];   //swapping
                    num[ i ] = num[ j ];
                    num[ j ] = temp;
                }
            }
        }
    }
}
