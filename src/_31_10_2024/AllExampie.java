package _31_10_2024;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AllExampie {
    public static void main(String[] args) {
        int[] x = new int[10];

        int[] b = {2,3,5,1,0,-23,44,-1};

        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum = sum + b[i];
        }
        System.out.println(sum);
        /*System.out.println(Arrays.toString(b));

        System.out.println(b[3]);
        */

    }
}
