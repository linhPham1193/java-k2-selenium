package Lab0701;

import java.security.SecureRandom;

public class Horse extends Animal{
    @Override
    protected boolean flyAble() {
        return false;
    }
    private static final int MAX_SPEED = 80;
    public Horse(){
        super(new SecureRandom().nextInt(MAX_SPEED));
    }
}