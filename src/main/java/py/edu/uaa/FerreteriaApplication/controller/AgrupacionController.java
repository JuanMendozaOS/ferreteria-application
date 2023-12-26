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
    public List<Agrupacion> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Agrupacion findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Agrupacion create(@RequestBody Agrupacion agrupacion) {
        return service.create(agrupacion);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Agrupacion update(@RequestBody Agrupacion agrupacion) {
        return service.update(agrupacion);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
