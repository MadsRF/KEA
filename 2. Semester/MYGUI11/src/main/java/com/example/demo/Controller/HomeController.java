package com.example.demo.Controller;

import com.example.demo.Controller.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return"home/index";
    }

    @Controller
    public class TestController {
        @GetMapping("test")
        public String index() {
            return "home/test";
        }
    }

    @Controller
    public class Test2Controller {
        @GetMapping("test2")
        public String index() {
            return "home/test2";
        }
    }



    //oprettelse af og visning af objekt
@PostMapping("/personData")
    public String personData(@ModelAttribute Person person, Model model){

        model.addAttribute("mads", person);

        return "home/personData";
    }


    //oprettelse og visning af String
    /*@PostMapping("/personData")
    public String personData(WebRequest wr, Model model){
        String firstName = wr.getParameter("fname");
        String lastName = wr.getParameter("lname");

        model.addAttribute("first_name", firstName);
        model.addAttribute("last_name", lastName);
        return "home/personData";
    }*/
}