package _08_11_2024;

public class Cat {
    private String catName;
    private int catAge;

    public Cat(String catName, int catAge) {
        this.catName = catName;
        this.catAge = catAge;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", catAge=" + catAge +
                '}';
    }
}
