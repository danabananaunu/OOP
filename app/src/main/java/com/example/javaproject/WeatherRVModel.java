package com.example.javaproject;

public class WeatherRVModel {

    private String time;
    private String temperature;
    private String icon;
    private String windSpeed;

    public String getTime() {
        return time;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getIcon() {
        return icon;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public WeatherRVModel(String time, String temperature, String icon, String windSpeed) {
        this.time = time;
        this.temperature = temperature;
        this.icon = icon;
        this.windSpeed = windSpeed;
    }
}
