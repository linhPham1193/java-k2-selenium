package Lab0701;

import java.security.SecureRandom;

public class Tiger extends Animal{
    @Override
    protected boolean flyAble() {
        return false;
    }
    private static final int MAX_SPEED = 100;
    public Tiger(){
        super(new SecureRandom().nextInt(MAX_SPEED));
    }
}

