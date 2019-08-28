package com.example.demo.Service;

import com.example.demo.Model.ModelCar;
import com.example.demo.Repository.RepositoryCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ServiceCar {

    @Autowired
    RepositoryCar repoCar;

    public List<ModelCar> fetchAll(){
        return repoCar.fetchAll();
    }

    public ModelCar addCar(ModelCar c){
        return repoCar.addCar(c);
    }

    public Boolean deleteCar(int id){
        return repoCar.deleteCar(id);
    }

    public ModelCar findCarById(int id){return repoCar.findCarById(id);}

    public ModelCar updateCar(int id, ModelCar c){
        return repoCar.updateCar(id, c);
    }

}



