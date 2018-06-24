package com.example.android.sunshine.data.database;

import java.util.Date;

public class ListWeatherEntry {
    private int id;
    private int weatherIconId;
    private Date date;

    public void setId(int id) {
        this.id = id;
    }

    public void setWeatherIconId(int weatherIconId) {
        this.weatherIconId = weatherIconId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public void setMax(double max) {
        this.max = max;
    }

    private double min;
    private double max;

    public int getId() {
        return id;
    }

    public int getWeatherIconId() {
        return weatherIconId;
    }

    public Date getDate() {
        return date;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

}

