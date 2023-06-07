package com.example.weatherapp;

public class WeatherRVModal {

    private String time;
    private String tempreature;
    private String icon;
    private String windSpeed;


    public WeatherRVModal(String time, String tempreature, String icon, String windSpeed) {
        this.time = time;
        this.tempreature = tempreature;
        this.icon = icon;
        this.windSpeed = windSpeed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTempreature() {
        return tempreature;
    }

    public void setTempreature(String tempreature) {
        this.tempreature = tempreature;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }
}
