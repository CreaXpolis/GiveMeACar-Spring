package fr.franck.givemeacartest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.franck.givemeacartest.model.Stock;

@Controller
public class HelloController {

    Stock stockG = new Stock();

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView hello = new ModelAndView();
        hello.setViewName("index");
        return hello;
    }

    @GetMapping("/stock")
    public ModelAndView stock() {
        ModelAndView yo = new ModelAndView();
        yo.setViewName("stock");
        yo.addObject("stock", new Stock());
        return yo;
    }


}
