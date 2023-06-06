package test3;

public class Ship {
    int n;
    int x;
    Ship(int n){
        this.n = n;
        this.x = 0;
    }
    void update() {
        x += n;
    }

    @Override
    public boolean equals(Object o) {
        return o != null && x == ((Ship)o).x;
    }

    @Override
    public int hashCode() {
        return x;
    }
}
