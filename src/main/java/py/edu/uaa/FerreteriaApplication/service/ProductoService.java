package py.edu.uaa.FerreteriaApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.edu.uaa.FerreteriaApplication.app.exception.ResourceNotFoundException;
import py.edu.uaa.FerreteriaApplication.app.model.IEntityService;
import py.edu.uaa.FerreteriaApplication.model.Producto;
import py.edu.uaa.FerreteriaApplication.repository.ProductoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IEntityService<Producto, Long> {

    @Autowired
    private ProductoRepository repository;

    @Override
    public List<Producto> findAll() {
        return repository.findAll();
    }

    @Override
    public Producto findById(Long id) {
        Optional<Producto> productoOptional;
        productoOptional = repository.findById(id);
        return productoOptional.orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public Producto create(Producto entity) {
        return repository.save(entity);
    }

    @Override
    public Producto update(Producto entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Producto entity) {
        repository.delete(entity);
    }
}
