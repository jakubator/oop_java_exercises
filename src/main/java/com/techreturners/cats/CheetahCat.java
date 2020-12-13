package com.techreturners.cats;

public class CheetahCat extends AbstractCat {

    public CheetahCat(){
        this.setting = "wild";
        this.isAsleep = false;
        this.averageHeight = 1300;
    }

    public String eat(){
        return "Zzzzzzz";
    }

}