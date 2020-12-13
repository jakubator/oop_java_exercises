package com.techreturners.cats;

public class DomesticCat extends AbstractCat {

    public DomesticCat(){
        this.setting = "domestic";
        this.isAsleep = false;
        this.averageHeight = 23;
    }

    public String eat(){
        if(Math.random() <1)
            return "Purrrrrrr";
        else 
            return "It will do I suppose";
    }

    public void run() {};

}