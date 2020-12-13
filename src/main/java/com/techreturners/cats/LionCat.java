package com.techreturners.cats;

public class LionCat extends AbstractCat {

    public LionCat() {
        this.setting = "wild";
        this.isAsleep = false;
        this.averageHeight = 1100;
    }

    public String eat(){
        return "Roar!!!!";
    }

    public void run() {
        // TODO
    }
}