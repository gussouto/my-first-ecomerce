package com.projeto.ecomerce.controller;

import com.projeto.ecomerce.model.State;
import com.projeto.ecomerce.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StateController {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping("/registerstate")
    public ModelAndView register(State state) {
        ModelAndView mv = new ModelAndView("admin/state/register");
        mv.addObject("state", state);
        return mv;
    }

    @PostMapping("/savestate")
    public ModelAndView save(State state, BindingResult result) {
        if (result.hasErrors()) {
            return register(state);
        }
        stateRepository.saveAndFlush(state);
        return register(new State());
    }


}
