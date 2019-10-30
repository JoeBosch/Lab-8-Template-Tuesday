package com.example.simpleparadox.listycity;

public class City implements Comparable<City>{
    private String city;
    private String province;
    private double latitude;
    private double longitude;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    City(String city, String province, double latitude, double longitude) {
        this(city, province);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    double distanceTo(City city) {
        return Math.sqrt(Math.pow(this.longitude - city.longitude,2)-Math.pow(this.latitude - city.latitude,2));
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        return city.compareTo(o.getCityName());
    }
}
