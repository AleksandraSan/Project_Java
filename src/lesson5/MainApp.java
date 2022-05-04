package lesson5;

public class MainApp {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Anna", "Petrova", "Vladimirovna", "Engineer", "annapetr@mail.ru", "8-999-888-88-99", 60000, 25);
        persArray[1] = new Employee("Michail", "Antonov", "Ivanovich", "Developer", "michantonov@mail.ru", "8-888-222-32-12", 120000, 44);
        persArray[2] = new Employee("Elvira", "Garbuk", "Sergeevna", "administrator", "elviragarbuk@gmail.com", "8-778-987-76-98", 80000, 24);
        persArray[3] = new Employee("Andrey", "Golubev", "Aleksandrovich", "SMM manager", "golubev19@mail.ru", "8-999-777-77-66", 170000, 41);
        persArray[4] = new Employee("Kristina", "Goldysova", "Sergeevna", "Engineer", "goldyssss@mail.com", "8-999-888-33-22", 50000, 23);

        for (Employee employee : persArray)
            if (employee.getAge()> 40){
                System.out.println(employee);
            }
    }



}
