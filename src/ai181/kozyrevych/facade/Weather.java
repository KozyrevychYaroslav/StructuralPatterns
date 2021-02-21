package ai181.kozyrevych.facade;

public class Weather {
    private boolean warmly = false;

    public boolean getWeatherStatus() {
        return warmly;
    }

    public void setWarmWeather() {
        warmly = true;
    }

    public void setColdWeather() {
        warmly = false;
    }
}
