package _08_11_2024;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("P1", 34);
        Cat c1 = new Cat("c1", 1);

        p1.setCat(c1);

        System.out.println(p1.getCat());
    }
}
