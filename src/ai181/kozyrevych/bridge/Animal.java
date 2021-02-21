package ai181.kozyrevych.bridge;

public interface Animal {

    default void moveMode() {
        System.out.println("Animal move mode");
    }

}
