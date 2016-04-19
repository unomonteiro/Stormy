package io.monteirodev.stormy.weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import io.monteirodev.stormy.R;

public class Current {
    private String mIcon;
    private long mTime;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private double mTemperature;
    private String mTimeZone;

    public String getIcon() {
        return mIcon;
    }
    public int getIconId(){
return Forecast.getIconId(mIcon);
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getTime() {
        return mTime;
    }
    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a", Locale.UK);
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date dateTime = new Date(getTime() * 1000);

        return formatter.format(dateTime);
    }

    public void setTime(long time) {
        mTime = time;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getPrecipChance() {
        double precipPercentage = mPrecipChance * 100;
        return (int)Math.round(precipPercentage);
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public int getTemperature() {
        return (int) Math.round(mTemperature);
    }

    public int getTemperatureInCelcious() {
        return (int) Math.round(((mTemperature - 32)*5)/9);
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }
}
