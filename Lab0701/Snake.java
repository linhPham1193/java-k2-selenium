package Lab0701;

import java.security.SecureRandom;

public class Snake extends Animal{
    @Override
    protected boolean flyAble() {
        return false;
    }
    private static final int MAX_SPEED = 70;
    public Snake(){
        super(new SecureRandom().nextInt(MAX_SPEED));
    }
}
