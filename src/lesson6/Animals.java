package lesson6;

public class Animals {
    private String name;
    private String color;
    private int age;

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void run() {
        System.out.print("Животное бежит");
    }


    public String toString() {
        return "Name is " + name + ", Color is " + color + ", age  is " + age;
    }
}

