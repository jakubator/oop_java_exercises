package com.techreturners.cats;

public abstract class AbstractCat implements Cat {

    boolean isAsleep;
    int averageHeight;
    String setting;

    public void goToSleep(){
        isAsleep = true;
    }

    public void wakeUp(){
        isAsleep = false;
    }

    public boolean isAsleep() {
        return isAsleep;
    }

    public int getAverageHeight() {
        return averageHeight;
    };

    public String getSetting() {
        return setting;
    };

}