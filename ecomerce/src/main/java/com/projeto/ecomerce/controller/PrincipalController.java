package com.projeto.ecomerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

    @GetMapping("/admin")
    public String mainAccess() {
        return "admin/home";
    }
}