package Lab0701;

import java.security.SecureRandom;

public class Eagle extends Animal{
    @Override
    protected boolean flyAble() {
        return true;
    }
    private static final int MAX_SPEED = 120;
    public Eagle(){
        super(new SecureRandom().nextInt(MAX_SPEED));
    }
}

