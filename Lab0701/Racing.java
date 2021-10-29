package Lab0701;

import java.util.ArrayList;
import java.util.List;

public class Racing {

    private static Animal validAnimal(List<Animal> animalList) {
        List<Animal> validAnimalList = new ArrayList<>();
        for (Animal animal : animalList) {
            if (animal.flyAble() == false)
                validAnimalList.add(animal);
        }
        System.out.println();
        System.out.println("Valid animal list: "+ validAnimalList);

        Animal winner = null;
        if (validAnimalList.isEmpty())
            System.out.println("there is no animals");

        for (Animal validAnimal : validAnimalList) {
            if (winner == null){
                winner = validAnimal;
            }else {
                if (validAnimal.getSpeed() > winner.getSpeed()){
                    winner = validAnimal;
                }
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        Animal eagle = new Eagle();
        Animal horse = new Horse();
        Animal snake = new Snake();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(tiger);
        animalList.add(dog);
        animalList.add(eagle);
        animalList.add(horse);
        animalList.add(snake);

        for (Animal animal : animalList) {
            System.out.println(animal.getClass() + " with speed: " + animal.getSpeed());
        }

        Animal winner = Racing.validAnimal(animalList);
        System.out.println();
        System.out.println("Winner is: " + winner.getClass() + " with speed: " + winner.getSpeed());

    }



}
