package com.projeto.ecomerce.controller;

import com.projeto.ecomerce.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {

    @Autowired
    private StateRepository stateRepository;


}
