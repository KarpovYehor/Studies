package _01_11_2024;

import java.util.Scanner;

public class ArrEx3 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        int x = 0;

        */

        int[] x = {-35,4,78,0,3,-3,-34};
        int min = x[0];
        int min2 = x[0];

        for (int i = 1; i < x.length; i++) {
            if(x[i] < min){
                min = x[i];
            }
            else if(x[i] < min2 && x[i] != min){                  //Пишет ошибку потому что минимальное число уже является первым и дальнейшей проверки не требуется
                min2 = x[i];
            }
        }
        System.out.println(min);
        System.out.println(min2);


    }
}
