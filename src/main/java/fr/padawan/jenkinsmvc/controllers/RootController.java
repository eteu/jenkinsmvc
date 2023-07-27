package fr.padawan.jenkinsmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
    @GetMapping()
    public String index() {

        return "index.html";
    }
}
