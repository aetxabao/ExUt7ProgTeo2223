package test4;

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet<Ship> ships = new TreeSet<>();
        ships.add(new Ship(4));
        ships.add(new Ship(2));
        Ship ship = new Ship(2);
        ship.update(2);
        ships.add(ship);
        ships.add(new Ship(3));
        for (Ship s : ships) {
            System.out.print(s.x + " ");
        }

    }
}
