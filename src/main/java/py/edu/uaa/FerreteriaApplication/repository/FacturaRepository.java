package py.edu.uaa.FerreteriaApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import py.edu.uaa.FerreteriaApplication.model.Cliente;
import py.edu.uaa.FerreteriaApplication.model.Factura;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {

    @Query(value = "SELECT f FROM Factura f WHERE f.cliente = ?1 AND f.fecha >= ?2 AND f.fecha <= ?3")
    List<Factura> consultaVenta(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin);

}
