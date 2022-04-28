package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    Scanner scanner;
    Random random;
    char[][] table;

    Lesson4() {
        scanner = new Scanner(System.in);
        random = new Random();
        table = new char[3][3];
    }


    public static void main(String[] args) {
        new Lesson4().game();
    }

    void game() {
        System.out.println("Игра началась!");
        initTable();
        printTable();

        while (true) {
            humanMove();
            if (checkWin('x')) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("DRAW!");
                break;
            }

            computerMove();
            printTable();
            if (checkWin('o')) {
                printTable();
                System.out.println("Computer WON!");
                break;
            }
            if (isTableFull()){
                System.out.println("DRAW!");
                break;
            }
        }
    }


    void humanMove() {
        //шаг человека, убирается точка, и на место точки ставится крестик
        int x, y;
        do {
            System.out.println("Enter x, y from [0..2]");
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (!isCellValid(x, y));
        table[x][y] = 'x';
    }


    void printTable() {
        //отрисовка нашей таблицы
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    void computerMove() {
        //шаг компьютера, замена точки на ноль
        int x, y;

        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }
        while (!isCellValid(x, y));
        table[x][y] = 'o';
    }

    boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++)
            if ((table[i][0] == symbol && table[i][1] == symbol &&
                    table[i][2] == symbol) ||
                    (table[0][i] == symbol && table[1][i] == symbol &&
                            table[2][i] == symbol))
                return true;
        if ((table[0][0] == symbol && table[1][1] == symbol &&
                table[2][2] == symbol) ||
                (table[2][0] == symbol && table[1][1] == symbol &&
                        table[0][2] == symbol))
            return true;
        return false;
    }



    boolean isTableFull () {
        //заполнена ли таблица
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (table[x][y] == '.') return false;
            }
        }
        return true;
    }

    void initTable () {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                table[x][y] = '.';
            }
        }
    }

    boolean isCellValid ( int x, int y){
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[x][y] == '.';
    }

}

