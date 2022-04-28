package com.homework.lesson7;

public class Plate {
    private int amountFood;

    public Plate(int amountFood){
        this.amountFood = amountFood;

    }

    public void setAmountFood(int amountFood){
        this.amountFood = amountFood;
    }

    public int getAmountFood(){
        return amountFood;
    }

    public void info() {
        System.out.println("Количество еды: " + amountFood);

    }


    public void decreaseFood(int amount){
        amountFood = amountFood - amount;
    }

    public void increaseFood(){
        amountFood = amountFood + 500;
    }

    public boolean amountFoodInPlate(int amount){
        return (amountFood - amount) >=0;

    }


}
