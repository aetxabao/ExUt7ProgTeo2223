package test0;

import java.util.ArrayList;

public class NavyShip extends Ship implements ICanShoot{
    @Override
    public ArrayList<AShot> shoot() {
        return new ArrayList<>();
    }
}
