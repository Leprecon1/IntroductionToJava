package com.company;



public class Task14_ArmstrongNumber {
    public static void main(String[] args)  {
        int k = 10000;
        System.out.println(isArmstrongNumber(k));
        for (int i = 1; i < k ; i ++){
            if (isArmstrongNumber(i))
                System.out.print(i + " ");
        }
    }

    public static int AmountOfNumber(int a){
        int count = 0;
        while (a > 0){
            a = a / 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrongNumber(int n ){
        int a, SumOfDigits = 0;
        int temp=n;
        int count = AmountOfNumber(n);
        int pr = 1;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            for (int j = 0; j < count; j ++){
                pr*=a;
            }
            SumOfDigits=SumOfDigits+pr;
            pr = 1;
        }
        if(temp==SumOfDigits){
            return true;
        }
        else return false;
    }


}

