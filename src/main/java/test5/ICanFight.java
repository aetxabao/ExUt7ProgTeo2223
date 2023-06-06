package test5;

public interface ICanFight {
    default void fight() {
        System.out.println("Zum!");
    }
}
