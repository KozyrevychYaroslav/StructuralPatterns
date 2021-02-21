package ai181.kozyrevych.test;


import ai181.kozyrevych.facade.ClothesCondition;
import ai181.kozyrevych.facade.WalkFacade;
import ai181.kozyrevych.facade.WalkMood;
import ai181.kozyrevych.facade.Weather;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class FacadeTest {
    Weather weather;
    WalkMood walkMood;
    ClothesCondition clothesCondition;

    @BeforeEach
    public void config() {
        weather = new Weather();
        walkMood = new WalkMood();
        clothesCondition = new ClothesCondition();
    }

    @Test
    @DisplayName("Checking ClothesCondition class")
    public void clothesCondition() {
        assertFalse(clothesCondition.getClothesStatus());
        clothesCondition.wearClothes();
        assertTrue(clothesCondition.getClothesStatus());
        clothesCondition.undress();
        assertFalse(clothesCondition.getClothesStatus());
    }

    @Test
    @DisplayName("Checking Weather class")
    public void weatherCondition() {
        assertFalse(weather.getWeatherStatus());
        weather.setWarmWeather();
        assertTrue(weather.getWeatherStatus());
        weather.setColdWeather();
        assertFalse(weather.getWeatherStatus());
    }

    @Test
    @DisplayName("Checking WalkMood class")
    public void walkMood() {
        assertFalse(walkMood.getMoodStatus());
        walkMood.setGoodMood();
        assertTrue(walkMood.getMoodStatus());
        walkMood.setBadMood();
        assertFalse(walkMood.getMoodStatus());
    }

    @Test
    @DisplayName("Checking WalkFacade class")
    public void walkFacade() {
        WalkFacade facade = new WalkFacade(clothesCondition, walkMood, weather);
        assertFalse(facade.walkController());
        facade.setWalkStatus(true);
        assertTrue(facade.walkController());
        facade.setWalkStatus(false);
        assertFalse(facade.walkController());
    }

}
