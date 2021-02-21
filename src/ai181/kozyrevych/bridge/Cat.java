package ai181.kozyrevych.bridge;

public class Cat implements Animal {

    private MoveMode moveMode;

    public Cat(MoveMode moveMode) {
        this.moveMode = moveMode;
    }

    @Override
    public void moveMode() {
        moveMode.showMoveMode();
    }
}
