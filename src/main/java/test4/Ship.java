package test4;

public class Ship implements Comparable<Ship> {
    int x;
    Ship(int x){
        this.x = x;
    }
    void update(int n) {
        x += n;
    }

    @Override
    public int compareTo(Ship other){
        return this.x - other.x;
    }
}
