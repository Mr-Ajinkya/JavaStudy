package com.ajinkya;

/**
 * Created by lenovo on 5/21/2018.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        if (model.equals("carerra") || model.equals("maruti")){
            System.out.println("Valid model");
        }else{
            System.out.println("Unknown");
        }

        this.model = model;
    }
}
