package com.projeto.ecomerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalController {

    @GetMapping("/admin")
    public String mainAccess() {
        return "admin/index";
    }
}