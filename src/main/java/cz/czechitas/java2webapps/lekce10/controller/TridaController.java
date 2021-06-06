package cz.czechitas.java2webapps.lekce10.controller;


import cz.czechitas.java2webapps.lekce10.entity.Student;
import cz.czechitas.java2webapps.lekce10.repository.TridaRepository;
import cz.czechitas.java2webapps.lekce10.service.TridaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TridaController {

    private final TridaService tridaService;

    @Autowired
    public TridaController(TridaService tridaService) {
        this.tridaService = tridaService;
    }

    @GetMapping("/")
    public ModelAndView seznamTrid() {
        return new ModelAndView("index")
                .addObject("tridy", tridaService.seznamTrid());
    }

    @GetMapping("/{id}")
    public Object jednaTrida(@PathVariable short id) {
        return new ModelAndView("trida")
                .addObject("jednaTrida", tridaService.jednaTrida(id));
    }

    @GetMapping( "/{id}/{id}")
    public Object jedenStudent(@PathVariable Integer id) {
        return new ModelAndView("student")
                .addObject("jedenStudent", tridaService.jedenStudent(id));
    }

}
