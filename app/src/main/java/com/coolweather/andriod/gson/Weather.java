package com.coolweather.andriod.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by xieti on 2018/5/28.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
