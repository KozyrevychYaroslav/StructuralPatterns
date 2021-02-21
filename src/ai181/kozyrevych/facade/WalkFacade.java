package ai181.kozyrevych.facade;

public class WalkFacade {
    private ClothesCondition clothesCondition;
    private WalkMood walkMood;
    private Weather weather;

    public WalkFacade(ClothesCondition clothesCondition, WalkMood walkMood, Weather weather) {
        this.clothesCondition = clothesCondition;
        this.walkMood = walkMood;
        this.weather = weather;
    }

    public boolean walkController() {
        if (clothesCondition.getClothesStatus() == walkMood.getMoodStatus() &&
                walkMood.getMoodStatus() == weather.getWeatherStatus() && weather.getWeatherStatus()) {
            System.out.println("We go for a walk");
            return true;
        }
        System.out.println("We don't go for a walk");
        return false;
    }

    public void setWalkStatus(boolean walkStatus) {
        if (walkStatus) {
            clothesCondition.wearClothes();
            weather.setWarmWeather();
            walkMood.setGoodMood();
        } else {
            clothesCondition.undress();
            weather.setColdWeather();
            walkMood.setBadMood();
        }
    }
}
