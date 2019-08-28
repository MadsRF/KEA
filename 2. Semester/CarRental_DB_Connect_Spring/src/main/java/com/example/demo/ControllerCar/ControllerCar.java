package com.example.demo.ControllerCar;

import com.example.demo.Model.ModelCar;
import com.example.demo.Service.ServiceCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ControllerCar {
    @Autowired
    ServiceCar serviceCar;

    @GetMapping("/")
    public String index(){
        return "home/index";
    }

    @GetMapping("/createCar")
    public String create(){
        return "create/createCar";
    }
    @PostMapping("/createCar")
    public String create(@ModelAttribute ModelCar car){
        serviceCar.addCar(car);
        return "redirect:/";
    }

    @GetMapping("/deleteCar")
    public String delete(Model model){
        List<ModelCar> carList = serviceCar.fetchAll();
        model.addAttribute("cars", carList);
        return "delete/deleteCar";
    }

    @GetMapping("/deleteCar/{id}")
    public String delete(@PathVariable("id") int id){
        boolean deleted = serviceCar.deleteCar(id);
        if(deleted) {
            return "redirect:/deleteCar";
        }
        else{
            return "redirect:/deleteCar";
        }
    }

    @GetMapping("/updateCar")
    public String update(Model model){
        List<ModelCar> carList = serviceCar.fetchAll();
        model.addAttribute("cars", carList);
        return "update/updateCar";
    }


    @GetMapping("/updateSpecificCar/{id}")
    public String updateSpecific(@PathVariable("id") int id, Model model){
        model.addAttribute("car", serviceCar.findCarById(id));
        return "update/updateSpecificCar";
    }

    @PostMapping("/updateSpecificCar")
    public String updateSpecific(@ModelAttribute ModelCar car){
        serviceCar.updateCar(car.getCar_id(), car);
        return "redirect:/updateCar";
    }

    @GetMapping("/searchCar")
    public String search(Model model){
        List<ModelCar> carList = serviceCar.fetchAll();
        model.addAttribute("cars", carList);
        return "search/searchCar";
    }

    @GetMapping("/searchSpecificCar/{id}")
    public String searchSpecific(@PathVariable("id") int id, Model model){
        model.addAttribute("car", serviceCar.findCarById(id));
        return "search/searchSpecificCar";
    }

    @GetMapping("/help")
    public String help(){
        return "home/help";
    }


}
