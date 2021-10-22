package Lesson06;

import java.security.SecureRandom;

public class newAnimal {
    private final boolean flyAlbe;
    private final String name;
    private final int speed;

    private newAnimal(Builder builder) {
        flyAlbe = builder.flyAlbe;
        name = builder.name;
        speed = builder.speed;
    }


    public static class Builder{
        private boolean flyAlbe;
        private String name;
        private int speed;

        public Builder isFlyAble(boolean flyAlbe){
            this.flyAlbe = flyAlbe;
            return this;
        }

        public Builder whatName(String name){
            this.name = name;
            return this;
        }

        public Builder whatSpeed(int speed){
            this.speed = speed;
            return this;
        }

        public newAnimal build(){
            return new newAnimal(this);
        }
    }
    public boolean isFlyAlbe() {
        return flyAlbe;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "newAnimal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}' + '\n';
    }

}

