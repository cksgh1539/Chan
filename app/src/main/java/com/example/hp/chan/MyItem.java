package com.example.hp.chan;

/**
 * Created by hp on 2017-10-15.
 */

public class MyItem {
    private String Address;
    private String Number;
    private String Time;


    public MyItem(String Address,String Number,String Time){
        this.Address = Address;
        this.Number = Number;
        this.Time = Time;
    }

    public String getAddress(){
        return  Address;
    }
    public String getNumber(){
        return  Number;
    }
    public String getTime(){
        return  Time;
    }
}
