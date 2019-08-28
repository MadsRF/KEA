package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ModelCar {
    @Id
    private int car_id;
    private String fuel_type;
    private String reg_nr;
    private String f_reg_date;
    private int odometer;

    public ModelCar() {
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getReg_nr() {
        return reg_nr;
    }

    public void setReg_nr(String reg_nr) {
        this.reg_nr = reg_nr;
    }

    public String getF_reg_date() {
        return f_reg_date;
    }

    public void setF_reg_date(String f_reg_date) {
        this.f_reg_date = f_reg_date;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
