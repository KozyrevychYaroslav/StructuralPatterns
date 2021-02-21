package ai181.kozyrevych.facade;

public class WalkMood {
    private boolean mood = false;

    public boolean getMoodStatus() {
        return mood;
    }

    public void setGoodMood() {
        mood = true;
    }

    public void setBadMood() {
        mood = false;
    }
}
