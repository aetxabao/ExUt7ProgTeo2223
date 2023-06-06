package test6;


public class Main {
    public static void main(String[] args) {
        Ship s1 = new Ship();
        Ship s2 = new BattleShip();
        Ship s3 = new GhostShip();
        s1.update();
        s2.update();
        s3.update();
        System.out.println(s1.x);
        System.out.println(s2.x);
        System.out.println(s3.x);
        s3.update();
        System.out.println(s3.x);

    }
}
