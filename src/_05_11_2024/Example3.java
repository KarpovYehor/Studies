package _05_11_2024;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example3 {

    public int[] generateArray(int l){
        int[] array = new int[l];
        Random random = new Random();
        for (int i = 0; i < l; i++) {
            array[i] = random.nextInt(44);
        }
        return array;
    }


    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("sdf fdfsdf fsdfsdf");
        //String text = scanner.nextLine();
        int text = scanner.nextInt();


        System.out.println("fsdfs: " + text);
        */

        Example3 ex3 = new Example3();
        System.out.println(Arrays.toString(ex3.generateArray(50)));

    }
}
