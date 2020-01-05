package com.company;

import javax.sound.midi.Soundbank;

public class Task06_CoprimeIntegers {
    public static void main(String[] args) {
        int[] element_array = {15,23,19};
        if (checkCoprimeIntegers(element_array)){
            System.out.println("coprime integers");
        }
        else
            System.out.println("not coprime integers");
    }
    public static int lcm_elements(int[] element_array) {
        int lcm_of_array_elements = 1;
        int divisor = 2;

        while (true) {
            int counter = 0;
            boolean divisible = false;

            for (int i = 0; i < element_array.length; i++) {
                if (element_array[i] == 0) {
                    return 0;
                } else if (element_array[i] < 0) {
                    element_array[i] = element_array[i] * (-1);
                }
                if (element_array[i] == 1) {
                    counter++;
                }

                if (element_array[i] % divisor == 0) {
                    divisible = true;
                    element_array[i] = element_array[i] / divisor;
                }
            }

            if (divisible) {
                lcm_of_array_elements = lcm_of_array_elements * divisor;
            } else {
                divisor++;
            }

            if (counter == element_array.length ) {
               return  lcm_of_array_elements;
            }
        }
    }
    public static boolean checkCoprimeIntegers(int[] element_array){
        int pr = 1;
        for (int i = 0; i < element_array.length; i++){
            pr*=element_array[i];
        }
        if (pr == lcm_elements(element_array)){
            return true;
        }
        else
            return false;
    }
}
