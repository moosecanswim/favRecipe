package me.moosecanswim.favrecip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/cornbread")
    public String cornbread(){
        return "cornbread";
    }
    @GetMapping("/crabcakes")
    public String crabcakes(){
        return "crabcakes";
    }
    @GetMapping("/gingerale")
    public String gingerale(){
        return "gingerale";
    }
}
