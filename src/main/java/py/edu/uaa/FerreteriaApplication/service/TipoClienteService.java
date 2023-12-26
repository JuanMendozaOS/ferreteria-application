package py.edu.uaa.FerreteriaApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.edu.uaa.FerreteriaApplication.app.exception.ResourceNotFoundException;
import py.edu.uaa.FerreteriaApplication.app.model.IEntityService;
import py.edu.uaa.FerreteriaApplication.model.TipoCliente;
import py.edu.uaa.FerreteriaApplication.repository.TipoClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TipoClienteService implements IEntityService<TipoCliente, String> {

    @Autowired
    private TipoClienteRepository repository;

    @Override
    public List<TipoCliente> findAll() {
        return repository.findAll();
    }

    @Override
    public TipoCliente findById(String id) {
        Optional<TipoCliente> tipoClienteOptional;
        tipoClienteOptional = repository.findById(id);
        return tipoClienteOptional.orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public TipoCliente create(TipoCliente entity) {
        return repository.save(entity);
    }

    @Override
    public TipoCliente update(TipoCliente entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
