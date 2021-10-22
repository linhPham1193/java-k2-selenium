package Lesson06;

import java.security.SecureRandom;

public class Lab0601_Animal implements Comparable<Lab0601_Animal> {
    private String name;
    private int maxSpeed;
    private int speed;

    public Lab0601_Animal(){
    }

    public Lab0601_Animal(String name, int maxSpeed, int speed){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.speed = speed;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public int setSpeed() {
        int randomSpeed = new SecureRandom().nextInt(maxSpeed);
        speed = randomSpeed;
        return speed;
    }

    public int compareTo(Lab0601_Animal o) {
        if (this.getSpeed() > o.getSpeed()) {
            return 1;
        } else if (this.getSpeed() < o.getSpeed()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", speed=" + speed +
                '}'+'\n';
    }
}
