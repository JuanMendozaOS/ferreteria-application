package py.edu.uaa.FerreteriaApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import py.edu.uaa.FerreteriaApplication.model.TipoCliente;
import py.edu.uaa.FerreteriaApplication.service.TipoClienteService;

import java.util.List;

@RestController
@RequestMapping("api/tiposCliente")
public class TipoClienteController {
    @Autowired
    private TipoClienteService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TipoCliente> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TipoCliente findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TipoCliente create(@RequestBody TipoCliente entity) {
        return service.create(entity);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public TipoCliente update(@RequestBody TipoCliente entity) {
        return service.update(entity);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestBody TipoCliente entity) {
        service.delete(entity);
    }
}
