package _01_11_2024;

public class ArrEx2 {

    public static void main(String[] args) {
        /*int[] x = {1,2,34,5,7,32,-4};
        int sumResult = 0;
        int multResult = 1;
        for (int i = 0; i < x.length; i++) {
            if(i % 2 == 0){
                sumResult += x[i];
            }
            else{
                multResult *= x[i];
            }
        }
        System.out.println("Sum: " + sumResult);
        System.out.println("Mult: " + multResult);
        */




        /*int[] x = {12, 54, 87, 1, 34, 15, 3};
        int start = 0;
        int end = x.length - 1;
        int sum = 0;

        while (start < end) {
            sum = sum + x[start] + x[end];
            start++;
            end--;
            System.out.println(sum);
        }
        System.out.println(sum);*/




        /*int[] x = {1,2,3,8};
        int count = 0;         // Знаменатель
        int middle = 0;       //Числитель


        for (int i = 0; i < x.length; i++) {
            int current = x[i];
            if (current % 2 == 0){
                middle = middle + current;
                count++;
            }

        }
        System.out.println("Среднее арефметическое: " + middle / count);*/


        int[] x = {12, 54, 87, 1, 34, 15, 3};
        int start = 0;
        int end = x.length - 1;
        int sum = 0;

        while(start < end){
            sum =sum +x[start]+x[end];
            start++;
            end--;
            System.out.println(sum);
        }
        if(start == end){
            sum = sum + x[start];
        }
        System.out.println(sum);
    }
}
