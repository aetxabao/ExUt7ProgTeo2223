package test2;

import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        ArrayList<ASprite> list = new ArrayList<>();
        list.add( new Ship(3, 2) );
        list.add( new Cruise(2, 0) );
        list.add( new Cruise(2, 4) );
        list.add( new Ship(2, 4) );
        for (ASprite sprite : list) { sprite.update(); }
        Collections.sort(list);
        for (ASprite sprite : list) { System.out.println(sprite.toString()); }
    }
}
