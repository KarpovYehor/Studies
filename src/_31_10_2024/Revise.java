package _31_10_2024;

public class Revise {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/

        // a += 5;  ==   a=a+5

        /*int x = 1230;
        while(x > 100){

            if(x % 2 == 0){
                System.out.println("четное: " + x);
            }
            else{
                System.out.println("не четное: " + x);
            }
            x -= 355;
        }*/


        int start = 0;
        int end = 10;
        int summ = 0;

        for (int i = start; i < end; i++) {
            if(i % 2 == 0){
                summ +=i;
            }else{
                continue;
            }

        }
        System.out.println(summ);



    }
}