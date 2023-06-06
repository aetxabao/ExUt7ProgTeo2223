package test0;

import java.util.ArrayList;

public class GhostShip extends Ship implements ICanDisappear, ICanShoot{

    public GhostShip(String nombre) {
        super();
        this.nombre += "-" + nombre;
    }


    @Override
    public void update() {

    }

    @Override
    public void setVisibility(boolean b) {

    }

    @Override
    public boolean getVisibility() {
        return false;
    }

    @Override
    public ArrayList<AShot> shoot() {
        return new ArrayList<>();
    }
}
