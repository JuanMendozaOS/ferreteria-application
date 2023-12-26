package py.edu.uaa.FerreteriaApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.edu.uaa.FerreteriaApplication.app.exception.ResourceNotFoundException;
import py.edu.uaa.FerreteriaApplication.app.model.IEntityService;
import py.edu.uaa.FerreteriaApplication.model.TipoDocumento;
import py.edu.uaa.FerreteriaApplication.repository.TipoDocumentoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDocumentoService implements IEntityService<TipoDocumento, String> {

    @Autowired
    private TipoDocumentoRepository repository;

    @Override
    public List<TipoDocumento> findAll() {
        return repository.findAll();
    }

    @Override
    public TipoDocumento findById(String id) {
        Optional<TipoDocumento> tipoDocumentoOptional;
        tipoDocumentoOptional = repository.findById(id);
        return tipoDocumentoOptional.orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public TipoDocumento create(TipoDocumento entity) {
        return repository.save(entity);
    }

    @Override
    public TipoDocumento update(TipoDocumento entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
