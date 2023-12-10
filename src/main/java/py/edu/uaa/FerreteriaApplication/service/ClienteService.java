package py.edu.uaa.FerreteriaApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.edu.uaa.FerreteriaApplication.app.exception.ResourceNotFoundException;
import py.edu.uaa.FerreteriaApplication.app.model.IEntityService;
import py.edu.uaa.FerreteriaApplication.model.Cliente;
import py.edu.uaa.FerreteriaApplication.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IEntityService<Cliente, Long> {

    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> findAll() {
        return repository.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        Optional<Cliente> clienteOptional;
        clienteOptional = repository.findById(id);
        return clienteOptional.orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public Cliente create(Cliente entity) {
        return repository.save(entity);
    }

    @Override
    public Cliente update(Cliente entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Cliente entity) {
        repository.delete(entity);
    }
}
