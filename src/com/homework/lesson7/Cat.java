package com.homework.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;


    public Cat(String name, int appetite, int satiety){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAppetite(int appetite){
        this.appetite = appetite;
    }

    public int getAppetite(){
        return appetite;
    }

    public void eat(Plate plate){
        plate.decreaseFood(appetite);
    }

    boolean catSatiety(){
        if (getSatiety() == 0) {
            return false;
        } if (appetite==0){
            return false;
        }
        if (getSatiety() > 0 && getAppetite()==0) {
            return true;
        }
        return true;
    }
}
