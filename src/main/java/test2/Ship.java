package test2;

public class Ship extends ASprite {
    int n;
    Ship(int n, int x){
        this.n = n;
        this.x = x;
    }
    @Override
    void update() {
        x += n;
    }
}
