package py.edu.uaa.FerreteriaApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.edu.uaa.FerreteriaApplication.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
