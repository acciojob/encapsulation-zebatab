package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //obj.name = "Kunal";
        obj.setName("Kunal");
        obj.getName();
    }
}