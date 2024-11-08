package Homework;

import java.util.Arrays;

public class _02_11_2024 {
    /*public static void main(String[] args) {
        int[] x = {1,45,32,76,13,-75,-23};

        //Среднее значение элементов масива
        int sumMiddle = 0;
        int middle = 0;

        for (int i = 0; i < x.length; i++) {
            sumMiddle = sumMiddle + x[i];
        }
        middle = sumMiddle/x.length;
        System.out.println("Среднее значение: " + middle);

        //максимальный элемент массива
        int max = x[0];

        for (int i = 1; i < x.length; i++) {
            if(x[i] > max){
                max = x[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);

        //количество четных и нечетных чисел
        int amountEven = 0;
        int amountOdd = 0;

        for (int i = 0; i < x.length; i++) {
            if(x[i] % 2 == 0){
                amountEven ++;
            }else{
                amountOdd ++;
            }
        }
        System.out.println("Количество четных: " + amountEven);
        System.out.println("Количество нечетных: " + amountOdd);

        // количество элементов, превышающих заданное значение
        int param = 30;
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < x.length; i++) {
            if(x[i] >= param){
                sum++;
            }else{
                sum1++;
            }
        }
        System.out.println("Количество превышающих 30: " + sum);
        System.out.println("Количество не привышающих 30: " + sum1);

        //Найти cумму элементов на четных индексах
        int sumElemens = 0;
        for (int i = 0; i < x.length; i++) {
            if (i % 2== 0){
                sumElemens += x[i];
            }
        }
        System.out.println("Сумма элементов на четных индексах: " + sumElemens);

        //Подсчитать количество положительных и отрицательных чисел
        int amountPlus = 0;
        int amountMinus = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0){
                amountPlus++;
            }else{
                amountMinus++;
            }
        }
        System.out.println("Количество положительных: " + amountPlus);
        System.out.println("Количество отрецательных: " + amountMinus);

        //Подсчет количества чисел больше среднего значения
        int amauntMore = 0;
        for (int i = 0; i < x.length; i++) {
            if(middle < x[i]){
                amauntMore++;
            }
        }
        System.out.println(amauntMore);

        //Замена всех отрицательных чисел на 0
        int change = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0){
                x[i] = 0;
            }
        }
        System.out.println(Arrays.toString(x));
    }*/

    public static void main(String[] args) {
        int[] x = {1,45,32,76,13,-75,-23};
        System.out.println("Среднее значение: " + getMiddle(x));
        System.out.println("Максимальный элемент: " + getMaxEl(x));
        getAmountPl_Mi(x);
        System.out.println("Количество превышающих 30: " + getParam(x));
        System.out.println("Сумма элементов на четных индексах: " + getSumEl(x));
        amountEv_Od(x);
        getChange(x);
        System.out.println(getAmoutMore(x));
    }

    static void amountEv_Od(int[] x){
        //количество четных и нечетных чисел
        int amountEven = 0;
        int amountOdd = 0;

        for (int i = 0; i < x.length; i++) {
            if(x[i] % 2 == 0){
                amountEven ++;
            }else{
                amountOdd ++;
            }
        }

        System.out.println("Количество четных: " + amountEven);
        System.out.println("Количество нечетных: " + amountOdd);
    }

    public static void getAmountPl_Mi(int[] x){
        //Подсчитать количество положительных и отрицательных чисел
        int amountPlus = 0;
        int amountMinus = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0){
                amountPlus++;
            }else{
                amountMinus++;
            }
        }
        System.out.println("Количество положительных: " + amountPlus);
        System.out.println("Количество отрецательных: " + amountMinus);
    }

    static void getChange(int[] x){
        //Замена всех отрицательных чисел на 0
        int change = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0){
                x[i] = 0;
            }
        }
    }

    static int getMiddle(int[] x){        //Среднее значение элементов масива

        int sumMiddle = 0;
        int middle;
        for (int i = 0; i < x.length; i++) {
            sumMiddle = sumMiddle + x[i];
        }
        middle = sumMiddle/x.length;
        return middle;
    }

    static int getMaxEl(int[] x){      //максимальный элемент массива
        int max = x[0];

        for (int i = 1; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }


    static int getParam(int[] x){
        // количество элементов, превышающих заданное значение
        int param = 30;
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            if(x[i] >= param){
                sum++;
            }
        }
        return sum;
    }

    static int getSumEl(int[] x){
        //Найти cумму элементов на четных индексах
        int sumElemens = 0;
        for (int i = 0; i < x.length; i++) {
            if (i % 2== 0){
                sumElemens += x[i];
            }
        }
        return sumElemens;
    }

    static int getAmoutMore(int[] x){
        //Подсчет количества чисел больше среднего значения
        int amauntMore = 0;
        int middle = getMiddle(x);                  //подсмотрел в чате GPT и разобрался
        for (int i = 0; i < x.length; i++) {
            if(middle < x[i]){
                amauntMore++;
            }
        }
        return amauntMore;
    }


}