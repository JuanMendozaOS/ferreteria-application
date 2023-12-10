package py.edu.uaa.FerreteriaApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import py.edu.uaa.FerreteriaApplication.model.UnidadMedida;
import py.edu.uaa.FerreteriaApplication.service.UnidadMedidaService;

import java.util.List;

@RestController
@RequestMapping("api/unidadesMedida")
public class UnidadMedidaController {

    @Autowired
    private UnidadMedidaService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UnidadMedida> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UnidadMedida findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UnidadMedida create(@RequestBody UnidadMedida entity) {
        return service.create(entity);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public UnidadMedida update(@RequestBody UnidadMedida entity) {
        return service.update(entity);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestBody UnidadMedida entity) {
        service.delete(entity);
    }

}
