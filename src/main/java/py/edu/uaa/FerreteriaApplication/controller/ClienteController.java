package py.edu.uaa.FerreteriaApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import py.edu.uaa.FerreteriaApplication.model.Cliente;
import py.edu.uaa.FerreteriaApplication.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente entity) {
        return service.create(entity);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Cliente update(@RequestBody Cliente entity) {
        return service.update(entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestBody Long id) {
        service.delete(id);
    }

}
