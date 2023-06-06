package test2;

public abstract class ASprite implements Comparable<ASprite> {

    int x;

    abstract void update();

    @Override
    public int compareTo(ASprite other){
        return this.x - other.x;
    }
    @Override
    public String toString(){
        String s = super.toString();
        int i = s.lastIndexOf(".");
        s = s.substring(i+1);
        int j = s.indexOf("@");
        return s.substring(0, j+1) + x;
    }
}
