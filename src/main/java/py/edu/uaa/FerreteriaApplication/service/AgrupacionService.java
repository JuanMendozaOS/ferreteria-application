package py.edu.uaa.FerreteriaApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.edu.uaa.FerreteriaApplication.model.Agrupacion;
import py.edu.uaa.FerreteriaApplication.repository.AgrupacionRepository;

import java.util.List;

@Service
public class AgrupacionService {

    @Autowired
    private AgrupacionRepository agrupacionRepository;

    public List<Agrupacion> findAll(){
        return agrupacionRepository.findAll();
    }

    public Agrupacion create(Agrupacion entity) {
        return agrupacionRepository.save(entity);
    }


}
