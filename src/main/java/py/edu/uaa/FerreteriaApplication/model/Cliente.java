package py.edu.uaa.FerreteriaApplication.model;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String razonSocial;
    private String numeroDocumento;
    private String direccion;
    private String telefono;
    private String numeroCelular;

    @ManyToOne
    private TipoDocumento tipoDocumento;
    @ManyToOne
    private TipoCliente tipoCliente;

    public Cliente() {
    }

    public Cliente(Long id, String razonSocial, String numeroDocumento, String direccion, String telefono, String numeroCelular, TipoDocumento tipoDocumento, TipoCliente tipoCliente) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.numeroDocumento = numeroDocumento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numeroCelular = numeroCelular;
        this.tipoDocumento = tipoDocumento;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String razonSocial, String nroDocumento, String direccion, String telefono, String nroCelular, TipoDocumento tipoDocumento, TipoCliente tipoCliente) {
        this.razonSocial = razonSocial;
        this.numeroDocumento = nroDocumento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numeroCelular = nroCelular;
        this.tipoDocumento = tipoDocumento;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(Long id) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return  razonSocial;
    }
}
