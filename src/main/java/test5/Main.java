package test5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ICanFight> list = new ArrayList<>();
        list.add(new Cruise());
        list.add(new BattleShip());
        list.add(new NavyShip());
        list.add(new GhostShip());
        for (ICanFight ship : list) {
            ship.fight();
        }
    }
}
