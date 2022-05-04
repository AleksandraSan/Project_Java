package lesson6;

public class Cat extends Animals{
    private int obstacleLenght;

    public Cat(String name, String color, int age){
        super(name, color, age);
    }

    public Cat(String name, String color, int age , int obstacleLenght){
        super(name, color, age);
        this.obstacleLenght = obstacleLenght;
    }

    public int getObstacleLenght() {
        return obstacleLenght;
    }

    public void setObstacleLenght(int obstacleLenght) {
        this.obstacleLenght = obstacleLenght;
    }

    public void run(){
        if (obstacleLenght <= 200){
            System.out.println("Кот пробегает дистанцию " + obstacleLenght + " метров.");
        } else {
            System.out.println("Кот не может пробежать дистанцию более 200 метров." );
        }
    }
}