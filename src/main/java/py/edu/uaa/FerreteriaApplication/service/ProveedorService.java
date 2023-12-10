package py.edu.uaa.FerreteriaApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.edu.uaa.FerreteriaApplication.app.exception.ResourceNotFoundException;
import py.edu.uaa.FerreteriaApplication.app.model.IEntityService;
import py.edu.uaa.FerreteriaApplication.model.Proveedor;
import py.edu.uaa.FerreteriaApplication.repository.ProveedorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService implements IEntityService<Proveedor, Long> {

    @Autowired
    private ProveedorRepository repository;

    @Override
    public List<Proveedor> findAll() {
        return repository.findAll();
    }

    @Override
    public Proveedor findById(Long id) {
        Optional<Proveedor> proveedorOptional;
        proveedorOptional = repository.findById(id);
        return proveedorOptional.orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public Proveedor create(Proveedor entity) {
        return repository.save(entity);
    }

    @Override
    public Proveedor update(Proveedor entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Proveedor entity) {
        repository.delete(entity);
    }
}
