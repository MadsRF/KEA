package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.sql.*;
import java.util.*;


@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://dat18btest.c05hgqj3acev.us-east-2.rds.amazonaws.com:3306/dat18b", "datTest", "mads1234");
        Statement stmt = con.createStatement();
        String selectSql = "SELECT * FROM test";
        ResultSet resultSet = stmt.executeQuery(selectSql);

        List<String> employees = new ArrayList<>();

        while (resultSet.next()) {
            employees.add(resultSet.getString("idtest")+" "+resultSet.getString("name"));
        }

        model.addAttribute("employees", employees);

        return "index";
    }


}
