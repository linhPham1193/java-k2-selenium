package Lab0701;

import java.security.SecureRandom;

public class Dog extends Animal{
    @Override
    protected boolean flyAble() {
        return false;
    }
    private static final int MAX_SPEED = 60;
    public Dog(){
        super(new SecureRandom().nextInt(MAX_SPEED));
    }
}
