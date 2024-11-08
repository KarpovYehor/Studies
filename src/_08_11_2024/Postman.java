package _08_11_2024;

//public class Postman {
//    String name;
//    String surName;
//    int age;
//
//    Post post = new Post();
//}
//
//class Post{
//    String type = "type";
//}
//
//class Main {
//    public static void main(String[] args) {
//        String s = new Postman().post.type;
//
//        Postman[] postmen = new Postman[88];
//
//        postmen[0] = new Postman();
//    }
//}


import java.util.Arrays;

public class Postman {
    String name;
    String surName;
    int age;

    public Postman(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Postman{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}

/*
class Main {
    public static Postman[] gen(){
        Postman[] array = new Postman[10];

        for (int i = 0; i < 10; i++) {
            array[i] = new Postman("Name" + i, "Surename" + i, i+22);
        }
        return array;
    }


    public static void main(String[] args) {
        Postman[] postmen = gen();
        int[] x = {1,12,56,3,756,23};

        for (int i = 0; i < x.length; i++) {
            int current = x[i];
            if(current < 20){
                System.out.println(x[i]);
            }
        }

        for (int i = 0; i < postmen.length; i++) {
            Postman current = postmen[i];
            if (current.age < 24){
                System.out.println(current);
            }
        }
    }

//    public void m(Postman[] postmen, int k){
//
//    }
}
*/