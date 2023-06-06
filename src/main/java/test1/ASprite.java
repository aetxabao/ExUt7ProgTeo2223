package test1;

abstract class ASprite {

    int x;
    ASprite(){
        x = 50;
    }

    ASprite(int x){
        this.x = x;
    }

    abstract void update();

}
