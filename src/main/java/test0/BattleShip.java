package test0;

import java.util.ArrayList;

public class BattleShip extends Ship implements ICanShoot{

    @Override
    public void update() {

    }

    @Override
    public ArrayList<AShot> shoot() {
        return new ArrayList<>();
    }

}
