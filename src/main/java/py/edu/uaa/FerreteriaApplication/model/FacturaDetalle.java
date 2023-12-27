package py.edu.uaa.FerreteriaApplication.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class FacturaDetalle {
    @EmbeddedId
    private FacturaDetalleId id;

    @ManyToOne
    @MapsId("facturaId")
    private Factura factura;

    @ManyToOne
    private Producto producto;
    private Integer cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal importeTotalExenta;
    private BigDecimal importeTotalIva5;
    private BigDecimal importeTotalIva10;

    public FacturaDetalle() {
    }

    public FacturaDetalle(FacturaDetalleId id, Factura factura, Producto producto, Integer cantidad, BigDecimal precioUnitario, BigDecimal importeTotalExenta, BigDecimal importeTotalIva5, BigDecimal importeTotalIva10) {
        this.id = id;
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.importeTotalExenta = importeTotalExenta;
        this.importeTotalIva5 = importeTotalIva5;
        this.importeTotalIva10 = importeTotalIva10;
    }

    public FacturaDetalleId getId() {
        return id;
    }

    public void setId(FacturaDetalleId id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
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
}
