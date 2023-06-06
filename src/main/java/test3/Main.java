package test3;

import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<Ship> ships = new HashSet<>();
        ships.add(new Ship(2));
        ships.add(new Ship(4));
        ships.add(new Ship(3));
        Ship ship = new Ship(2);
        ship.update();
        ships.add(ship);
        System.out.println(ships.size());
    }
}
