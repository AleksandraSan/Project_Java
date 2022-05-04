package com.homework.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameSnake extends JFrame{
        private final String TITLE_OF_PROGRAM = "GAME SNAKE";// заголовок окошечка игры
        private final String GAME_OVER_MSG = "GAME OVER";// завершающий заголовок игры
        public final static int CELL_SIZE = 20; //размер ячейки из которых состоит поле
        public final static int CANVAS_WIDTH = 30; // ширина поля
        public final static int CANVAS_HEIGHT = 25;//высота поля
        public final static Color SNAKE_COLOR = Color.PINK;//цвет змейки
        public final static Color POISON_COLOR = Color.BLACK;//цвет яда
        public final static Color FOOD_COLOR = Color.RED;// цвет еды
        public final static int KEY_LEFT = 37; //происходит действие при нажатии кнопки влево
        public final static int KEY_RIGHT= 39;//вправо
        public final static int KEY_UP = 38;//вверх
        public final static int KEY_DOWN = 40;//вниз
        public final int START_SNAKE_SIZE = 5; //изначальный размер змейки 20 ячеек
        public final int START_SNAKE_X = CANVAS_WIDTH/2; //начальное положение головы змеи по иксу
        public final int START_SNAKE_Y = CANVAS_HEIGHT/2;// по игрику
        public final int SNAKE_DELAY = 150;//некое замеделение , что бы программа не летала(милисекунды)
        public int snakeSize = 0;
        public static boolean gameOver = false;

        Canvas canvas;
        Food food;
        Snake snake;
        Poison poison;

        public static void main(String[] args){
            new GameSnake().game();
        }
        public GameSnake() {
            setTitle(TITLE_OF_PROGRAM);//простановка заголовков
            setDefaultCloseOperation(EXIT_ON_CLOSE);//при закрытии программа завершается

            canvas = new Canvas();
            canvas.setBackground(Color.white);
            canvas.setPreferredSize(new Dimension(
                    CELL_SIZE * CANVAS_WIDTH,
                    CELL_SIZE * CANVAS_HEIGHT));

            addKeyListener(new KeyAdapter() {//метод обработки клавиш
                @Override
                public void keyPressed(KeyEvent e) {
                    snake.setDirection(e.getKeyCode());
                }
            });

            add(canvas); //отрисованное окошко
            pack();
            setLocationRelativeTo(null);
            setResizable(false); //нельзя увеличивать
            setVisible(true);
        }

        private void game() { //метод запускающий нашу игру
            snake = new Snake(//инициализация змейки
                    START_SNAKE_X,
                    START_SNAKE_Y,
                    START_SNAKE_SIZE,
                    KEY_RIGHT);
            food = new Food(snake);
            snake.setFood(food);

            poison = new Poison(snake);
            poison.setFood(food);
            snake.setPoison(poison);
            food.setPoison(poison);


            while (!gameOver) {
                snake.move();
                if (snake.size() > snakeSize) {
                    snakeSize = snake.size();
                    setTitle(TITLE_OF_PROGRAM + " : " + snakeSize);
                }
                if (food.isEaten()) {
                    food.appear();
                    poison.add();//добавляются новые точки яда
                }
                canvas.repaint();
                sleep(SNAKE_DELAY);
            }
            JOptionPane.showMessageDialog(this, GAME_OVER_MSG);
        }

        private void sleep(long ms) {
            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        class Canvas extends JPanel {
            public void paint (Graphics g){
                super.paint(g);
                Graphics2D g2D = (Graphics2D) g;
                g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                snake.paint(g2D);
                food.paint(g2D);
                poison.paint(g2D);
            }
        }
    }
