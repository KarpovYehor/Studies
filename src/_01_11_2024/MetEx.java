package _01_11_2024;

public class MetEx {
        /*int sum() {
        return 9;
    }*/

    void sumV() {

    }

    static int getSum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1};
        System.out.println(getSum(arr));
    }
}
