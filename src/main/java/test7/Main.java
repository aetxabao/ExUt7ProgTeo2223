package test7;

public class Main {
    public static void main(String[] args) {
        Ship s1 = new Ship();
        s1.update();
        NavyShip s2 = new NavyShip();
        s2.update();
        s1 = s2;
        s1.update();
        GhostShip s4 = new GhostShip();
        Ship s3 = s4;
        s3.update();
        s4 = (GhostShip) s3;
        s4.update();
        System.out.println(s1.x + s2.x + s3.x + s4.x);
    }
}
