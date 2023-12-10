package py.edu.uaa.FerreteriaApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import py.edu.uaa.FerreteriaApplication.model.Producto;
import py.edu.uaa.FerreteriaApplication.service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("api/productos")
public class ProductoController {
    @Autowired
    private ProductoService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Producto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Producto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Producto create(@RequestBody Producto entity) {
        return service.create(entity);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Producto update(@RequestBody Producto entity) {
        return service.update(entity);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestBody Producto entity) {
        service.delete(entity);
    }

}

