package _08_11_2024;

public class Employee {
    private String name;
    private String surName;
    private String department;
    private int age;
    private double salary;

    public Employee[] generate(){
        Employee[] arr = new Employee[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Employee("Name" + i, "Surname" + i,2 + i,"Department" + i, 2000+i);

        }
        return arr;
    }

    public void printEmployee(Employee[] arr, String department, int age){
        for (int i = 0; i < arr.length; i++) {
            Employee current = arr[i];
            if (current.getDepartment().equals(department) && current.getAge() > age){
                System.out.println(current);
            }
        }
    }

    public Employee(String name, String surName, int age, String department, double salary) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

