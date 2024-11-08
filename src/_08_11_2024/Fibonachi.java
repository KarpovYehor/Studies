package _08_11_2024;

import java.util.Arrays;

public class Fibonachi {

    public static long fibonacci(int index){
        int[] arr = new int[index];
        arr[0] = 0;
        arr[1] = 1;


        int first = 0;
        int second = 1;
        int result = 0;

        for (int i = 2; i < index; i++) {
            result = first + second;
            arr[i] = result;
            first = second;
            second = result;
        }
        System.out.println(Arrays.toString(arr));
        return second;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}
