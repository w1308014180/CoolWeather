package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("cid")
    public String weatherId;

    public Update update;

    @SerializedName("location")
    public String CityName;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
