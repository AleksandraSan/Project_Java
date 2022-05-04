package com.homework.lesson7;

public class MainApp {
    public static void main(String[] args){
        Cat [] cat = new Cat [5];
        cat [0] = new Cat("Filya", 20, 0);
        cat [1] = new Cat ("Marta", 20, 0);
        cat [2] = new Cat ("Thomas", 20, 0);
        cat [3] = new Cat ("Myrka", 10, 0);
        cat [4] = new Cat ("Levya", 5, 0);
        Plate plate = new Plate(250);

        plate.info();

        for (int i=0; i < cat.length; i++){
            if (cat[i].getSatiety()==0){
                if (!plate.amountFoodInPlate(cat[i].getAppetite())){
                    plate.increaseFood();
                }
                cat[i].eat(plate);
                cat[i].setSatiety(cat[i].getSatiety() + 100);
            };
            System.out.println("Кот по имени " + cat[i].getName() + " съел " + cat[i].getAppetite() + " граммов еды");
            System.out.println("Кот сыт: " + cat[i].catSatiety());
            plate.info();
        }

    }

}
