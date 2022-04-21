package lesson5;

public class Employee {
    private final String name;
    private final String surname;
    private final String patronymic;
    private final String position;
    private final String email;
    private final String phone;
    private final int salary;
    private final int age;


    public Employee(String name, String surname, String patronymic, String position, String email, String phone, int salary,int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString(){
        return (name + " " + surname + " " + patronymic + "\n" + "Возраст: " + age + "\n" + "Занимает должность: " + position + "\n" + "Адрес электронной почты: " + email + "\n" + "Номер телефона: " + phone + "\n" + "Заработная плата: "+ salary);
    }

    public int getAge(){
        return age;
    }
}



