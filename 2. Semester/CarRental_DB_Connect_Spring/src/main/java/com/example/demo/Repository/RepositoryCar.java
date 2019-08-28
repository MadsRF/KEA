package com.example.demo.Repository;

import com.example.demo.Model.ModelCar;
import com.example.demo.Service.ServiceCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.List;

@Repository
public class RepositoryCar {

    @Autowired
    JdbcTemplate template;

    public List<ModelCar> fetchAll() {
        String sql = "SELECT * FROM car";
        RowMapper<ModelCar> rowMapper = new BeanPropertyRowMapper<>(ModelCar.class);
        return template.query(sql, rowMapper);
    }

    public ModelCar addCar(ModelCar c){
        String sql = "INSERT INTO car(car_id, fuel_type, reg_nr, f_reg_date, odometer)VALUES(?,?,?,?,?)";
        template.update(sql, c.getCar_id(),c.getFuel_type(),c.getReg_nr(),c.getF_reg_date(),c.getOdometer());
        return null;
    }

    public Boolean deleteCar(int id){
        String sql = "DELETE FROM car WHERE car_id = ?";
        return template.update(sql, id) >0;
    }

    public ModelCar findCarById(int id){
        String sql = "SELECT * FROM car WHERE car_id = ?";
        RowMapper<ModelCar> rowMapper = new BeanPropertyRowMapper<>(ModelCar.class);
        ModelCar c = template.queryForObject(sql, rowMapper, id);
        return c;
    }

    public ModelCar updateCar(int id, ModelCar c){
        String sql = "UPDATE car SET car_id = ?, fuel_type = ?, reg_nr = ?, f_reg_date = ?, odometer = ? WHERE car_id = ?";
        template.update(sql, c.getCar_id(),c.getFuel_type(),c.getReg_nr(),c.getF_reg_date(),c.getOdometer(), id);
        return null;
    }

}