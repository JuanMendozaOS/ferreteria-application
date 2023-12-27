package py.edu.uaa.FerreteriaApplication.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;

    @ManyToOne
    private Cliente cliente;

    private BigDecimal importeTotalExenta;
    private BigDecimal importeTotalIva5;
    private BigDecimal importeTotalIva10;
    private BigDecimal importeTotalComprobante;

    @Enumerated(EnumType.STRING)
    private Condicion condicionPago;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<FacturaDetalle> detalles;

    public Factura() {
    }

    public Factura(Long id, LocalDate fecha, Cliente cliente, BigDecimal importeTotalExenta, BigDecimal importeTotalIva5, BigDecimal importeTotalIva10, BigDecimal importeTotalComprobante, Condicion condicionPago, List<FacturaDetalle> detalles) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.importeTotalExenta = importeTotalExenta;
        this.importeTotalIva5 = importeTotalIva5;
        this.importeTotalIva10 = importeTotalIva10;
        this.importeTotalComprobante = importeTotalComprobante;
        this.condicionPago = condicionPago;
        this.detalles = detalles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getImporteTotalExenta() {
        return importeTotalExenta;
    }

    public void setImporteTotalExenta(BigDecimal importeTotalExenta) {
        this.importeTotalExenta = importeTotalExenta;
    }

    public BigDecimal getImporteTotalIva5() {
        return importeTotalIva5;
    }

    public void setImporteTotalIva5(BigDecimal importeTotalIva5) {
        this.importeTotalIva5 = importeTotalIva5;
    }

    public BigDecimal getImporteTotalIva10() {
        return importeTotalIva10;
    }

    public void setImporteTotalIva10(BigDecimal importeTotalIva10) {
        this.importeTotalIva10 = importeTotalIva10;
    }

    public BigDecimal getImporteTotalComprobante() {
        return importeTotalComprobante;
    }

    public void setImporteTotalComprobante(BigDecimal importeTotalComprobante) {
        this.importeTotalComprobante = importeTotalComprobante;
    }

    public Condicion getCondicionPago() {
        return condicionPago;
    }

    public void setCondicionPago(Condicion condicionPago) {
        this.condicionPago = condicionPago;
    }

    public List<FacturaDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<FacturaDetalle> detalles) {
        this.detalles = detalles;
    }
}
