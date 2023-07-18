import java.io.Serializable;

public class People implements Serializable {
    private String name;
    private int age;
    private double salary;

    public People(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name= " + name + ", age = " + age + ", salary = " + salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
