package py.edu.uaa.FerreteriaApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.edu.uaa.FerreteriaApplication.app.exception.ResourceNotFoundException;
import py.edu.uaa.FerreteriaApplication.app.model.IEntityService;
import py.edu.uaa.FerreteriaApplication.model.Agrupacion;
import py.edu.uaa.FerreteriaApplication.repository.AgrupacionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AgrupacionService implements IEntityService<Agrupacion, Integer> {

    @Autowired
    private AgrupacionRepository agrupacionRepository;

    @Override
    public List<Agrupacion> findAll() {
        return agrupacionRepository.findAll();
    }

    @Override
    public Agrupacion findById(Integer id) {
        Optional<Agrupacion> agrupacionOptional;
        agrupacionOptional = agrupacionRepository.findById(id);
        return agrupacionOptional.orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public Agrupacion create(Agrupacion entity) {
        return agrupacionRepository.save(entity);
    }

    @Override
    public Agrupacion update(Agrupacion agrupacion) {
        return agrupacionRepository.save(agrupacion);
    }

    @Override
    public void delete(Agrupacion agrupacion) {
        agrupacionRepository.delete(agrupacion);
    }
}
