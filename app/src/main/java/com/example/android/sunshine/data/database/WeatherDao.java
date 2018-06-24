package com.example.android.sunshine.data.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.Date;
import java.util.List;

@Dao
public interface WeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void bulkInsert(WeatherEntry... weather);

    @Query("SELECT * FROM weather WHERE date = :date")
    LiveData<WeatherEntry> getWeatherByDate(Date date);

    @Query("SELECT COUNT(id) FROM weather where date >= :date")
    int countAllFurtherWeather(Date date);

    @Query("DELETE FROM weather WHERE date < :date")
    void deleteOldWeather(Date date);

    @Query("SELECT id, weatherIconId, date, max, min FROM weather WHERE date >= :date")
    LiveData<List<ListWeatherEntry>> getCurrentWeatherForecasts(Date date);
}
