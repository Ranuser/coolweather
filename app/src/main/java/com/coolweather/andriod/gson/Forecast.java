package com.coolweather.andriod.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xieti on 2018/5/28.
 */

public class Forecast {
    public String data;

    @SerializedName("tmp")
    public Temperture temperture;

    @SerializedName("cond")
    public More more;
    public class Temperture{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
