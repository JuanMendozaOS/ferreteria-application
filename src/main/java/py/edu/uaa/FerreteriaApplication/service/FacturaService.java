package py.edu.uaa.FerreteriaApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.edu.uaa.FerreteriaApplication.app.exception.ResourceNotFoundException;
import py.edu.uaa.FerreteriaApplication.app.model.IEntityService;
import py.edu.uaa.FerreteriaApplication.model.Cliente;
import py.edu.uaa.FerreteriaApplication.model.ConsultaVentaRequest;
import py.edu.uaa.FerreteriaApplication.model.Factura;
import py.edu.uaa.FerreteriaApplication.repository.FacturaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService implements IEntityService<Factura, Long> {

    private final FacturaRepository repository;
    private final ClienteService clienteService;

    @Autowired
    public FacturaService(FacturaRepository repository, ClienteService clienteService) {
        this.repository = repository;
        this.clienteService = clienteService;
    }

    @Override
    public List<Factura> findAll() {
        return repository.findAll();
    }

    @Override
    public Factura findById(Long id) {
        Optional<Factura> facturaOptional;
        facturaOptional = repository.findById(id);
        return facturaOptional.orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public Factura create(Factura entity) {
        return repository.save(entity);
    }

    @Override
    public Factura update(Factura entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Factura> consultaVenta(ConsultaVentaRequest request) {
        Cliente cliente = clienteService.findById(request.getClienteId());
        return repository.consultaVenta(cliente, request.getFechaInicio(), request.getFechaFin());
    }
}
