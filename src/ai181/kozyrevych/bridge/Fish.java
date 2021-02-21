package ai181.kozyrevych.bridge;

public class Fish implements Animal {

   private MoveMode moveMode;

    public Fish(MoveMode moveMode) {
        this.moveMode = moveMode;
    }

    @Override
    public void moveMode() {
        moveMode.showMoveMode();
    }


}
