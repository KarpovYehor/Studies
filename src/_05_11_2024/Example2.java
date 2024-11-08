package _05_11_2024;

public class Example2 {
    int sum(int a, int b){
        return a+b;
    }
    int min(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();

        int result = obj.min(obj.sum(3, 65), 6);
    }
}
