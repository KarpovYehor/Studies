package _31_10_2024;

public class or_and {
    public static void main(String[] args) {
        int x = 33_000;
        int sum = 0;

        while(x > 0){
            x -= 555;
            if(x % 2 ==0 && x % 5 == 0 || x == 1001){
                sum += x;
                if(sum % 10 == 0){
                    System.out.println(sum);
                }
            }
            System.out.println(sum);
        }
    }
}