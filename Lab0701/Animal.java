package Lab0701;

public abstract class Animal {
    protected abstract boolean flyAble();

    private int speed;

    public Animal (int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

}
