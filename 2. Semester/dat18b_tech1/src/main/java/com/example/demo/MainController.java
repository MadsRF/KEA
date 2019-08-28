package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/test")
    public String testMethod(){
        return "index";
    }

    @GetMapping("/about")
    public String aboutMethod(){
        return "About/index";
    }

    @GetMapping("/gallery")
    public String galleryMethod(){
        return "Gallery/index";
    }

    /*@GetMapping("/gallery/{id}")
    public String galleryViewMethod(@PathVariable("id") int id, Model model){
        model.addAttribute("gallery_id", id);
        return "Gallery/view";
    }*/

    @GetMapping("/gallery/{id}")
    public String galleryView(@PathVariable("id") int id, Model model) {

        // hvad sker der her?????
        List<String> names = new ArrayList<String>();
        names.add("Daniel");
        names.add("Louise");
        names.add("Karen");
        if(names.size() > id) {
            model.addAttribute("name", names.get(id));
        } else {
            model.addAttribute("name", "Personen findes ikke");
        }
        return "gallery/view";
    }

    @GetMapping("/new_images")
    public String galleryImageMethod(){
        return "Gallery/new_images";
    }

    @GetMapping("/home")
    public String homeMethod(){
        return "Home/index";
    }
}
