package _05_11_2024;

public class Example1 {
    public int getMain(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count =arr[i];
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;

    }

    public static void main(String[] args) {
        int[] arr  = {13,32,64,13,45,34};

        int x = 5;
        Example1 ex = new Example1();
        System.out.println(ex.getMain(arr));


        String f = "sRSHFTsd";
        System.out.println(f.toLowerCase());



    }
}
