package com.freshvotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashBoardController {

    @RequestMapping(value = "/",  method = RequestMethod.GET)
    public String rootView(){
        return "index";
    }

    @GetMapping(value = "/dashboard")
    public String dashboardView() {
        return "dashboard";
    }
}
