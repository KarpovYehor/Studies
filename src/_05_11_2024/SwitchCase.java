package _05_11_2024;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int a = scanner.nextInt();

        switch (a){
            case 0:
                System.out.println("!");
                break;
            case 1:
                System.out.println("YYY");
                break;
            default:
                System.out.println("DEF");
        }
    }
}
