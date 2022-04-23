package lesson2;

public class Lesson2 {
    public static void main(String[] args){
        System.out.println(checkNumbers(9,6));
        posOrNegNumber(6);
        System.out.println(truFolceNumber(7));
        numberOutput("Hello", 34);
    }

    public static boolean checkNumbers(int a, int b){
        int c = a + b;
        return (c >= 10) && (c <= 20);
    }

    public static void posOrNegNumber(int a){
        if (a < 0){
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Положительное число");
        }
    }

    public static boolean truFolceNumber(int a){
        if (a < 0){
            return true;
        }
        return false;
    }

    public static void numberOutput(String word, int n){
        for (int i = 1; i <= n; i++){
            System.out.println( i  + word);
        }
    }
}

