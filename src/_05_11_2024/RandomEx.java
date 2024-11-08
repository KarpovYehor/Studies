package _05_11_2024;

import java.util.Arrays;
import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(89);

        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(23);
        }

        System.out.println(Arrays.toString(array));
    }
}