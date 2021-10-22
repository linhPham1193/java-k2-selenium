package Lesson06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab0601_RacingAnimal {
    public static void main(String[] args) {
        //Create 3 object as animal
        Lab0601_Animal horse = new Lab0601_Animal();
        Lab0601_Animal tiger = new Lab0601_Animal();
        Lab0601_Animal dog = new Lab0601_Animal();

        horse.setName("horse");
        tiger.setName("tiger");
        dog.setName("dog");

        horse.setMaxSpeed(75);
        tiger.setMaxSpeed(100);
        dog.setMaxSpeed(50);

        horse.setSpeed();
        tiger.setSpeed();
        dog.setSpeed();

        List<Lab0601_Animal> compare = new ArrayList<>();
        compare.add(horse);
        compare.add(tiger);
        compare.add(dog);
        System.out.println(compare);

        Lab0601_Animal max = Collections.max(compare);
        System.out.println("Winner is: " + max.getName() + " with speed: " + max.getSpeed());
    }

}
