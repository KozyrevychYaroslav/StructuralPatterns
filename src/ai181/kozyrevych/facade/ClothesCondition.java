package ai181.kozyrevych.facade;

public class ClothesCondition {
    private boolean clothesStatus;

    public boolean getClothesStatus() {
        return clothesStatus;
    }

    public void wearClothes() {
        clothesStatus = true;
    }

    public void undress() {
        clothesStatus = false;
    }

}
