package py.edu.uaa.FerreteriaApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.edu.uaa.FerreteriaApplication.app.model.IEntityService;
import py.edu.uaa.FerreteriaApplication.model.UnidadMedida;
import py.edu.uaa.FerreteriaApplication.repository.UnidadMedidaRepository;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;

@Service
public class UnidadMedidaService implements IEntityService<UnidadMedida, String> {

    @Autowired
    private UnidadMedidaRepository repository;

    @Override
    public List<UnidadMedida> findAll() {
        return repository.findAll();
    }

    @Override
    public UnidadMedida findById(String id) {
        Optional<UnidadMedida> unidadMedidaOptional;
        unidadMedidaOptional = repository.findById(id);
        return unidadMedidaOptional.orElseThrow(ResolutionException::new) ;
    }

    @Override
    public UnidadMedida create(UnidadMedida entity) {
        return repository.save(entity);
    }

    @Override
    public UnidadMedida update(UnidadMedida entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(UnidadMedida entity) {
        repository.delete(entity);
    }
}
