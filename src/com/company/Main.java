package com.company;

import java.util.Arrays;

public class Main {
// са
    public static void main(String[] args) {
	int[] arrays = {34, 21, 43, -14, 25, -56};
    boolean isSorted = false;
    while (!isSorted) {
        isSorted = true;
        for (int i = 1; i <arrays.length; i++) {
            if (arrays[i] <arrays [i - 1] ) {
                int a = arrays [i];
                arrays [i] = arrays [i - 1];
                arrays [i-1] = a;
                isSorted = false;

            }
        }
        for (int i = 0; i <arrays.length; i++) {
            if (i > 0) {
            }

        }
        System.out.println(Arrays.toString(arrays));
    }


        }
    }



