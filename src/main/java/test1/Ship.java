package test1;

class Ship extends ASprite {

    int n = 5;

    Ship(){
        super(0);
    }

    Ship(int n){
        this.n = n;
    }
    @Override
    void update() {
        x += n;
    }
}
