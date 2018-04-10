package com.example.huangmin.takehomeassignment08_minh;

/**
 * Created by huangmin on 18/4/9.
 */

public class Time {

    public int showName;
    public int availableTime;
    public int showPhotoId;
    public boolean stillAvailable;

    public int getShowPhotoId() {
        return showPhotoId;
    }

    public void setShowPhotoId(int showPhotoId) {
        this.showPhotoId = showPhotoId;
    }


    public int getShowName() {
        return showName;
    }

    public void setShowName(int showName) {
        this.showName = showName;
    }

    public int getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(int availableTime) {
        this.availableTime = availableTime;
    }

    public boolean isStillAvailable() {
        return stillAvailable;
    }

    public void setStillAvailable(boolean stillAvailable) {
        this.stillAvailable = stillAvailable;
    }


    public Time(int showName, int availableTime, int showPhotoId, boolean stillAvailable) {
        this.showName = showName;
        this.availableTime = availableTime;
        this.showPhotoId = showPhotoId;
        this.stillAvailable = stillAvailable;
    }
}
