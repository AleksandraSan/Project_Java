package lesson6;

public class Dog extends Animals {
    private int obstacleLenghtRun;
    private int obstacleLenghtSwim;

    public Dog (String name, String color, int age){
        super(name, color, age);
    }

    public Dog (String name, String color, int age, int obsctacleLenghtRun, int obstacleLenghtSwim){
        super(name, color, age);
        this.obstacleLenghtRun = obsctacleLenghtRun;
        this.obstacleLenghtSwim = obstacleLenghtSwim;
    }

    public int getObstacleLenghtSwim() {
        return obstacleLenghtSwim;
    }

    public void setObstacleLenghtSwim(int obstacleLenghtSwim) {
        this.obstacleLenghtSwim = obstacleLenghtSwim;
    }

    public int getObstacleLenghtRun() {
        return obstacleLenghtRun;
    }

    public void setObstacleLenghtRun(int obstacleLenghtRun) {
        this.obstacleLenghtRun = obstacleLenghtRun;
    }

    public void run() {
        if (obstacleLenghtRun <= 500){
            System.out.println(" Собака пробегает дистанцию " + obstacleLenghtRun + " метров. ");
        } else {
            System.out.println(" Собака не может пробежать дистанцию более 500 метров. ");
        }
    }

    public void swim() {
        if (obstacleLenghtSwim <= 10){
            System.out.println(" Собака проплывает дистанцию " + obstacleLenghtSwim + " метров. ");
        } else {
            System.out.println(" Собака не может пропылать дистанцию более 10 метров. ");
        }
    }
}
