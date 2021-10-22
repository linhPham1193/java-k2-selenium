package Lesson06;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class newRace {

    public static void main(String[] args) {
        final int eagleMaxSpeed = 120;
        final int snakeMaxSpeed = 60;
        final int falconMaxSpeed = 110;
        final int tigerMaxSpeed = 100;
        final int horseMaxSpeed = 75;
        final int dogMaxSpeed = 50;

        newAnimal.Builder builder = new newAnimal.Builder();
        newAnimal eagle = builder.isFlyAble(true).whatName("eagle").whatSpeed(new SecureRandom().nextInt(eagleMaxSpeed)).build();
        newAnimal snake = builder.isFlyAble(false).whatName("snake").whatSpeed(new SecureRandom().nextInt(snakeMaxSpeed)).build();
        newAnimal falcon = builder.isFlyAble(true).whatName("falcon").whatSpeed(new SecureRandom().nextInt(falconMaxSpeed)).build();
        newAnimal tiger = builder.isFlyAble(false).whatName("tiger").whatSpeed(new SecureRandom().nextInt(tigerMaxSpeed)).build();
        newAnimal horse = builder.isFlyAble(false).whatName("horse").whatSpeed(new SecureRandom().nextInt(horseMaxSpeed)).build();
        newAnimal dog = builder.isFlyAble(false).whatName("dog").whatSpeed(new SecureRandom().nextInt(dogMaxSpeed)).build();

        List<newAnimal> beforeRace = new ArrayList<>();
        beforeRace.add(eagle);
        beforeRace.add(snake);
        beforeRace.add(falcon);
        beforeRace.add(horse);
        beforeRace.add(tiger);
        beforeRace.add(dog);
//        System.out.println(beforeRace);

        List<newAnimal> race = new ArrayList<>();
        for (newAnimal checkAnimal : beforeRace) {
            if(checkAnimal.isFlyAlbe() == false){
                race.add(checkAnimal);
            }
        }
        System.out.println("Valid racing Animal: ");
        System.out.println(race);
        newAnimal winner = builder.isFlyAble(false).whatName("winner").build();

        for (newAnimal max : race) {
            if (max.getSpeed() > winner.getSpeed()){
                winner = max;
            }
        }
        System.out.println();
        System.out.println("Winner is: ");
        System.out.println(winner);

    }

}
