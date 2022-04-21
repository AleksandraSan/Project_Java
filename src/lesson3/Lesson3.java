package lesson3;
public class Lesson3 {
    public static void main(String[] args) {
        intArray();
        emptyArray();
        newArray();
        square();
        oneArray(3, 9);
    }

    public static void intArray() {
        int[] array = {0, 1, 0, 1, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.println(array[i]);
        }
    }

    public static void emptyArray() {
        int[] arr = new int[100];
        arr[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println("arr [" + i + "]=" + arr[i]);
        }
    }

    public static void newArray() {
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6) {
                mass[i] = (mass[i] * 2);
            }
            System.out.println("mass [ " + i + "]=" + mass[i]);
        }
    }

    public static void square() {
        int a = 10;
        int[][] squareArray = new int[a][a];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (squareArray[i] == squareArray[j]) {
                    squareArray[i][j] = 1;
                }
                squareArray[i][a - i - 1] = 1;
                System.out.print(squareArray[i][j]);
            }
            System.out.println();
        }
    }


    public static void oneArray(int len, int initialValue) {
        int[] newArray = new int[len];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = initialValue;
            System.out.println(newArray[i]);
        }
    }
}


