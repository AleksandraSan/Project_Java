package com.homework.lesson8;

import java.util.Random;

public class Food extends Cell {
    private Random random;
    private Snake snake;
    private Poison poison;

    public Food(Snake snake) {
        super(-1, -1, GameSnake.CELL_SIZE, GameSnake.FOOD_COLOR);//левые координаты
        random = new Random();
        this.snake = snake;
    }

    public void setPoison(Poison poison){
        this.poison = poison;
    }

    public boolean isFood(int x, int y) {
        return (getX() == x) && (getY() == y);
    } //прошла ли змейка через еду,определяем по координатам есть у нас там еда или нет

    public boolean isEaten(){ //сьедена ли змейка , если еда за пределами поля то она съедена
        return getX()== -1;
    }

    public void eat(){//координаты сьеденной еды
        set(-1 , -1);
    }



    public void appear(){//отрисовка закрашенной ячейки (кружочка)
        int x, y;
        do {
            x = random.nextInt(GameSnake.CANVAS_WIDTH);
            y = random.nextInt(GameSnake.CANVAS_HEIGHT);
        } while (snake.isInSnake(x, y) || poison.isPoison(x, y));//генерятся, пока не попадут в змею
        set(x, y);//координаты для ячейки, которая отрисуется цветом еды
    }


}
