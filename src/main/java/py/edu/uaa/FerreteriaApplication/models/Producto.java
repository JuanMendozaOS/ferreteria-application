package py.edu.uaa.FerreteriaApplication.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Producto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private String descripcion;
  private Integer stockMinimo;
  private BigDecimal precioCompra;
  private BigDecimal precioVenta;
  private Integer tipoIva; // TODO: Investigar enums
  @ManyToOne
  private UnidadMedida unidadMedida;
  @ManyToOne
  private Agrupacion agrupacion;

  public Producto() {
  }

  public Producto(Long id, String nombre, String descripcion, Integer stockMinimo, BigDecimal precioCompra, BigDecimal precioVenta, Integer tipoIva, UnidadMedida unidadMedida, Agrupacion agrupacion) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.stockMinimo = stockMinimo;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.tipoIva = tipoIva;
    this.unidadMedida = unidadMedida;
    this.agrupacion = agrupacion;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Integer getStockMinimo() {
    return stockMinimo;
  }

  public void setStockMinimo(Integer stockMinimo) {
    this.stockMinimo = stockMinimo;
  }

  public BigDecimal getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(BigDecimal precioCompra) {
    this.precioCompra = precioCompra;
  }

  public BigDecimal getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(BigDecimal precioVenta) {
    this.precioVenta = precioVenta;
  }

  public Integer getTipoIva() {
    return tipoIva;
  }

  public void setTipoIva(Integer tipoIva) {
    this.tipoIva = tipoIva;
  }

  public UnidadMedida getUnidadMedida() {
    return unidadMedida;
  }

  public void setUnidadMedida(UnidadMedida unidadMedida) {
    this.unidadMedida = unidadMedida;
  }

  public Agrupacion getAgrupacion() {
    return agrupacion;
  }

  public void setAgrupacion(Agrupacion agrupacion) {
    this.agrupacion = agrupacion;
  }
}
