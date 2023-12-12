package py.edu.uaa.FerreteriaApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import py.edu.uaa.FerreteriaApplication.model.TipoDocumento;
import py.edu.uaa.FerreteriaApplication.service.TipoDocumentoService;

import java.util.List;

@RestController
@RequestMapping("api/tiposDocumento")
public class TipoDocumentoController {
    @Autowired
    private TipoDocumentoService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TipoDocumento> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TipoDocumento findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TipoDocumento create(@RequestBody TipoDocumento entity) {
        return service.create(entity);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public TipoDocumento update(@RequestBody TipoDocumento entity) {
        return service.update(entity);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestBody TipoDocumento entity) {
        service.delete(entity);
    }
}
