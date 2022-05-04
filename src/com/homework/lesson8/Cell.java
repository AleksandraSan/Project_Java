package com.homework.lesson8;

import java.awt.*;

public class Cell {
    private int x, y; //начальные координаты змейки
    private int size; //размер ячейки
    private Color color; //цвет ячейки

    public Cell(int x, int y, int size, Color color){
        this.size = size;
        set(x, y); //используем метод сет так как x,y будут меняться и испю чаще
        this.color = color;

    }

    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void paint(Graphics2D g) {//отриссовка кружочков на нашем полe
        g.setColor(color);
        g.fillOval(x * size, y * size, size,size);//верхний левый угол , ширина и высота
    }

}
