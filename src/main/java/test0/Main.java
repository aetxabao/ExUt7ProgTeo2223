package test0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("-".repeat(80));
        imagen1();
        System.out.println("-".repeat(80));
        codigo1();
        System.out.println("-".repeat(80));
        codigo2();
        System.out.println("-".repeat(80));
        codigo3();
        System.out.println("-".repeat(80));
    }

    private static void imagen1() {
//        Cruise cruise = new Ship();
        Ship navyShip = new NavyShip();
        ASprite ball = new Ball();
        ICanDisappear ghostShip = new GhostShip("Yamato");
    }

    private static void codigo1() {
        List<ICanShoot> list = new ArrayList<>();
        list.add( new GhostShip("Yamato") );
        list.add( new NavyShip() );
        list.add( new BattleShip() );
//        list.add( (ICanShoot) new Cruise() );
        list.add( new ICanShoot() {
            @Override
            public ArrayList<AShot> shoot() { return new ArrayList<>(); }
        });
        list.add( () -> new ArrayList<>() );
        ArrayList<AShot> shots = new ArrayList<>();
        for ( ICanShoot s : list ) { shots.addAll( s.shoot() ); }
//        for ( ICanShoot s : list ) { System.out.println( ((Ship)s).nombre ); }
    }

    private static void codigo2() {
        List<Ship> list = new ArrayList<>();
        list.add( new GhostShip("Yamato") );
        list.add( new NavyShip() );
        list.add( new BattleShip() );
        list.add( new Cruise() );
        list.add( new Ship() );
//        Collections.sort(list);
        Collections.sort(list, new Comparator<Ship>() {
            @Override
            public int compare(Ship o1, Ship o2) {
                return -1 * o1.nombre.compareTo(o2.nombre);
            }
        });
        Collections.sort(list, (o1, o2) -> o1.nombre.compareTo(o2.nombre));
        Collections.reverse(list);
        for ( Ship s : list ) { System.out.println( ((Ship)s).nombre ); }
    }

    private static void codigo3() {
        List<Ship> list = new ArrayList<>();
        list.add( new GhostShip("Yamato") );
        list.add( new NavyShip() );
        list.add( new BattleShip() );
        list.add( new Cruise() );
        list.add( new Ship() );
        for ( Ship s : list ) {
            if (s instanceof ICanShoot) {
                System.out.println( ((Ship)s).nombre );
            }
        }
    }

}
