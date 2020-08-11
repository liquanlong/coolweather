package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {
    private int d;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getD() {
        return d;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
