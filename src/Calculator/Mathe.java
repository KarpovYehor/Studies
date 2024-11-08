package Calculator;

import java.util.Scanner;

public class Mathe {
    public double addition(double a, double b) {
        return a + b;
    }

    public double difference(double a, double b) {
        return a - b;
    }

    private double multiplication(double a, double b) {
        return a * b;
    }

    private double division(double a, double b) {
        return a / b;
    }

    public void start(){
        Mathe ma = new Mathe();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите ли вы розчитать?");
        String start = scanner.nextLine();
        if(start.equals("да") || start.equals("Да")){
            boolean again = true;
            while (again){
                System.out.print("Please input 1-st number: ");
                double a = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ввидите переменную : ");
                String oper = scanner.nextLine();

                System.out.print("Please input 2-d number: ");
                double b = scanner.nextInt();
                scanner.nextLine();

                switch (oper) {
                    case "+":
                        System.out.println(ma.addition(a, b));
                        break;
                    case "-":
                        System.out.println(ma.difference(a, b));
                        break;
                    case "*":
                        System.out.println(ma.multiplication(a, b));
                        break;
                    case "/":
                        System.out.println(ma.division(a, b));
                        break;
                    default:
                        System.out.println("Вы ввели не верный знак!");
                }
                System.out.println("Хотите продолжить?");
                String revers = scanner.nextLine();
                if(revers.equals("Да") || revers.equals("да")){
                    again = true;
                }else{
                    again = false;
                }
            }
        }

    }

    public static void main(String[] args) {

    }
}