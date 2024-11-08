package _05_11_2024;

import java.util.Scanner;

public class NewProj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean nws = true;

        while (nws){
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            switch (number){
                case 0:
                    System.out.println("Вы ввили 0");
                    break;
                case 1:
                    System.out.println("Вы ввили 1");
                    break;
                default:
                    System.out.println("Incorrect number");
            }
            System.out.println("Хотите продолжить?");
            String revers = scanner.nextLine();

            if(revers.equals("Да") || revers.equals("да")){
                nws = true;
            }else{
                nws = false;
            }
        }
    }
}
