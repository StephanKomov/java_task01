package com.example.java_task01;
import javafx.scene.paint.Color;
public class Imt_class {
    private double mass_p;
    private double rost_p;

    public Imt_class(){
        this.mass_p = 0;
        this.rost_p = 0;
    }

    public void setMass_p(String mass){
        mass_p = Double.parseDouble(mass);
    }
    public void setRost_p(String rost){
        rost_p = Double.parseDouble(rost);
    }
    public double getImt(){
        return (mass_p/(rost_p*rost_p)*10000);
    }

    public String toString(){
        return "ИМТ " + getImt();
    }
}
