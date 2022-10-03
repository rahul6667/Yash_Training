package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexContrller {

	
	

    @RequestMapping(value="/login", method = RequestMethod.GET)
   // @ResponseBody
    public String showLoginPage(ModelMap model){
        return "homepage";
    }
}
