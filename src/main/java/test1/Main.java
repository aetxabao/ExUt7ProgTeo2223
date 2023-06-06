package test1;

import java.util.ArrayList;

class Main {
     public static void main(String[] args) {
        ArrayList<ASprite> list = new ArrayList<>();
        list.add( new Ship() );
        list.add( new Cruise() );
        list.add( new Ship(10) );
        list.add( new Cruise(10) );
        for (ASprite sprite : list) { sprite.update(); }
        for (ASprite sprite : list) { System.out.printf(sprite.x + " "); }
    }
}
