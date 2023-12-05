package py.edu.uaa.FerreteriaApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import py.edu.uaa.FerreteriaApplication.model.Agrupacion;
import py.edu.uaa.FerreteriaApplication.service.AgrupacionService;

import java.util.List;

@RestController
@RequestMapping("/api/agrupaciones")
public class AgrupacionController {

    @Autowired
    private AgrupacionService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Agrupacion> findAll(){
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Agrupacion create(@RequestBody Agrupacion agrupacion){
        return service.create(agrupacion);
    }

}
