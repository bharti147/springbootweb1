package com.sb.SpringbootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
       System.out.println("Home method called");
        return "index";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int num, int num2, Model model){
        System.out.println("Add method called");

        int result = num + num2;
        model.addAttribute("result", result);
        return "result";
    }
}
