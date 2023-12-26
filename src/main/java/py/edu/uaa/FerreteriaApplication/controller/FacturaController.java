package py.edu.uaa.FerreteriaApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import py.edu.uaa.FerreteriaApplication.model.Factura;
import py.edu.uaa.FerreteriaApplication.service.FacturaService;

import java.util.List;

@RestController
@RequestMapping("api/facturas")
public class FacturaController {

    @Autowired
    private FacturaService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Factura> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Factura findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Factura create(@RequestBody Factura entity) {
        return service.create(entity);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Factura update(@RequestBody Factura entity) {
        return service.update(entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestBody Long id) {
        service.delete(id);
    }

}
