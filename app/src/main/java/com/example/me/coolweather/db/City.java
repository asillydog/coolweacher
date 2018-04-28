package com.example.me.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport{

    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getcityName(){
        return cityName;
    }

    public void setProvinceName(String cityName){
        this.cityName = cityName;
    }

    public int getCityCode(){
        return  cityCode;
    }

    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }

    public int getProvinceId(){
        return provinceId;
    }

    public void setProvinceCode(int procinceId){
        this.provinceId = provinceId;
    }
}

